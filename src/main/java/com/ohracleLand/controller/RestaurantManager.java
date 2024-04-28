package com.ohracleLand.controller;

import com.ohracleLand.model.dto.*;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManager {

    private UserDTO user;

    // 식당 리스트
    public static ArrayList<RestaurantDTO> restaurants = new ArrayList<>();

    int[] arr = new int[5];


    // 예약 리스트
    public static ArrayList<RestaurantReservationDTO> reservations = new ArrayList<>();

    public RestaurantManager(UserDTO user) {

        this.user = user;
        // 예약가능한 놀이기구 목록 로드
        restaurants.add(new RestaurantDTO("01", "오클중식당", 70,  "30분",true));
        restaurants.add(new RestaurantDTO("02", "두메오클랜드점", 40, "2시간",true));
        restaurants.add(new RestaurantDTO("04", "오클깐부", 40, "1시간",true));
        restaurants.add(new RestaurantDTO("05", "오라클리셰", 50,  "1시간",true));

        UserDTO user9 = new UserDTO("01", "1111", "연주현이");
        reservations.add(new RestaurantReservationDTO(user9, restaurants.get(0)));
        restaurants.get(0).insertWaiting(user9);
        reservations.add(new RestaurantReservationDTO(user9, restaurants.get(1)));
        restaurants.get(1).insertWaiting(user9);
        reservations.add(new RestaurantReservationDTO(user9, restaurants.get(2)));
        restaurants.get(2).insertWaiting(user9);
        reservations.add(new RestaurantReservationDTO(user9, restaurants.get(3)));
        restaurants.get(3).insertWaiting(user9);
    }

        public int printAllAvailableRestaurants() {
            System.out.println("""
                ==========================================================
                                        식당 예약
                ==========================================================
                 %6s %-19s %-8s %-30s
                -----------------------------------------------------------""".formatted("","식당이름", "정원", "예상대기시간"));
            int count = 0;
            for (RestaurantDTO restaurant : restaurants) {
                System.out.print("[ " + (++count) + " ] ");
                restaurant.showRestaurant();
                System.out.println(restaurant.waitingTime());
            }
            return count;
        }

    public void checkSelectedRestaurant(int num) {
        String restName = restaurants.get(num - 1).getName();
        char lastChar = restName.charAt(restName.length() - 1);
        if ((lastChar - 0xAC00) % 28 <= 0) {
            System.out.print(restName + "를 예약하시겠습니까?(Y/N) : ");
        } else {
            System.out.print(restName + "을 예약하시겠습니까?(Y/N) : ");
        }

        char input = new Scanner(System.in).nextLine().charAt(0);
        if (input == 'Y' || input == 'y') {
            if (makeReservation(num)) {
                if ((lastChar - 0xAC00) % 28 <= 0) {
                    System.out.println(restaurants.get(num - 1).getName() + "가 예약되었습니다.");
                } else {
                    System.out.println(restaurants.get(num - 1).getName() + "이 예약되었습니다.");
                }
            } else {
                System.out.println("해당 식당에 대한 예약이 이미 존재합니다.");
            }
        } else {
            System.out.println("선택을 취소하셨습니다.");
        }
    }

    public void showReservations() {
        System.out.print("""
                ===============================================
                                 식당 예약 목록
                ===============================================
                """);
        for (RestaurantReservationDTO reservation : reservations) {
            if (reservation.getCustomer().equals(user)) {
                for (RestaurantDTO restaurant : restaurants) {
                    if (reservation.getRestaurant().equals(restaurant)) {
                        restaurant.showRestaurant();
                        System.out.println(restaurant.waitingTime(user));
                    }
                }
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("[1] 예약 삭제");
        System.out.println("[2] 뒤로 가기");
        while (true) {
            System.out.print("선택 : ");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                manageReservation();
                break;
            } else if (input == 2) {
                break;
            } else {
                System.out.print("다시 선택하세요. ");
            }
        }

    }
    private boolean makeReservation(int num) {
        if (restaurants.get(num - 1).insertWaiting(user)) {
            reservations.add(new RestaurantReservationDTO(user, restaurants.get(num - 1)));
            return true;
        } else {
            return false;
        }
    }

    public void manageReservation() {
        int count = 0;
        System.out.print("""
                ===============================================
                                 식당 예약 취소
                ===============================================
                """);
        for (RestaurantReservationDTO reservation : reservations) {
            if (reservation.getCustomer().equals(user)) {
                for (RestaurantDTO restaurant : restaurants) {
                    if (reservation.getRestaurant().equals(restaurant)) {
                        System.out.print("[ " + (++count) + " ] ");
                        restaurant.showRestaurant();
                        System.out.println(restaurant.waitingTime(user));
                    }
                }
            }
        }
        System.out.println("-----------------------------------------------");
        while (true) {
            System.out.print("""
                    취소할 예약 번호를 입력해주세요(0 - 뒤로가기) :\s""");
            int input = new Scanner(System.in).nextInt();
            if (input == 0) {
                System.out.println("예약 관리를 종료합니다.");
                showReservations();
                break;
            } else if (input >= 1 && input <= count) {
                removeReservation(user, input);
                System.out.println("제거를 완료했습니다.");
                break;
            } else {
                System.out.println("잘못된 번호를 입력하였습니다.");
            }
        }
    }
    public void removeReservation(UserDTO user, int num) {
        int count = 0;
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getCustomer().equals(user)) {
                count++;
                if (count == num) {
                    // restaurant의 wait 데이터 제거
                    System.out.println(restaurants.get(restaurants.indexOf(reservations.get(i).getRestaurant())).getName());
                    restaurants.get(restaurants.indexOf(reservations.get(i).getRestaurant())).removeFromWaiting(user);
                    // reservations 에서 해당 데이터 제거
                    System.out.println(reservations.get(i).getRestaurant().getName() + " " + reservations.get(i).getCustomer().getName());
                    reservations.remove(i);

                    return;
                }
            }
        }
    }
}


