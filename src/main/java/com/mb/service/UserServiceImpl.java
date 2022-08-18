package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dto.UserDto;
import com.mb.entity.User;
import com.mb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(UserDto userDto)
	{
		User user = modelMapper.map(userDto, User.class);
		return userRepository.save(user);
	}

	@Override
	public List<User> getUser()
	{

		return userRepository.findAll();

	}

}
