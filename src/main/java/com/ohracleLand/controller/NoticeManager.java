package com.ohracleLand.controller;

import com.ohracleLand.model.dto.NoticeDTO;
import com.ohracleLand.model.dto.UserDTO;
import com.ohracleLand.view.NoticeView;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeManager {
    private ArrayList<NoticeDTO> noticeList = new ArrayList<>();
    NoticeView nv = new NoticeView();
    Scanner sc = new Scanner(System.in);
    CommentManager cm = new CommentManager();
    UserDTO userData;
    boolean isAdmim = true; // 관리자계정 기능구현 x 추후 미니프로젝트시 추가예정

    public void addInitData() {
        noticeList.add(new NoticeDTO("test1", "testContent1", 0, "test1"));
        noticeList.add(new NoticeDTO("test2", "testContent2", 1, "test1"));
        noticeList.add(new NoticeDTO("test3", "testContent3", 2, "test1"));
        noticeList.add(new NoticeDTO("test4", "testContent4", 3, "test1"));
    }

    public void printNoticeList() {

        for (NoticeDTO s : noticeList) {
            System.out.println(s.toString());
        }

    }

    public void view_notice(UserDTO user) {
        userData = user;
        cm.addInitData("test1");
        while (true) {
            printNoticeList();
            if (isAdmim) {
                adminNoticeView();
            } else {
                userNoticeView();
            }
            System.out.print("메뉴를 선택해 주세요 : ");

            switch (sc.nextInt()) {
                case 0:
                    return;
                case 1:
                    selectNotice();
                    break;
                case 2:
                    postNotice();
                    System.out.println("새 공지사항이 등록되었습니다.");
                    break;
                case 3:
                    updateNotice();
                    System.out.println("공지사항이 수정되었습니다.");
                    break;
                case 4:
                    deleteNotice();
                    System.out.println("공지사항이 삭제되었습니다.");
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
            }
        }
    }

    public void adminNoticeView() {
        System.out.println("0 : 뒤로       1:보기 2:글쓰기 3:수정 4:삭제");
    }

    public void userNoticeView() {
        System.out.println("0 : 뒤로                          1:보기");
    }

    public void selectNotice() {
        int selNum = nv.SelectNotice();
        int nIdx = -1;
        for (int i = 0; i < noticeList.size(); i++) {
            if (noticeList.get(i).getNo() == selNum) {
                nIdx = noticeList.get(i).getNo();

                System.out.println(noticeList.get(i).toString());
                cm.printComments(nIdx);
                System.out.println("0:뒤로\t\t\t1:댓글달기 2:댓글삭제");
                while (true) {
                    System.out.print(" > ");
                    int selComment = sc.nextInt();
                    sc.nextLine();

                    switch (selComment) {
                        case 0:
                            return;
                        case 1:
                            cm.inputComment(nIdx, userData.getId());
                            break;
                        case 2:
                            cm.deleteComment(userData.getId());
                            break;
                        default:
                            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
                            break;
                    }
                }

            }
        }
    }

    public void postNotice() {

        NoticeDTO inputNotice = nv.InputNotice();
        inputNotice.setUser_name(userData.getName());

        noticeList.add(inputNotice);
    }

    public void updateNotice() {
        int updNotice;

        updNotice = nv.getNo();
        int nIdx = -1;

        for (int i = 0; i < noticeList.size(); i++) {
            if (noticeList.get(i).getNo() == updNotice) {
                nIdx = i;
            }
        }

        if (nIdx != -1 && noticeList.get(nIdx).getUser_name().equals(userData.getId())) {
            NoticeDTO tmpNotice = noticeList.get(nIdx);
            nv.updateNotice(tmpNotice);
//            noticeList.set(nIdx,nv.updateNotice(tmpNotice));
        } else {
            System.out.println("유효하지 않은 번호입니다.");
        }
    }

    public void deleteNotice() {
        int delNotice;

        delNotice = nv.getNo();
        int nIdx = -1;

        for (int i = 0; i < noticeList.size(); i++) {
            if (noticeList.get(i).getNo() == delNotice) {
                nIdx = i;
            }
        }

        if (nIdx != -1 && noticeList.get(nIdx).getUser_name().equals(userData.getId())) {
            noticeList.remove(nIdx);
        } else {
            System.out.println("유효하지 않은 번호입니다.");
        }
    }

}