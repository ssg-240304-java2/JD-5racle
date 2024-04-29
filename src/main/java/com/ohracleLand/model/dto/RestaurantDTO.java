package com.ohracleLand.model.dto;

import java.util.ArrayList;

public class RestaurantDTO {
    private ArrayList<UserDTO> waiting;
    private String id;
    private String name;
    private int capacity;
    private String waitingTime;
    private boolean opened;

    public RestaurantDTO(String id, String name, int capacity, String waitingTime, boolean opened) {
        this.waiting = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.waitingTime = waitingTime;
        this.opened = opened;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getWaitTime() {return waitingTime;}

    public boolean isOpened() {return opened;}

    public boolean insertWaiting(UserDTO user) {
        if (this.waiting.contains(user)) {
            return false;
        } else {
            this.waiting.add(user);
            return true;
        }
    }

    public int waitingTime() {

        return waiting.size();
    }

    public ArrayList<UserDTO> getWaiting() {

        return waiting;
    }

    public int waitingTime(UserDTO user) {
        return waiting.indexOf(user);
    }

    public void showRestaurant() {
        System.out.print("%-20s %-20d %-20s".formatted(this.name,this.capacity,this.waitingTime));
    }

    public void removeFromWaiting(UserDTO user) {
        waiting.remove(user);
    }
}
