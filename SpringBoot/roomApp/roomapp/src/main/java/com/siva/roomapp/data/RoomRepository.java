package com.siva.roomapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.roomapp.model.Room;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
