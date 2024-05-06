package com.ohracleLand.view;

import com.ohracleLand.model.dto.CommentDTO;

import java.util.Scanner;

public class CommentView {
    Scanner sc = new Scanner(System.in);

    public CommentDTO inputComment(int noticeNo, String userId) {
        String content = "";

        System.out.println("===== 댓글 입력 =====");
        System.out.print("댓글 내용을 입력하세요 : ");
        content = sc.nextLine();

        return new CommentDTO(noticeNo, content, userId);
    }

    public int deleteComment() {
        int delComment = -1;

        System.out.println("===== 댓글 삭제 =====");
        System.out.print("삭제 할 댓글 번호를 입력하세요 : ");
        delComment = sc.nextInt();
        sc.nextLine();

        return delComment;
    }
}
