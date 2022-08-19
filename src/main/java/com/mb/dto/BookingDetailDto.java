package com.mb.dto;

import javax.validation.constraints.NotNull;

public class BookingDetailDto
{

	@NotNull
	private long userId;

	@NotNull
	private long showId;

	private String[] reserved;

	public String[] getReserved()
	{
		return reserved;
	}

	public long getUserId()
	{
		return userId;
	}

	public long getShowId()
	{
		return showId;
	}

}
