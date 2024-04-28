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
                    -----------------------------------------------
                    원하는 메뉴를 입력하세요 :\s""");
            int input = new Scanner(System.in).nextInt();


            switch (input) {
                case 1:
                    attractionReservation.selectAttraction();
                    break;
                case 2:
                    attractionReservation.reservationManagement();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("값을 정확히 입력해주세요");
            }
        }
    }
}
