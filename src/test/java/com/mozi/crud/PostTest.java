package com.mozi.crud;

import org.junit.jupiter.api.Test;

public class PostTest {
    @Test
    void printPostTest() {
        Post post = new Post("Mozi", "test", "2024-12-13");
        System.out.println(post);
    }
}
