package com.ohracleLand.view;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LostAndFoundMenu {

    Scanner scanner = new Scanner(System.in);

    public int LostMenu() {
        int choiceMenu;
        System.out.print("""
                =================================
                분실물 게시판 입니다.
                ---------------------------------
                1. 분실물 전체 조회
                2. 분실물 검색
                3. 분실물 등록
                0. 메인메뉴로 돌아가기
                ---------------------------------
                """);
        System.out.print("메뉴를 선택하세요 : ");
        try {
            choiceMenu = scanner.nextInt();
            return choiceMenu;
        } catch (InputMismatchException e){
            scanner.nextLine();
            return -1;
        }
    }

    public int searchLostMenu() {
        int resultSearchMenu;
        System.out.print("""
                =================================
                무엇으로 검색하시겠습니까?
                ---------------------------------
                1. 분실물 종류
                2. 분실 위치
                3. 분실물 특징
                0. 분실물 게시판으로 돌아가기
                ---------------------------------
                """);
        System.out.print("검색할 내용을 입력하세요 : ");
        try {
            resultSearchMenu = scanner.nextInt();
            return resultSearchMenu;
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.print("잘못된 입력입니다. ");
            return -1;
        }

    }

}
