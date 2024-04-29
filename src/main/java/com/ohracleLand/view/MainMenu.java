package com.ohracleLand.view;

import com.ohracleLand.controller.NoticeManager;
import com.ohracleLand.model.dto.UserDTO;

import java.util.Scanner;

public class MainMenu {

    Scanner sc = new Scanner(System.in);
    NoticeManager nm = new NoticeManager();

    //(+) 메인메뉴 테스트코드 삭제예정
    public static void main(String[] args) {
        // test mainMenu
        MainMenu m = new MainMenu();
//        m.mainMenu();
    }
    //(-) 메인메뉴 테스트코드 삭제예정

    public void mainMenu(UserDTO user) {

        nm.addInitData();
        UserDTO loginUser = user;   // 로그인 유저 정보
        loginUser.toString();

        while (true) {
            int selMenu = 0;
            System.out.println("==== 메인 메뉴 ====");
            System.out.println("1. 놀이기구 예약");
            System.out.println("2. 레스토랑 예약");
            System.out.println("3. 분실물 게시판");
            System.out.println("4. 고객의 소리");
            System.out.println("5. 공지사항");
            System.out.println("0. 종료");
            System.out.println("=================");
            System.out.print("메뉴를 선택해 주세요 : ");
            selMenu = sc.nextInt();

            switch (selMenu) {
                case 1: // 놀이기구 예약
                    // 메소드 호출
                    break;
                case 2: // 레스토랑 예약
                    // 메소드 호출
                    break;
                case 3: //  분실물 게시판
                    // 메소드 호출
                    break;
                case 4: // 고객의 소리
                    // 메소드 호출
                    break;
                case 5: // 공지사항
                    // 메소드 호출
                    nm.view_notice();
                    break;
                case 0: // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }


    }
}