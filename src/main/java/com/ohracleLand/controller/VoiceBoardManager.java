package com.ohracleLand.controller;


import com.ohracleLand.model.dto.VoiceBoardDTO;

import java.util.ArrayList;

public class VoiceBoardManager {

    private ArrayList<VoiceBoardDTO> boardList;

    public VoiceBoardManager() { boardList = new ArrayList<>();}

    public void addBoard(VoiceBoardDTO board) { boardList.add(board);}

    public void deleteBoard(int index) { boardList.remove(index);}

    public void BoardAll() {

        if(boardList.isEmpty()) {
            System.out.println("게시글이 없습니다.");
        } else {

            for(int i = 0; i < boardList.size(); i++) {
                System.out.println(boardList.get(i));
            }
        }
    }




}
