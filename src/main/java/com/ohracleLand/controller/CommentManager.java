package com.ohracleLand.controller;

import com.ohracleLand.model.dto.CommentDTO;
import com.ohracleLand.view.CommentView;

import java.util.ArrayList;

public class CommentManager {

    ArrayList<CommentDTO> commentList = new ArrayList<>();

    CommentView cv = new CommentView();

    public void addInitData(String userId) {
        commentList.add(new CommentDTO(1,"test1",userId));
        commentList.add(new CommentDTO(1,"test2",userId));
        commentList.add(new CommentDTO(2,"test3",userId));
        commentList.add(new CommentDTO(3,"test4",userId));
    }

    public void inputComment(int noticeNo, String userId) {
        commentList.add(cv.inputComment(noticeNo, userId));
    }

    public void printComments(int noticeNo) {
        for (CommentDTO c : commentList) {
            if (c.getNoticeNo() == noticeNo) {
                System.out.println(c.toString());
            }
        }
    }

    public void deleteComment(String userId) {
        int delComment;

        delComment = cv.deleteComment();
        int nIdx = -1;

        for (int i = 0; i < commentList.size(); i++) {
            if (commentList.get(i).getNo() == delComment) {
                nIdx = i;
            }
        }

        if ( nIdx != -1 && commentList.get(nIdx).getUser_id().equals(userId)) {
            commentList.remove(nIdx);
        }else {
            System.out.println("유효하지 않은 번호입니다.");
        }

    }
}
