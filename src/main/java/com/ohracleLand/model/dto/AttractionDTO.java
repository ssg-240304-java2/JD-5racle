package com.ohracleLand.model.dto;

import java.util.ArrayList;

public class AttractionDTO {

    private ArrayList<UserDTO> waiting;
    private String id;
    private String name;
    private int capacity;
    private int rideTime;
    private boolean opened;

    public AttractionDTO(String id, String name, int capacity, int rideTime, boolean opened) {
        this.waiting = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.rideTime = rideTime;
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

    public int getRideTime() {
        return rideTime;
    }

    public boolean isOpened() {
        return opened;
    }

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

    public int waitingTime(UserDTO user) {

//        return (waiting.indexOf(user) / this.capacity) * this.rideTime;


        // 임시로 사용자 수 표시
        return waiting.indexOf(user);
    }

    public void showAttraction() {
        System.out.print("%-20s %-10d %-10d".formatted(this.name, this.rideTime, this.capacity));
    }

    public void removeFromWaiting(UserDTO user) {
        waiting.remove(user);
    }
}
