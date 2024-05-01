package com.ohracleLand.controller;

import com.ohracleLand.model.dto.BoardDTO;
import com.ohracleLand.view.Board;


import java.util.*;

public class BoardManager {
   public static ArrayList<BoardDTO> boards = new ArrayList<>();
   Board bd = new Board();
   Scanner sc = new Scanner(System.in);



    public void view_Board() {

        System.out.println("1.조회 2.글쓰기 3. 수정하기 4.삭제 5.종료");

        switch (sc.nextInt()) {
            case 1:
                bd.all();

                break;
            case 2:
                bd.boardInsert();
                System.out.println(bd);
                break;
            case 3:


                break;
            case 4:

                break;


            case 5:             // 종료
                System.out.println("종료 되었습니다.");
                System.exit(0);
                break;
                }
        }

    }
