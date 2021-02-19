# Hunsu

## 👩‍👩‍👧‍👧팀원소개

---

![Hunsu_7289ec50d5c844b186f3790918aae505](/uploads/d1d00032ebf25149369a30522640075f/Hunsu_7289ec50d5c844b186f3790918aae505.png)

## 🏃‍♂️역할 분담

---

**한 재 희** 

- [프론트엔드] 실채훈
- [팀장] 스케줄 관리

**고 유 창**

- [백엔드] OOTD  구현,  WebSocket 기반의 멀티채팅 서비스인 '실채훈' 구현
- [UCC] UCC제작

**박 홍 균**

- [백엔드] 뭘입을까 구현,  마이페이지  구현
- [AWS] S3 요금 납부★★★

**정 보 현**

- [백엔드] 인증 서버 구현 , 인증 필터
- Readme 작성

**이 지 현**

- [프론트엔드] 뭘입을까
- 최종발표😍

**최 진 영**

- [프론트엔드] OOTD
- [프론트엔드] 전체적인 디자인

## 🎈프로젝트 정보

---

- **진행 기간** : 2021. 01.06 ~ 2021.02.19
- **Daily Scrum :** 매일 오전 수업 직후 30분
- **프로젝트 설명**

    '패션' 이라는 주제로 소통의 장을 열 수 있는

    데일리 착장을 공유할 수 있는

    중요한 자리에 입고갈 스타일을 조언받을 수 있는  

    👉***대한민국 1등 '패션 모바일 웹'👈***

## 🚩 개발 목표

---

> 빠르게 변화하는 패션 트렌드에  사람들과 소통할 수 있는 패션 모바일 웹사이트

![Hunsu_7289ec50d5c844b186f3790918aae505_1](/uploads/29c293d25b16ea803a46cea022fb30ce/Hunsu_7289ec50d5c844b186f3790918aae505_1.png)

- **소통을 위한 공간 ( 실 채 훈 )**
- **공유를 위한 공간 ( Ootd )**
- **투표 및 평가를 위한 공간 ( 뭘 입을까? )**

## ⏲진행 상황

---

[Hunsu_b4f860e548464a6cb662b9758d5eb089.csv](/uploads/d2a1c9199ea39a4d03dfe1456b497d52/Hunsu_b4f860e548464a6cb662b9758d5eb089.csv)

## ⚙ 기술 stack

---

![기술스택](/uploads/68c410023a6f6306ac3a10ac637cc8a0/기술스택.png)

**프론트엔드**

- Vue
- Vuetify
- Vuex

**백엔드**

- Spring Boot
- Spring Security
- Swagger
- Stomp
- redis

**협업툴**

- Webex
- Jira
- GitLab

**Server**

- NGINX
- S3
- EC2

## 🖇 ERD

---

![erd](/uploads/4a96405b7a97b2628476d19c9732d7e4/erd.png)

**[ ERD 파일 첨부 ]**

[hunsu.mwb](Hunsu%207289ec50d5c844b186f3790918aae505/hunsu.mwb)

## 📜프로젝트 구성도

---

![2](/uploads/46af90a12368d77f6db063f595a159fe/2.png)

## 🌟 주요기능

---

### 1. #Ootd

> *해시태그 기능과 이미지 업로드 기능으로 나의 착장을 사람들과 공유하는 공간*

- 기능
    - 최신순 / 인기순 정렬
    - 해시태그 검색
    - 글 작성 가능
    - 무한 스크롤 기능
    - 유저 프로필 표시
    - 이미지 업로드 가능
    - 좋아요 기능
    - 댓글, 대댓글 작성 가능

### 2. 뭘입을까?

> *투표 기능을 제공하여 여러 스타일에 대한 사용자들의 의견을 들어보는 공간*

- 기능
    - 이미지 업로드 가능
    - 업로드 된 사진 좌우 슬라이드로 제공
    - 투표기능 ( 중복체크 가능, 중복 투표 불가 )
    - 투표결과 차트 반영
    - 댓글, 대댓글 작성 가능
    - 댓글 수정 삭제 가능
    - 좋아요 기능

### 3. 실채훈 ( 실시간 채팅 훈수 )

> *채팅 서비스를 제공하여 실시간으로 다른 사용자들에게 조언을 구하는 공간*

- 기능
    - 실시간 라이브 채팅방 개설 가능
    - 이미지 업로드 가능
    - 동시 접속자 수 표시
    - 채팅 개설자 프로필 확인 가능

## 📍기본기능

---

### 1. 마이 페이지

> *팔로우, 팔로워를 확인할 수 있고, 나의 게시물을 확인할 수 있는 공간*

- 기능
    - 팔로워 리스트 확인
    - 팔로잉 리스트 확인
    - 프로필 수정
    - 로그아웃 가능
    - 좋아요 누른 게시물 확인, 디테일로 이동 가능
    - 작성한 Ootd 게시물 확인, 디테일로 이동 가능

### 2. 인증

> 사용자의 이전 접속여부를 통해 자동 로그인, 로그인 유지 기능 및 기능의 제한

- 기능
    - JWT토큰 발급
    - JWT토큰 유효 시 자동 로그인
    - 서비스 접근 시 유효성 검사
    - 토큰 만료 시, 재발급 및 재 로그인 유도

    **[ Hunsu ] 의 인증 프로세스**

    ![인증서버](/uploads/17183acc5f04d6030de68614077d11d8/인증서버.png)

## 🎬 페이지 정보

---

### 1. 메인 화면

![메인1](/uploads/9c92c91cd2b5dc68ad357372ecd3ebbd/메인1.PNG)

- OOtd에서 가장 많은 좋아요를 받은 게시물을 홈화면에 배치

### 2. OOTD

![ootd1](/uploads/57a508d78445f7b769b09cf18de52467/ootd1.PNG)

- 이미지 업로드 기능

![ootd2](/uploads/378556da5cc8f632afc7f9f3b914b330/ootd2.PNG)

- 댓글, 대댓글 및 좋아요 기능

### 3. 뭘입을까?

![뭘입을까1](/uploads/70693982a7c1b3de98791625e5ef7cd6/뭘입을까1.png)

- 이미지 업로드 기능, 투표기능을 활용한

        게시물 작성

![뭘입을까2](/uploads/6c16727f19b717aeebb7a5c66a3810a4/뭘입을까2.png)

- 댓글, 대댓글 및 좋아요 기능

### 4. 실채훈 ( 실시간 채팅 훈수 )

![실채훈](/uploads/0925c89273721f45a379479e6c06670f/실채훈.PNG)

- 이미지 업로드 기능
- 실시간 채팅기능
- 좋아요 기능

### 5. 마이 페이지

![마이페이지](/uploads/83ce65062f38e7d58a4c741b787b152b/마이페이지.PNG)

- 팔로워, 팔로잉 확인가능
- 내가 올린 OOTD게시물 전체 확인 가능
- 좋아요한 게시물 확인가능
- 프로필 수정가능

## 🎞UCC

---

[SSAFY Hunsu UCC](https://youtu.be/NuHlRht_yJ0)

## 📢 **발표자료**

---

[HUNSU발표최종.pdf](Hunsu%207289ec50d5c844b186f3790918aae505/HUNSU.pdf)

# 🥇프로젝트 후기

---

**한 재 희**

한줄평으로 '모르는 것이 많아 겁이 없었다'는 말이 생각납니다. 프로젝트 초기 기획서에 적혀있던 수많은 기술 스택과 기능이 무색하게 결과 보고서에는 몇 개 남지 않은 기술 스택과 미처 구현하지 못한 기능들이 눈에 아른거립니다. 처음 만나는 팀원들과 처음 진행해보는 본격적인 프로젝트.. 초기 회의에서 아는 척하며 늘어놓았던 구상들과 일정들.. 팀원들에게 미안함이 많이 남고 그만큼 아쉬움도 많이 남는 프로젝트입니다. 제 자신이 알고 있다고 생각했던 것들을 되돌아 보는 계기가 되었고, 그럼에도 불구하고 프로젝트를 잘 끝낼 수 있었던 것은 반복되는 일정 수정과 번복에도 참고 따라와 준 팀원들 덕분이라고 생각합니다. 다음 프로젝트에서 만날땐 더 강해져서 돌아올게요!

**고 유 창**

이번에 처음으로 제대로된 '프로젝트'를 수행해본거 같다는 생각이 듭니다. 주제 선정부터 와이어프레임, 그리고 db설계, 마무리로 코딩 까지... 다들 끝까지 함께 열심히 해줘서 감사하게 생각하고 있습니다. 

이번 프로젝트를 마무리하면서 내 자신이 얻어갈 수 있는 최고의 이득은 '커뮤니케이션'과 '직무관련경험' 이라고 뽑고 싶습니다.

프로젝트 기간동안 수많은 에러가 발생하였습니다. 버전관리 도중 깃 충돌, JIRA관리 미흡 등등 팀원들과의 소통이 부족해서 일어난 문제라고 생각합니다. 하지만 하나 둘씩 고쳐나가면 점점 발전해 나갈 수 있었고 꾸준한 커뮤니케이션을 통해 팀은 진정한 '하나'가 되어서 성공적으로 마무리 할 수 있었다고 생각합니다.

또한, 이번만큼 실무에 가까운 경험은 처음이였고 정말 소중한 경험으로 남을 거같습니다. 막연하게 생각했던 버전관리 부터 세세한거 까지 전부 모두 실무에서 적용되는 사항이라는 점에서 무엇과도 바꿀수 없는 직무 경험으로 남을 거같습니다. 

이런 소중한 경험들을 토대로 더욱 발전하는 개발자가 되겠습니다.

 

**박 홍 균**

아이디어 회의를 통해 아이디어를 선정하고 기능 명세 이후 그 기능들을 어떤식으로 구현하면 되겠다는 생각으로 만든 데이터베이스 구조 및 api 명세서가 기능에 대한 이해의 차이, 구현상의 어려움 또는 기능 변경 등으로 인해 지속적으로 변경되며 그것을 수정하는데 많은 시간을 소요했습니다. 

그부분에서 시간을 줄였다면 더 많은 기능에 시간을 투자할수 있었을텐데 라는 아쉬움이 있었고 정확한 기능명세 및 구조를 제대로 짜는것이 얼마나 중요한지를 느꼈습니다.

변경이 많아 기능 구현을 다 할 수 있을까 걱정했지만 팀원 각자 책임감을 갖고 프로젝트를 진행하는 모습을 보며 저도 힘을 낼수 있었고 프로젝트에서 팀분위기가 얼마나 중요한지를 알수 있었습니다. 팀원분들 모두 고생 많으셨습니다!

**정 보 현**

한 달 반이라는 시간동안 아이디어 기획부터 DB설계 및 개발까지 모든 것을 경험해 볼 수 있는 특별한 경험이었던 것 같습니다.

처음 프로젝트 구상할 때 까지만 해도 끝이 안보이고 막막했는데, 하나씩 기능을 만들다 보니 기획이 구체화되며 흥미를 느낄 수 있었습니다.

특히 현재 서비스되고 있는 다양한 기능들을 따라 만들어보며 개발자의 길로 한걸음 더 나아간 것 같은 기분이 들었습니다.

또한, 이번 프로젝트를 통해 '협업'의 진정한 의미를 알게되었습니다.
이해하기 힘들거나, 모르는 부분이 생겼을 때 함께 상의하고 공부해준 팀원들 덕분에 프로젝트를 무사히 마칠 수 있었다고 생각합니다.

마지막으로, 늦게 합류한 저를 잘 적응할 수 있게 도와주신 팀원들에게 감사합니다. 그동안 수고많으셨습니다 !!🥰 인증서버도 안녕!!! 

**이 지 현**

코린이 8개월 차... 2번째 개발 프로젝트!

Django-Vue로 둘이서 진행했던 프로젝트와 다르게 이번 프로젝트를 진행하면서 많은 걸 배우고 느꼈습니다.

개발 1~2주, 하루종일 열띤 토론 끝에 선정한 주제와 카카오오븐에서 열심히 작업한 와이어프레임이 엎어질 때 마음이 넘 아팠지만 계획 초기에 더 신중하게 많은 점을 고려해야 한다는 것을 이렇게 또 배웠습니다. 평소에 아이디어를 자주 생각해본다던지 디자인도 많이 보고 공부해둘 걸 하고 후회 많이 했습니다.

6명이 모여 백엔드, 프론트엔드 역할을 나누어 프로젝트를 진행하면서 협업과 소통이 정말 중요하다는 것을 깨달았습니다. 이번에 스웨거를 처음 사용해보았는데 백엔드와 소통이 정말 중요하다는 점!

'?? : 값이 안오는 것 같아요 홍균님'

항상 친절하게 답변해주신 홍균님 정말 감사했습니다. 어쩔 땐 저의 vue코드가 문제였는데도 웃으며 넘어가 주시는 홍균님😂

지난 프로젝트에서는 vuex를 사용하지 않았지만, 이번엔 vuex를 사용해보며 많이 배웠습니다. Eventbus, async, await 모두 이번에 새로 배운 내용입니다. 재희님 코드 보면서 많이 배웠습니다. 재희님 정말 감사해요

Vue 막힐 때마다 친절하게 도와주신 진영님, 재희님.. 소통없는 분위기 였다면 혼자 기능구현하기 쉽지 않았을 거에요 감사했습니다.

이번 프로젝트를 마치며 제일 아쉬운 점은 디자인! 더 예쁘게, 완성도 높게 구현하고 싶었는데 기능 구현하느라 시간이 부족했던 게 너무나도 아쉽습니다.(부족한 제 실력.. 더 강해져서 오겠습니다.) 아쉬웠던 점을 생각하며 다음 프로젝트 땐 더 좋은 결과물로 찾아올게요

재희님, 유창님, 홍균님, 보현님, 진영님 덕분에 정말 정말 재밌게 프로젝트 진행했습니다. 6주동안 행복했습니다. 21년도를 좋은 사람들과 시작할 수 있어서 행복했어요. 소중한 인연 감사히 생각하며 잊지 않을게요!! 모두모두 수고 하셨습니다❤

**최 진 영**

처음부터 끝까지 프로젝트를 마무리하는게 역시나 쉽지않다고 느꼈습니다! 하지만 저의 부족한 부분을 팀원님들이 알려주시고 채워주셔서 팀워크의 중요성도 느낄 수 있었고 즐겁게 프로젝트에 집중할 수 있었던 것 같습니다. 

Vue.js를 프로젝트에서 써본게 처음인데 이번 프로젝트를 통해서 조금 더 익숙해졌고 아직 배우고 공부할 것들이 많이 남았지만 더 공부하고 싶다라는 생각이 들었습니다!! 

평소에 만들어보고싶다고 생각만했던 아이디어를 직접 만들려고하니 생각했던 것과 다른 부분들이 많이 생겼었는데 자유로운 팀분위기 속에서 팀원님들의 다양한 의견들이 모여서 하나씩 보완되어가는걸 보고 이래서 팀분위기가 중요하구나 라는 것을 느낄 수 있었습니다:) 

훈수만든 2조 다들 수고하셨습니다😄

