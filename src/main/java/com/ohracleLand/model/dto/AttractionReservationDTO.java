package com.ohracleLand.model.dto;

public class AttractionReservationDTO {

    private UserDTO customer;
    private AttractionDTO attraction;

    public AttractionReservationDTO(UserDTO customer, AttractionDTO attraction) {
        this.customer = customer;
        this.attraction = attraction;
    }

    public UserDTO getCustomer() {
        return customer;
    }

    public AttractionDTO getAttraction() {
        return attraction;
    }
}