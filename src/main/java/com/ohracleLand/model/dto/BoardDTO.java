package com.ohracleLand.model.dto;

public class BoardDTO {

    private String user;

    private String title;

    private String content;

    private int no;

    public BoardDTO() {
    }

    public BoardDTO(String user, String title, String content, int no) {
        this.user = user;
        this.title = title;
        this.content = content;
        this.no = no;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        no = no;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "user='" + user + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", no=" + no +
                '}';
    }
}
