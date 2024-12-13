package com.mozi.crud;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostRestController {

    @GetMapping("/posts")
    public String findAll() {
        Post post = new Post("Mozi", "test", "2024-12-13");
        return "게시글 전체 조회 요청\n" + post;
    }

    @GetMapping("/posts/{postId}")
    public String findOne(@PathVariable(name = "postId") int id) {
        return "게시글 하나 조회 요청 id: " + id;
    }

    @PostMapping("/posts")
    public String createOne(@RequestBody Post request) {
        System.out.println("request.getUserName() = " + request.getUserName());
        System.out.println("request.getText() = " + request.getText());
        System.out.println("request.getDateOfWrite() = " + request.getDateOfWrite());
        return "게시글 생성";
    }

    @PutMapping("/posts/{postId}")
    public String updateOne(@PathVariable(name = "postId") int id) {
        return "게시글 수정 요청 id: " + id;
    }

    @DeleteMapping("/posts/{postId}")
    public String deleteOne(@PathVariable(name = "postId") int id) {
        return "게시글 삭제 요청 id: " + id;
    }
}
