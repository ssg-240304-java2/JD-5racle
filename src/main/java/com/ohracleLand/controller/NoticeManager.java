package com.ohracleLand.controller;

import com.ohracleLand.model.dto.NoticeDTO;
import com.ohracleLand.view.InputNotice;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeManager {
    private ArrayList<NoticeDTO> noticeList = new ArrayList<>();
    InputNotice in = new InputNotice();
    Scanner sc = new Scanner(System.in);

    boolean isAdmim = true; // 관리자계정 기능구현 x 추후 미니프로젝트시 추가예정

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
            if (isAdmim) {
                adminNoticeView();
            } else {
                userNoticeView();
            }
            System.out.print("메뉴를 선택해 주세요 : ");

            switch (sc.nextInt()) {
                case 0:
                    return;
                case 1:
                    postNotice();
                    System.out.println("새 공지사항이 등록되었습니다.");
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
            }
        }
    }

    public void adminNoticeView() {
        System.out.println("0 : 뒤로       1:글쓰기 2:수정 3:삭제");
    }

    public void userNoticeView() {
        System.out.println("0 : 뒤로");
    }

    public void postNotice() {
        noticeList.add(in.InputNotice());
    }

}