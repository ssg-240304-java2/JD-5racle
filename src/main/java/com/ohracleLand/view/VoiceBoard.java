package com.ohracleLand.view;


import com.ohracleLand.controller.VoiceBoardManager;
import com.ohracleLand.model.dto.VoiceBoardDTO;

import java.util.Scanner;

public class VoiceBoard {
   private Scanner scanner = new Scanner(System.in);

   private VoiceBoardManager bm = new VoiceBoardManager();





    public void view_board() {

        do {
            System.out.println("1. 게시판 글쓰기");
            System.out.println("2. 게시판 글 삭제");
            System.out.println("3. 게시판 조회");
            System.out.println("4. 게시판 수정");
            System.out.println("5. 종료");


            int menu = scanner.nextInt();

            switch (menu) {
                case 1:                   // 게시글 작성
                    bm.addBoard(inputBoard());
                    break;

                case 2:                 // 게시글 삭제
                    System.out.println("삭제할 게시글 번호를 입력하세요 : ");
                    int index = scanner.nextInt();
                    bm.deleteBoard(index);

                case 3:                  // 게시글 조회
                    bm.BoardAll();



                    break;
                case 4:                 // 게시글 수정



                    break;
                case 5:                  // 게시글 종료
                    System.out.println("종료하시겠습니까? (y/n) : ");
                    char exit = scanner.next().toUpperCase().charAt(0);

                    if (exit == 'Y') {
                        System.out.println("종료합니다.");
                        return;
                    } else System.out.println("게시글로 돌아갑니다.");
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }while(true);
    }


    private VoiceBoardDTO inputBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.println("작성자 이름 : ");
        String user = sc.next();
        System.out.println("제목 입력 :");
        String title = sc.next();
        System.out.println("내용 입력 :");
        String content = sc.next();
        System.out.println("게시글 번호 입력 : ");
        int No = sc.nextInt();

        return new VoiceBoardDTO(user,title,content,No);

    }
}


