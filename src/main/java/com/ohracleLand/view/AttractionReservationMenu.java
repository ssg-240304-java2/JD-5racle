package com.ohracleLand.view;

import com.ohracleLand.model.dto.UserDTO;

import java.util.Scanner;

public class AttractionReservationMenu {

    public static void menu(UserDTO user) {
        AttractionReservation attractionReservation = new AttractionReservation(user);
        while (true) {
            System.out.print("""
                    ===============================================
                                          메뉴
                    ===============================================
                    1. 놀이기구 예약
                    2. 예약 목록 확인
                    0. 나가기
                    -----------------------------------------------
                    원하는 메뉴를 입력하세요 :\s""");
            try {
                int input = new Scanner(System.in).nextInt();
                switch (input) {
                    case 1:
                        attractionReservation.selectAttraction();
                        break;
                    case 2:
                        attractionReservation.reservationManagement();
                        break;
                    case 0:
                        System.out.println("놀이기구 예약을 종료합니다.");
                        return;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
