package com.Receptionist.Controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Receptionist.Models.ReceptionistInfo;
import com.Receptionist.Repo.ReceptionistRepo;
import com.Receptionist.SecurityConfig.ReceptionistAuthResponse;
import com.Receptionist.SecurityConfig.ReceptionistService;


@RestController
@RequestMapping("/receptionist")
public class ReceptionistController {
	@Autowired
	private ReceptionistService receptionistService;
	@Autowired
	private ReceptionistRepo receptionistRepo;
	@Autowired
	private AuthenticationManager authenticationManager;

//Creating/Adding Washer
	
	@PostMapping("/addReceptionist")
	private ResponseEntity<?> saveOwnerInfo(@RequestBody ReceptionistInfo managerInfo) {
		String email = managerInfo.getEmail();
		String password = managerInfo.getPassword();
		ReceptionistInfo manager1 = new ReceptionistInfo();
		manager1.setEmail(email);
		manager1.setPassword(password);
		try {

			receptionistRepo.save(managerInfo);
		} catch (Exception e) {
			return ResponseEntity.ok(new  ReceptionistAuthResponse("Error creating Receptionist" + email));
		}
		return ResponseEntity.ok(new ReceptionistAuthResponse("Successfully created Receptionist " + email));
	}

//authenticating washer
	@PostMapping("/auth")
	private ResponseEntity<?> authWasher(@RequestBody ReceptionistInfo managerInfo) {
		String email = managerInfo.getEmail();
		String password = managerInfo.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (Exception e) {
			return ResponseEntity.ok(new ReceptionistAuthResponse("Error during Manager Authentication" + email));
		}
		return ResponseEntity.ok(new ReceptionistAuthResponse("Successfully Authenticated Manager" + email));
	}

//Reading all washer
	@GetMapping("/receptionist")
	public List<ReceptionistInfo> findAllReceptionist() {
		return receptionistService.getReceptionistInfos();
	}

}
