package org.example.model;

public class Office {

    private String code;
    private int floor;
    private Office nextOfice;
    private Professor prof;

    public Office(String code, int floor) {
        this.code = code;
        this.floor = floor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;

    }

    public void setNext(Office b){
        nextOfice = b;
    }

    public Office getNext(){
        return nextOfice;
    }


}