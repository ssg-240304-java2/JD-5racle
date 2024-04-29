package com.ohracleLand.model.dto;

import java.util.Date;

public class LostAndFoundDTO {
    public static int lostListNo = 1;

    private int lostNo;
    private String lostTitle;
    private String lostWriter;
    private String lostLocation;
    private String lostItem;
    private String lostFeature;
    
    public LostAndFoundDTO(){}

    public LostAndFoundDTO(int lostNo, String lostTitle, String lostWriter, String lostLocation, String lostItem, Date date) {
        this.lostNo = lostNo;
        this.lostTitle = lostTitle;
        this.lostWriter = lostWriter;
        this.lostLocation = lostLocation;
        this.lostItem = lostItem;
    }

    public int getLostNo() {
        return lostNo;
    }

    public void setLostNo(int lostNo) {
        this.lostNo = lostNo;
    }

    public String getLostTitle() {
        return lostTitle;
    }

    public void setLostTitle(String lostTitle) {
        this.lostTitle = lostTitle;
    }

    public String getLostWriter() {
        return lostWriter;
    }

    public void setLostWriter(String lostWriter) {
        this.lostWriter = lostWriter;
    }

    public String getLostLocation() {
        return lostLocation;
    }

    public void setLostLocation(String lostLocation) {
        this.lostLocation = lostLocation;
    }

    public String getLostItem() {
        return lostItem;
    }

    public void setLostItem(String lostItem) {
        this.lostItem = lostItem;
    }

    public String getLostFeature() {
        return lostFeature;
    }

    public void setLostFeature(String lostFeature) {
        this.lostFeature = lostFeature;
    }

    @Override
    public String toString() {
        return "########=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=########\n" +
                lostNo + "  " + lostTitle +
                "\n작성자 : " + lostWriter +
                "\n------------------------------------------------" +
                "\n분 실 물 : " + lostItem +
                "\n분실위치 : " + lostLocation +
                "\n특징 [ " + lostFeature +
                " ]\n------------------------------------------------" +
                "\n########=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=########";
    }
}
