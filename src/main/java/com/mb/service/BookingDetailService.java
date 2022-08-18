package com.mb.service;

import java.util.List;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;

public interface BookingDetailService
{

	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto);

	public List<BookingDetail> getSeatDetails();
}
