package com.ohracleLand.view;


import com.ohracleLand.model.dto.BoardDTO;

import java.util.Scanner;

import static com.ohracleLand.controller.BoardManager.boards;


public class Board {
    Scanner scanner = new Scanner(System.in);

    public void all(){
        for (BoardDTO boardDTO : boards) {
            System.out.println(boardDTO);

        }
    }


    public BoardDTO boardInsert() {                  // 글 쓰기
        BoardDTO board = new BoardDTO();

        System.out.println("글 번호");
        board.setNo(scanner.nextInt());

        System.out.println("제목 : ");
        board.setTitle(scanner.next());

        System.out.println("내용 : ");
        board.setContent(scanner.next());

        System.out.println("작성자 : ");
        board.setUser(scanner.next());

        return board;

    }




    }

