package com.mb.dto;

import java.sql.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ShowDto
{

	@NotEmpty
	private String name;

	@NotEmpty
	private String totalTime;

	private Date date;

	@NotEmpty
	private String type;

	@NotEmpty
	private String language;

	@NotEmpty
	private String location;

	@NotNull
	private double price;

	@NotEmpty
	private String image;

	@NotEmpty
	private String genre;

	@NotEmpty
	private String about;

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

}
