package com.ohracleLand.view;

import java.util.Scanner;

public class AttractionReservationMenu {
    public static int menu() {
        System.out.print("""
                ===============================================
                                      메뉴
                ===============================================
                1. 놀이기구 예약
                2. 예약 목록 확인
                -----------------------------------------------
                원하는 메뉴를 입력하세요 :\s""");
        return new Scanner(System.in).nextInt();
    }
}
