package com.mb.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;
import com.mb.repository.BookingDetailRepository;
import com.mb.repository.ShowRepository;

@Service
public class BookingDetailServiceImpl implements BookingDetailService
{
	@Autowired
	private BookingDetailRepository seatDetailsRepository;

	@Autowired
	private ShowRepository showRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BookingDetail saveSeatDetails(BookingDetailDto bookingDetailDto)
	{
		System.out.println(bookingDetailDto.getShowId());
		Optional<Show> optionalshow = showRepository.findById(bookingDetailDto.getShowId());

		System.out.println(optionalshow);

		if (!optionalshow.isPresent())
		{
			// throw new CustomException("Product not found");
		}
		Show show = optionalshow.get();
		System.out.println(optionalshow.get().getId());

		BookingDetail seatDetail = new BookingDetail();
		seatDetail.setUserName(bookingDetailDto.getUserName());
		seatDetail.setEmail(bookingDetailDto.getEmail());
		seatDetail.setReserved(bookingDetailDto.getReserved());
		seatDetail.setShow(show);

		return seatDetailsRepository.save(seatDetail);
	}

	@Override
	public List<BookingDetail> getSeatDetails()
	{
		return seatDetailsRepository.findAll();
	}

}
