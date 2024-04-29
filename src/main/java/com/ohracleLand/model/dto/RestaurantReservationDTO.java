package com.ohracleLand.model.dto;

public class RestaurantReservationDTO {

    private UserDTO customer;
    private RestaurantDTO restaurant;

    public RestaurantReservationDTO(UserDTO customer, RestaurantDTO restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public UserDTO getCustomer() {
        return customer;
    }

    public RestaurantDTO getRestaurant() {
        return restaurant;
    }
}
