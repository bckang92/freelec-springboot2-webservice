package com.kbc.personalPjt.springboot.web.dto;

import com.kbc.personalPjt.springboot.domain.posts.Posts;

public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto (Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
