/*
package com.ohracleLand.view;

import com.ohracleLand.controller.AttractionManager;
import com.ohracleLand.model.dto.UserDTO;

import java.util.Scanner;

public class AttractionReservation {

    private UserDTO user;
    AttractionManager reservationManager;

    public AttractionReservation(UserDTO user) {
        this.user = user;
        this.reservationManager = new AttractionManager(user);
    }

    public void selectAttraction() {
        int attrCnt = this.AttractionList();
        System.out.print("""
                -----------------------------------------------
                예약하려는 놀이기구를 선택하세요 :\s""");
        int input = new Scanner(System.in).nextInt();
        if (input > 0 && input <= attrCnt) {
            reservationManager.checkSelectedAttraction(input);
        } else {
            System.out.println("값을 잘못 입력하였습니다.");
        }
    }


    public void reservationManagement() {
        reservationManager.showReservations();
    }

    public int AttractionList() {
        return reservationManager.printAllAvailableAttractions();
    }
}*/
