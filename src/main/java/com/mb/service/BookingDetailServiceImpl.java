package com.mb.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;
import com.mb.entity.User;
import com.mb.repository.BookingDetailRepository;
import com.mb.repository.ShowRepository;
import com.mb.repository.UserRepository;

@Service
public class BookingDetailServiceImpl implements BookingDetailService
{
	@Autowired
	private BookingDetailRepository seatDetailsRepository;

	@Autowired
	private ShowRepository showRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

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

		return seatDetailsRepository.save(seatDetail);
	}

	@Override
	public List<BookingDetail> getSeatDetails()
	{
		return seatDetailsRepository.findAll();
	}

	@Override
	public List<BookingDetail> getReservedSeat(Show id)
	{
		return seatDetailsRepository.findReservedSeats(id);
	}

}
