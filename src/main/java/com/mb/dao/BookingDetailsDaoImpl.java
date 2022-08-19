package com.mb.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;
import com.mb.entity.User;
import com.mb.exception.CustomException;
import com.mb.repository.BookingDetailRepository;
import com.mb.repository.ShowRepository;
import com.mb.repository.UserRepository;

@Repository
public class BookingDetailsDaoImpl implements BookingDetailsDao
{
	@Autowired
	private BookingDetailRepository bookingDetailRepository;

	@Autowired
	private ShowRepository showRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto)
	{
		Optional<Show> optionalShow = showRepository.findById(bookingDetailDto.getShowId());
		Optional<User> optionalUser = userRepository.findById(bookingDetailDto.getUserId());

		User user = optionalUser.get();
		Show show = optionalShow.get();
		BookingDetail seatDetail = new BookingDetail();
		seatDetail.setUser(user);
		seatDetail.setReserved(bookingDetailDto.getReserved());
		seatDetail.setShow(show);
		try
		{
			return bookingDetailRepository.save(seatDetail);
		}
		catch (Exception e)
		{
			throw new CustomException("Error while saving Movie");
		}

	}

	@Override
	public List<BookingDetail> getSeatDetails()
	{
		return bookingDetailRepository.findAll();
	}

	@Override
	public List<BookingDetail> getReservedSeat(Show id)
	{

		return bookingDetailRepository.findReservedSeats(id);
	}

}
