package com.mb.constant;

public class UrlMapping
{

	private UrlMapping()
	{
		throw new IllegalStateException("Constants class.can't instatiate");
	}

	public static final String BASE_URL = "/api";

	public static final String USERS = "/users";
	public static final String SHOWS = "/shows";
	public static final String SINGLE_SHOW = "/shows/{id}";

	public static final String BOOKINGS = "/bookings";
	public static final String RESERVED = "/bookings/{id}";

}
