package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dao.BookingDetailsDao;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;

@Service
public class BookingDetailServiceImpl implements BookingDetailService
{

	@Autowired
	private BookingDetailsDao bookingDetailsDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto)
	{

		return bookingDetailsDao.saveSeatDetails(bookingDetailDto);
	}

	@Override
	public List<BookingDetail> getSeatDetails()
	{
		return bookingDetailsDao.getSeatDetails();
	}

	@Override
	public List<BookingDetail> getReservedSeat(Show id)
	{
		return bookingDetailsDao.getReservedSeat(id);
	}

}
