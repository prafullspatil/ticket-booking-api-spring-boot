package com.mb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookingDetails")
public class BookingDetail
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;

	private String email;

	private String[] reserved;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "show_id", nullable = false, updatable = false)
	private Show show;

	public String[] getReserved()
	{
		return reserved;
	}

	public void setReserved(String[] reserved)
	{
		this.reserved = reserved;
	}

	public long getId()
	{
		return id;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getEmail()
	{
		return email;
	}

	public Show getShow()
	{
		return show;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setShow(Show show)
	{
		this.show = show;
	}

	// private String[] reserved;

}
