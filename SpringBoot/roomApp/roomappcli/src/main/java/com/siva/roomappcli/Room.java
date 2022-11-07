package com.siva.roomappcli;


public class Room {
    
    private int number;
    private String name;
    private String desc;
    public Room() {
    }
    public Room(int number, String name, String desc) {
        this.number = number;
        this.name = name;
        this.desc = desc;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "Room [number=" + number + ", name=" + name + ", desc=" + desc + "]";
    }
    
    
}

