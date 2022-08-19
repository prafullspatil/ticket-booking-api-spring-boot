package com.mb.dao;

import java.util.List;
import com.mb.entity.User;

public interface UserDao
{
	public User saveUser(User user);

	List<User> getUser();
}
