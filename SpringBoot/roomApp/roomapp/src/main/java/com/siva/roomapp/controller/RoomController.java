package com.siva.roomapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.siva.roomapp.service.RoomService;

@Controller
public class RoomController {
    private final RoomService roomService;
    
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "rooms";
    }
}