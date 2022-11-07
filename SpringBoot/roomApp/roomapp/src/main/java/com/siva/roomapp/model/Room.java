package com.siva.roomapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BED_INFO")
    private String desc;
    public Room() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
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
    public Room(int id, String number, String name, String desc) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "Room [id=" + id + ", number=" + number + ", name=" + name + ", desc=" + desc + "]";
    }

    
}

