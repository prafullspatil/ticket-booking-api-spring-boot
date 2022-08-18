package com.mb.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import com.mb.validation.ValidPassword;

public class UserDto
{

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@Email
	private String email;

	@ValidPassword
	private String password;

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}

}
