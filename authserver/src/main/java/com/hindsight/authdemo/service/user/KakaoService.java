package com.hindsight.authdemo.service.user;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hindsight.authdemo.advice.exception.CComunicationException;
import com.hindsight.authdemo.model.social.KakaoProfile;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import javax.print.DocFlavor;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class KakaoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RestTemplate restTemplate;
    private final Environment env;
    private final Gson gson;

    @Value("${spring.url.base}")
    private String baseUrl;
    @Value("${spring.social.kakao.client_id}")
    private String kakaoClientId;
    @Value("${spring.social.kakao.redirect}")
    private String kakaoRedirect;
    @Value("${spring.social.kakao.url.token}")
    private String kakaoTokenUrl;
    @Value("${spring.social.kakao.client_secret}")
    private String kakaoSecret;
    @Value("${spring.social.kakao.url.profile}")
    private String kakaoProfileUrl;

    public KakaoProfile getKakaoProfile(String accessToken){
        //    요청하는 클라이언트마다 가진 정보가 다를 수 있기에 HashMap타입으로 선언
        KakaoProfile userInfo = new KakaoProfile();
        String reqURL = "https://kapi.kakao.com/v2/user/me";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            //    요청에 필요한 Header에 포함될 내용
            conn.setRequestProperty("Authorization", "Bearer " + accessToken);

            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

//            JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
//            JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();

             long Uid =  element.getAsJsonObject().get("id").getAsLong();
//            String gender = kakao_account.getAsJsonObject().get("gender").getAsString();
            System.out.println(Uid);
//            System.out.println(gender);
            userInfo.setUid(Uid);
//            userInfo.setGender(gender);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userInfo;
//        //header : Content-type: application/x-www-form-urlencoded
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        headers.set("Authorization", "Bearer " + accessToken);
//
//        //set http entity
//        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(null, headers);
//        try{
//            // Request profile
//            ResponseEntity<String> response = restTemplate.postForEntity(kakaoProfileUrl, request, String.class);
//            if(response.getStatusCode() == HttpStatus.OK)
//                return gson.fromJson(response.getBody(), KakaoProfile.class);
//        }catch(Exception e){
//            throw new CComunicationException();
//        }
//        throw new CComunicationException();
    }

    public String reKakaoAccessToken(String refreshToken){

        // HttpHeader 오브젝트 생성
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers =new HttpHeaders();
        headers.add("Content-type","application/x-www-form-urlencoded;charset=utf-8");
        // HttpBody 오브젝트 생성
        MultiValueMap<String,String> param = new LinkedMultiValueMap<>();
        param.add("grant_type","refresh_token");
        param.add("client_id","8e53809b2827c367b5aa27ac70dfd124");
        param.add("refresh_token",refreshToken);

        // HttpHeader와 HttpBody를 하나의 오브젝트에 담기
        HttpEntity<MultiValueMap<String,String>> kakaoTokenRequest= new HttpEntity<>(param,headers);

        // Http 요청하기 - Post방식으로
        ResponseEntity<String> response = rt.exchange(
                "kauth.kakao.com/oauth/token",
                HttpMethod.POST,
                kakaoTokenRequest,
                String.class
        );

        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(String.valueOf(response));

        String accessToken = element.getAsJsonObject().get("access_token").getAsString();

        return  accessToken;
    }



    // 성공적으로 받아온 code로 사용자 토큰 받기
    public Map<String ,String> getAccessToken (String authorize_code) {

        String reqURL = "https://kauth.kakao.com/oauth/token";

        Map<String, String> map = new HashMap<>();
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=dea07b77c50fd259ffad8bbe6d94165b");
            sb.append("&redirect_uri=http://localhost:8081/v1/auth/usercheck");
            sb.append("&client_secret=iCCyLX3QZxCgwF1CSZfQ5fmMDZhkUgaa");
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();

            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);

            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            String access_Token = element.getAsJsonObject().get("access_token").getAsString();
            String refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();

            map.put("accessToken", access_Token);
            map.put("refreshToken",refresh_Token);

            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return map;
    }

//    public long logout(long uid) {
//
//        String reqURL = "https://kapi.kakao.com/v1/user/logout";
//        try {
//
//            URL url = new URL(reqURL);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            String admin ="926ce1072cf2ecfe402e75f24a9ab3ef";
//            //    요청에 필요한 Header에 포함될 내용
//            conn.setRequestProperty("Authorization", "KakaoAK " + admin);
//
//            conn.setDoOutput(true);
//
//            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
//            StringBuilder sb = new StringBuilder();
//            sb.append("target_id_type=user_id");
//            sb.append("&target_id="+uid);
//            bw.write(sb.toString());
//            bw.flush();
//
//            int responseCode = conn.getResponseCode();
//            String msg=conn.getResponseMessage();
//
//            System.out.println("responseCode : " + responseCode);
//            System.out.println("msg : " + msg);
//
//
//            String line = "";
//            String result = "";
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//
//            while ((line = br.readLine()) != null) {
//                result += line;
//            }
//            System.out.println("response body : " + result);
//
//        }catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return 11;
//
//    }


}
