package com.revature.appuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAll() {
		return userService.getAll();
	}

	@PostMapping(value = "/login", consumes = { 
			MediaType.MULTIPART_FORM_DATA_VALUE, 
			MediaType.APPLICATION_FORM_URLENCODED_VALUE
			})
	public Boolean checkLogin(@RequestParam String username, @RequestParam String password) {
		return userService.isValid(username, password);
	}
	
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Boolean checkLogin(@RequestBody User user) {
		return userService.isValid(user.getUsername(), user.getPassword());
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Integer register(@RequestBody User user) {
		return userService.register(user.getUsername(), user.getPassword());
	}

	@PostMapping(consumes = { 
			MediaType.MULTIPART_FORM_DATA_VALUE, 
			MediaType.APPLICATION_FORM_URLENCODED_VALUE
			})
	public Integer register(@RequestParam String username, @RequestParam String password) {
		return userService.register(username, password);
	}

}
