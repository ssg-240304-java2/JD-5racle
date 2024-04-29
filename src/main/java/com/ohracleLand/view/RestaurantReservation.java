package com.ohracleLand.view;

import com.ohracleLand.controller.AttractionManager;
import com.ohracleLand.controller.RestaurantManager;
import com.ohracleLand.model.dto.UserDTO;

import java.util.Scanner;

public class RestaurantReservation {
    private UserDTO user;
    RestaurantManager restaurantManager;

    public RestaurantReservation(UserDTO user) {
        this.user = user;
        this.restaurantManager = new RestaurantManager(user);
    }

    public void selectRestaurant() {
        int restCnt = this.RestaurantList();
        System.out.print("""
                -----------------------------------------------
                예약하려는 식당을 선택하세요 :\s""");
        int input = new Scanner(System.in).nextInt();
        if (input > 0 && input <= restCnt) {
            restaurantManager.checkSelectedRestaurant(input);
        } else {
            System.out.println("값을 잘못 입력하였습니다.");
        }
    }

    public void reservationManagement() {
        restaurantManager.showReservations();
    }
    public int RestaurantList() {
        return restaurantManager.printAllAvailableRestaurants();
    }

}
