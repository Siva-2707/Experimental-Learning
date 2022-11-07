package com.siva.roomapp.service;

// import java.util.ArrayList;
import java.util.List;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.siva.roomapp.data.RoomRepository;
import com.siva.roomapp.model.Room;
@Service
public class RoomService {

    private final RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getRooms(){
        return roomRepository.findAll();
    }
}
