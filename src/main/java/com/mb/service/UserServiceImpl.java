package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dao.UserDao;
import com.mb.dto.UserDto;
import com.mb.entity.User;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserDao userDao;

	@Override
	public User saveUser(UserDto userDto)
	{
		User user = modelMapper.map(userDto, User.class);
		return userDao.saveUser(user);
	}

	@Override
	public List<User> getUser()
	{

		return userDao.getUser();

	}

}
