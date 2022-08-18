package com.mb.controller;

import static com.mb.constant.UrlMapping.USERS;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.dto.UserDto;
import com.mb.entity.User;
import com.mb.response.SuccResponse;
import com.mb.service.UserService;

@RestController
public class UserController extends BaseController
{

	@Autowired
	private UserService userService;

	@PostMapping(USERS)
	public ResponseEntity<SuccResponse> saveUser(@Valid @RequestBody UserDto userDto)
	{
		SuccResponse responseModel = SuccResponse.getInstance();
		responseModel.setData(userService.saveUser(userDto));
		responseModel.setMessage("User Registered Successfully");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<SuccResponse>(responseModel, HttpStatus.ACCEPTED);
	}

	@GetMapping(USERS)
	public ResponseEntity<List<User>> getUser()
	{
		return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
	}
}
