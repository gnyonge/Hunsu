package com.project.hunsu.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Valid
@ToString
public class OotdMainDTO {
    private Long ootdIdx; //ootd에서 가져오기
    private String nickname; //ootd에서 가져오기
    private String ootdContent; //ootd에서 가져오기
    private List<String> hashtagContent = new ArrayList<>(); //hashtag에서 가져오기
    public void addHashtag(String hashtag){
        this.hashtagContent.add(hashtag);
    }
    private int ootdLike;//ootd에서 가져오기

    public OotdMainDTO() {
    }
}