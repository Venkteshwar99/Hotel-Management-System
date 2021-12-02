package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Manager.Models.Room;
import com.Manager.Models.RoomList;



@Service
public interface RoomService {
	public Room addRoom(Room room);

	public String deleteRoom(long id);

	public Room updateRoom(Room room);

	public Optional<Room> getRoom(long id);

	public List<Room> getAllRooms();

	
	public RoomList getAvailable();


}
