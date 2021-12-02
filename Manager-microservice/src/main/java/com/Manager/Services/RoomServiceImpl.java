package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Models.Room;
import com.Manager.Models.RoomList;
import com.Manager.Repo.RoomRepo;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepo repo;
	
	@Override
	public Room addRoom(Room room) {
		return repo.insert(room);
	}

	@Override
	public String deleteRoom(long id) {
		repo.deleteById(id);
		return "Room Deleted";
	}

	@Override
	public Room updateRoom(Room room) {
		return repo.save(room);
	}

	@Override
	public Optional<Room> getRoom(long id) {
		return repo.findById(id);
	}

	@Override
	public List<Room> getAllRooms() {
		return repo.findAll();
	}

	@Override
	public RoomList getAvailable() {
	
	
		RoomList list=new RoomList();
		list.setAllRooms(repo.findAvailable());
		return list;


	}

}
