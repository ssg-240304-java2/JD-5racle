package com.ohracleLand.model.dto;

public class NoticeDTO {
    private int no;
    private String title;
    private String content;
    private int views;
    private String user_name;

    private static int cnt = 0;

    public NoticeDTO() {
    }

    public NoticeDTO(String title, String content, int views, String user_name) {
        this.no = ++cnt;
        this.title = title;
        this.content = content;
        this.views = views;
        this.user_name = user_name;
    }

    public void setNo(){
        this.no = ++cnt;
    }

    public int getNo() {
        return no;
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

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", views=" + views +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}