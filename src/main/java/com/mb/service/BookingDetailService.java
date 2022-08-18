package com.mb.service;

import java.util.List;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;

public interface BookingDetailService
{

	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto);

	public List<BookingDetail> getSeatDetails();

	public List<BookingDetail> getReservedSeat(Show id);
}
