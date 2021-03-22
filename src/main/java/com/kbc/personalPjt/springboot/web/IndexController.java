package com.kbc.personalPjt.springboot.web;

import com.kbc.personalPjt.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());

        System.out.println(postsService.findAllDesc());
        //index.mustache 연결
        return "index";
    }

    @GetMapping("posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("posts/update")
    public String postsUpdate(){
        return "posts-update";
    }
}
