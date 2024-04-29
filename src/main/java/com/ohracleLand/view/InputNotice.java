package com.ohracleLand.view;

import com.ohracleLand.model.dto.NoticeDTO;

import java.util.Scanner;

public class InputNotice {

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
}
