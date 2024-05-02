package com.ohracleLand.model.dto;

public class VoiceBoardDTO {

    private String user;

    private String title;

    private String content;

    private int no;

    public VoiceBoardDTO() {
    }

    public VoiceBoardDTO(String user, String title, String content, int no) {
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
        return "=-=-=-=-=-=-=-=-=-=-=--=-=VOC 게시판=-=-=-=-=-=-=-=-=-=-=-=-=-= \n" +
                "\n작성자 : " + user  +
                "\n 제목 : " + title +
                "\n  "  + content +
                "\n 게시판 번호 =" + no +
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
                }
    }

//    return "########=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=########\n" +
//    lostNo + "  " + lostTitle +
//            "\n작성자 : " + lostWriter +
//            "\n------------------------------------------------" +
//            "\n분 실 물 : " + lostItem +
//            "\n분실위치 : " + lostLocation +
//            "\n특징 [ " + lostFeature +
//            " ]\n------------------------------------------------" +
//            "\n########=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=########";

