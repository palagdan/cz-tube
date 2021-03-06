package com.palagdan.cztube.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Data
@Document(value = "Video")
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer dislikes;
    private Set<String> tags;
    private VideoStatus videoStatus;
    private String videoUrl;
    private Integer videoCount;
    private String thumbnailUrl;
    private List<Comment> commentList;
}
