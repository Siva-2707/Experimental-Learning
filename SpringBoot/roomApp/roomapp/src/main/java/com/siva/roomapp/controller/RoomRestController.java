package com.siva.roomapp.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.roomapp.model.Room;
import com.siva.roomapp.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController{
    private final RoomService roomService;
    
    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }
    
    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getRooms();
    }
    
}