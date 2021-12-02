package com.Owner.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Owner.Models.Room;

@Service
public class ReturnAllRooms {
 List<Room> roomList= new ArrayList<>();

public List<Room> getRoomList() {
	return roomList;
}

public void setRoomList(List<Room> roomList) {
	this.roomList = roomList;
}
public ReturnAllRooms() {
	// TODO Auto-generated constructor stub
}
}
