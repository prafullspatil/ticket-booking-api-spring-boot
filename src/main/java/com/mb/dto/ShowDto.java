package com.mb.dto;

import java.sql.Date;

public class ShowDto
{

	private String name;

	private String totalTime;

	private Date date;

	private String type;

	private String language;

	private String location;

	private double price;

	private String image;

	private String genre;

	private String about;
	//
	// private String[] reserved;

	public String getName()
	{
		return name;
	}

	public String getTotalTime()
	{
		return totalTime;
	}

	public Date getDate()
	{
		return date;
	}

	public String getType()
	{
		return type;
	}

	public String getLanguage()
	{
		return language;
	}

	public String getLocation()
	{
		return location;
	}

	public double getPrice()
	{
		return price;
	}

	public String getImage()
	{
		return image;
	}

	public String getGenre()
	{
		return genre;
	}

	public String getAbout()
	{
		return about;
	}

	// public String[] getReserved()
	// {
	// return reserved;
	// }

}
