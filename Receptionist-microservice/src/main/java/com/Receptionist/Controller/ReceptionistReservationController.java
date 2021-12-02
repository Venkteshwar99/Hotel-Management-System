package com.Receptionist.Controller;

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

import com.Receptionist.Models.Booking;


@RestController
@RequestMapping("/receptionist/reserv")
public class ReceptionistReservationController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String helloMsg() {
		return "hello receptionist";
	}

	@PostMapping("/addReservation")
	public Booking addBooking(@RequestBody Booking book) 
	{
		return restTemplate.postForObject("http://localhost:8084/reservation/addReservation", book, Booking.class);
	}

	@PutMapping("/updateReservation")
	public Booking updateBooking(@RequestBody Booking book) 
	{
		restTemplate.put("http://localhost:8084/reservation/updateReservation/",book);
		return book;
		
	}
	
	@DeleteMapping("/cancelReservation/{id}")
	public String deleteBooking(@PathVariable("id") String id)
	{
		restTemplate.delete("http://localhost:8084/reservation//cancelReservation/"+id);
		return "Deleted Booking "+id;
	}

	
}