package com.ohracleLand.view;

import com.ohracleLand.model.dto.NoticeDTO;

import java.util.Scanner;

public class NoticeView {

    Scanner sc = new Scanner(System.in);
    public NoticeDTO InputNotice() {
        System.out.println("===== 공지사항 입력 =====");

        NoticeDTO n = new NoticeDTO();

        System.out.printf("제목을 입력하세요 : ");
        n.setTitle(sc.nextLine());

        System.out.printf("내용을 입력하세요(exit 입력시 종료) : ");
        String content = "";
        while (true) {
            String tmp = sc.nextLine();

            if (tmp.equals("exit")) {
                break;
            }

            content += tmp + "\n";
        }
        n.setContent(content);

        n.setViews(0);
        n.setUser_name("user_name");
        n.setNo();

        return n;
    }

    public int SelectNotice() {

        System.out.print("열람하실 공지사항 번호를 입력해주세요 : ");
        int selectNoticeNum = sc.nextInt();
        sc.nextLine();

        return selectNoticeNum;
    }

    public int getNo() {
        int delNotice = -1;

        System.out.print("삭제 할 게시글 번호를 입력하세요 : ");
        delNotice = sc.nextInt();
        sc.nextLine();

        return delNotice;
    }

    public NoticeDTO updateNotice(NoticeDTO n) {
        System.out.println("===== 공지사항 수정 =====");

        System.out.printf("제목을 입력하세요 : ");
        n.setTitle(sc.nextLine());

        System.out.printf("내용을 입력하세요(exit 입력시 종료) : ");
        String content = "";
        while (true) {
            String tmp = sc.nextLine();

            if (tmp.equals("exit")) {
                break;
            }

            content += tmp + "\n";
        }
        n.setContent(content);

        return n;
    }
}
