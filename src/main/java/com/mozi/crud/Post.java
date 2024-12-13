package com.mozi.crud;

public class Post {
    private String userName;
    private String text;    // 게시글 내용
    private String dateOfWrite;

    public Post(String userName, String text, String dateOfWrite) {
        this.userName = userName;
        this.text = text;
        this.dateOfWrite = dateOfWrite;
    }

    public String getUserName() {
        return userName;
    }

    public String getText() {
        return text;
    }

    public String getDateOfWrite() {
        return dateOfWrite;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userName='" + userName + '\'' +
                ", text='" + text + '\'' +
                ", dateOfWrite='" + dateOfWrite + '\'' +
                '}';
    }
}
