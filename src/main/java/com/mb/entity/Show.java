package com.mb.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shows")
public class Show
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "total_time")
	private String totalTime;

	@Column(name = "date")
	private Date date;

	@Column(name = "type")
	private String type;

	@Column(name = "language")
	private String language;

	@Column(name = "location")
	private String location;

	@Column(name = "price")
	private double price;

	@Column(name = "image")
	private String image;

	@Column(name = "genre")
	private String genre;

	@Column(name = "about")
	private String about;

	public long getId()
	{
		return id;
	}

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

	public void setId(long id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setTotalTime(String totalTime)
	{
		this.totalTime = totalTime;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setAbout(String about)
	{
		this.about = about;
	}

	// public void setReserved(String[] reserved)
	// {
	// this.reserved = reserved;
	// }

}
