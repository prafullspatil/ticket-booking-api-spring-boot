package com.mb.service;

import java.util.List;
import com.mb.dto.UserDto;
import com.mb.entity.User;

public interface UserService
{
	public User saveUser(UserDto userDto);

	List<User> getUser();
}
