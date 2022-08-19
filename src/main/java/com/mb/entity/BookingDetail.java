package com.mb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookingDetails")
public class BookingDetail extends Auditable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@Column(name = "reserved")
	private String[] reserved;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "show_id", nullable = false, updatable = false)
	private Show show;

	public BookingDetail()
	{
		super();
	}

	public BookingDetail(long id, User user, String[] reserved, Show show)
	{
		super();
		this.id = id;
		this.user = user;
		this.reserved = reserved;
		this.show = show;
	}

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

	public Show getShow()
	{
		return show;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public void setShow(Show show)
	{
		this.show = show;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

}
