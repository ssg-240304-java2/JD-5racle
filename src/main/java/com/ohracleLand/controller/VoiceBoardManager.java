package com.ohracleLand.controller;


import com.ohracleLand.model.dto.VoiceBoardDTO;
import com.ohracleLand.view.VoicePrinter;

import java.util.ArrayList;

public class VoiceBoardManager {

    private ArrayList<VoiceBoardDTO> boardList;

    public VoiceBoardManager() {
        boardList = new ArrayList<>();
    }

    /* 게시물 작성 */
    public void addBoard(VoiceBoardDTO board) {
        boardList.add(board);
    }

    private VoicePrinter printer = new VoicePrinter();

//    public void updateBoard(int boardNo, String content) {
//        int result = 0;
//
//        for(int i = 0; i > )
//    }


        /* 게시물 삭제 */
        public void deleteBoard ( int index) {

            int result = 0;

            for (int i = 0; i < boardList.size(); i++) {

                if (boardList.get(i).getNo() == index) {
                    boardList.remove(i);
                    break;
                }
            }
            printer.Page("삭제완료");



        }

        /* 게시물 조회 */
        public void BoardAll () {


            if (boardList.isEmpty()) {
                System.out.println("게시글이 없습니다.");
            } else {

                for (int i = 0; i < boardList.size(); i++) {
                    System.out.println(boardList.get(i));
                }
            }
        }


    }

