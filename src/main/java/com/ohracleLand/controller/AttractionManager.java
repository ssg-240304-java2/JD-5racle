package com.ohracleLand.controller;

import com.ohracleLand.model.dto.AttractionDTO;
import com.ohracleLand.model.dto.AttractionReservationDTO;
import com.ohracleLand.model.dto.UserDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class AttractionManager {

    private UserDTO user;

    // 놀이기구 리스트
    public static ArrayList<AttractionDTO> attractions = new ArrayList<>();

    int[] arr = new int[5];
    // 예약 리스트
    public static ArrayList<AttractionReservationDTO> reservations = new ArrayList<>();

    public AttractionManager(UserDTO user) {

        this.user = user;
        // 예약가능한 놀이기구 목록 로드
        attractions.add(new AttractionDTO("11111", "자이로드롭", 10, 1, true));
        attractions.add(new AttractionDTO("22222", "청룡열차", 20, 2, true));
        attractions.add(new AttractionDTO("33333", "바이킹", 30, 3, true));
        attractions.add(new AttractionDTO("44444", "후룸라이드", 40, 4, true));
        attractions.add(new AttractionDTO("55555", "사파리", 50, 5, true));

        UserDTO user1 = new UserDTO("1111", "엄지");
        reservations.add(new AttractionReservationDTO(user1, attractions.get(0)));
        attractions.get(0).insertWaiting(user1);
        reservations.add(new AttractionReservationDTO(user1, attractions.get(1)));
        attractions.get(1).insertWaiting(user1);
        reservations.add(new AttractionReservationDTO(user1, attractions.get(2)));
        attractions.get(2).insertWaiting(user1);
        reservations.add(new AttractionReservationDTO(user1, attractions.get(3)));
        attractions.get(3).insertWaiting(user1);
        UserDTO user2 = new UserDTO("2222", "검지");
        reservations.add(new AttractionReservationDTO(user2, attractions.get(0)));
        attractions.get(0).insertWaiting(user2);
        reservations.add(new AttractionReservationDTO(user2, attractions.get(1)));
        attractions.get(1).insertWaiting(user2);
        reservations.add(new AttractionReservationDTO(user2, attractions.get(4)));
        attractions.get(4).insertWaiting(user2);
        UserDTO user3 = new UserDTO("3333", "중지");
        reservations.add(new AttractionReservationDTO(user3, attractions.get(0)));
        attractions.get(0).insertWaiting(user3);
        reservations.add(new AttractionReservationDTO(user3, attractions.get(2)));
        attractions.get(2).insertWaiting(user3);
        reservations.add(new AttractionReservationDTO(user3, attractions.get(4)));
        attractions.get(4).insertWaiting(user3);
        UserDTO user4 = new UserDTO("4444", "약지");
        reservations.add(new AttractionReservationDTO(user4, attractions.get(0)));
        attractions.get(0).insertWaiting(user4);
        reservations.add(new AttractionReservationDTO(user4, attractions.get(1)));
        attractions.get(1).insertWaiting(user4);
    }

    public int printAllAvailableAttractions() {
        System.out.println("""
                ===============================================
                                   놀이기구 예약
                ===============================================
                %6s%-19s %-8s %-10s %-8s
                -----------------------------------------------""".formatted("", "놀이기구", "탑승시간", "정원", "예상대기시간"));
        int count = 0;
        for (AttractionDTO attraction : attractions) {
            System.out.print("[ " + (++count) + " ] ");
            attraction.showAttraction();
            System.out.println(attraction.waitingTime());
        }
        return count;
    }

    public void checkSelectedAttraction(int num) {
        String attrName = attractions.get(num - 1).getName();
        char lastChar = attrName.charAt(attrName.length() - 1);
        if ((lastChar - 0xAC00) % 28 <= 0) { // 받침 없음
            System.out.print(attrName + "를 예약하시겠습니까?(Y/N) : ");
        } else {
            System.out.print(attrName + "을 예약하시겠습니까?(Y/N) : ");
        }

        char input = new Scanner(System.in).nextLine().charAt(0);
        if (input == 'Y' || input == 'y') {
            if (makeReservation(num)) {
                if ((lastChar - 0xAC00) % 28 <= 0) { // 받침 없음
                    System.out.println(attractions.get(num - 1).getName() + "가 예약되었습니다.");
                } else {
                    System.out.println(attractions.get(num - 1).getName() + "이 예약되었습니다.");
                }
            } else {
                System.out.println("해당 놀이기구에 대한 예약이 이미 존재합니다.");
            }
        } else {
            System.out.println("선택을 취소하셨습니다.");
        }
    }

    public void showReservations() {
        // reservations 중 userId data를 가진 놀이기구 이름 출력
        System.out.print("""
                ===============================================
                                 놀이기구 예약 목록
                ===============================================
                """);
        for (AttractionReservationDTO reservation : reservations) {
            if (reservation.getCustomer().equals(user)) {
                for (AttractionDTO attraction : attractions) {
                    if (reservation.getAttraction().equals(attraction)) {
                        attraction.showAttraction();
                        System.out.println(attraction.waitingTime(user));
                    }
                }
            }
        }
        System.out.println("-----------------------------------------------");
    }

    private boolean makeReservation(int num) {
        if (attractions.get(num - 1).insertWaiting(user)) {
            reservations.add(new AttractionReservationDTO(user, attractions.get(num - 1)));
            return true;
        } else {
            return false;
        }
    }
}
