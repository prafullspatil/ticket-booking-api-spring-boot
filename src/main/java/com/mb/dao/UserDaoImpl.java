package com.mb.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mb.entity.User;
import com.mb.exception.CustomException;
import com.mb.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao
{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user)
	{
		try
		{
			return userRepository.save(user);
		}
		catch (Exception e)
		{
			throw new CustomException("Error while saving user");
		}
	}

	@Override
	public List<User> getUser()
	{

		return userRepository.findAll();
	}

}
