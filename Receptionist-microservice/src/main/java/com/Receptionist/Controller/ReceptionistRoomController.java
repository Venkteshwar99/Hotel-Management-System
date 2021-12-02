package com.Receptionist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.Receptionist.Models.Room;
import com.Receptionist.Models.RoomList;


@RestController
@RequestMapping("reception/rooms")
public class ReceptionistRoomController {
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/findByIdRoom/{id}")
	public Room getRoom(@PathVariable("id") String id)
	{
		return restTemplate.getForObject("http://localhost:8082/manager/findByIdRoom/"+id,Room.class);
	}
	

	@GetMapping("/AvailableRoom")
	public RoomList getAvailableRooms()
	{
		return restTemplate.getForObject("http://localhost:8082/manager/AvailableRoom", RoomList.class);
	}
	
	
	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) 
	{
		return restTemplate.postForObject("http://localhost:8082/manager/addRoom", room, Room.class);
	}
	
	
	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room)
	{
		restTemplate.put("http://localhost:8082/manager/updateRoom/", room);
		return room;
	}
	
}