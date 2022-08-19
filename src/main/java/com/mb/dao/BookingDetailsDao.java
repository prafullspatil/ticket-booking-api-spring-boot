package com.mb.dao;

import java.util.List;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;

public interface BookingDetailsDao
{

	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto);

	public List<BookingDetail> getSeatDetails();

	public List<BookingDetail> getReservedSeat(Show id);
}
