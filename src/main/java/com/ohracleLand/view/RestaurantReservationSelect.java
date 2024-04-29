package com.ohracleLand.view;

import com.ohracleLand.model.dto.UserDTO;

import java.util.Scanner;

public class RestaurantReservationSelect {

    public static void select (UserDTO user) {
        RestaurantReservation restaurantReservation = new RestaurantReservation(user);
        while (true) {
            System.out.print("""
                    ===============================================
                                          선택
                    ===============================================
                    1. 식당 예약
                    2. 예약 목록 확인
                    -----------------------------------------------
                    원하는 항목의 번호를 입력하세요 :\s""");
            int input = new Scanner(System.in).nextInt();


            switch (input) {
                case 1:
                    restaurantReservation.selectRestaurant();
                    break;
                case 2:
                    restaurantReservation.reservationManagement();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("값을 정확히 입력해주세요");
            }
        }
    }
}
