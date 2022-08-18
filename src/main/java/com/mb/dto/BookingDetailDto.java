package com.mb.dto;

public class BookingDetailDto
{

	private String userName;

	private String email;

	private long showId;

	private String[] reserved;

	public String[] getReserved()
	{
		return reserved;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getEmail()
	{
		return email;
	}

	public long getShowId()
	{
		return showId;
	}

	// private String[] reserved;

}
