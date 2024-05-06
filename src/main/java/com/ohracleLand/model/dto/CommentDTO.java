package com.ohracleLand.model.dto;

public class CommentDTO {
    private int no;
    private int noticeNo;
    private String content;
    private String user_id;

    private static int cnt = 0;
    public CommentDTO() {
    }

    public CommentDTO(int noticeNo, String content, String user_id) {
        this.no = ++cnt;
        this.noticeNo = noticeNo;
        this.content = content;
        this.user_id = user_id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "no=" + no +
                ", noticeNo=" + noticeNo +
                ", content='" + content + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
