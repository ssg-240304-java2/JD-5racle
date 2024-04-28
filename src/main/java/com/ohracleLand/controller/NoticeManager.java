package com.ohracleLand.controller;

import com.ohracleLand.model.dto.NoticeDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeManager {
    private ArrayList<NoticeDTO> noticeList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addInitData() {
        noticeList.add(new NoticeDTO("test1", "testContent1", 0, "kyungho"));
        noticeList.add(new NoticeDTO("test2", "testContent2", 1, "kyungho"));
        noticeList.add(new NoticeDTO("test3", "testContent3", 2, "kyungho"));
        noticeList.add(new NoticeDTO("test4", "testContent4", 3, "kyungho"));
    }

    public void printNoticeList() {

        for (NoticeDTO s : noticeList) {
            System.out.println(s.toString());
        }

    }

    public void view_notice() {
        while (true) {
            printNoticeList();
            System.out.println("0 : 뒤로               1 : 글쓰기");

            switch (sc.nextInt()) {
                case 0:
                    return;
                case 1:
                    postNotice(/* UserDTO isAdim */);
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
            }
        }
    }

    public void postNotice() {

    }

}