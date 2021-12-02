package com.Manager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Manager.Models.Room;
import com.Manager.Models.RoomList;
import com.Manager.Services.ReturnAllRooms;
import com.Manager.Services.RoomService;



@RestController
@RequestMapping("/manager")
public class RoomController {
	@Autowired
	private RoomService service;
	@Autowired
	ReturnAllRooms returnAllRooms;
	@GetMapping("/helloRoom")
	public String helloMsgs() {
		return "hello manager from Room";
	}
	
	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) 
	{
		return this.service.addRoom(room); 
	}
	
	@DeleteMapping("/deleteRoom/{id}")
	public String deleteDepartment(@PathVariable("id") String id) 
	{
		return this.service.deleteRoom(Long.parseLong(id));
	}
	
	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room)
	{
		return this.service.updateRoom(room);
	}
	
	@GetMapping("/findByIdRoom/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id)
	{
		return this.service.getRoom(Long.parseLong(id));
	}
	
	@GetMapping("/ShowAllRooms")
	public ReturnAllRooms getAllRooms()
	{
	   returnAllRooms.setRoomList( this.service.getAllRooms());
		
		return returnAllRooms;
				
	}
	
	
	@GetMapping("/AvailableRoom")
	public RoomList getAvailableRooms()
	{
		return this.service.getAvailable();
	}
	
	/*@GetMapping("/AvailableRoomCount")
	public String getAvailableRoomsCount()
	{
		return "Available Rooms are: "+this.service.getAvailable().stream().count();
	} */
}



