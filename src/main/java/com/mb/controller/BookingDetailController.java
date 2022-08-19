package com.mb.controller;

import static com.mb.constant.UrlMapping.BOOKINGS;
import static com.mb.constant.UrlMapping.RESERVED;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;
import com.mb.response.SuccResponse;
import com.mb.service.BookingDetailService;

@RestController
public class BookingDetailController extends BaseController
{

	@Autowired
	private BookingDetailService seatDetailsService;

	@PostMapping(BOOKINGS)
	public ResponseEntity<SuccResponse> saveSeatDetails(@Valid @RequestBody BookingDetailDto bookingDetailDto)
	{
		SuccResponse responseModel = SuccResponse.getInstance();
		responseModel.setData(seatDetailsService.saveSeatDetails(bookingDetailDto));
		responseModel.setMessage("Book Successfully");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<SuccResponse>(responseModel, HttpStatus.ACCEPTED);
	}

	@GetMapping(BOOKINGS)
	public ResponseEntity<List<BookingDetail>> getSeatDetails()
	{
		return new ResponseEntity<>(seatDetailsService.getSeatDetails(), HttpStatus.OK);
	}

	@GetMapping(RESERVED)
	public ResponseEntity<List<BookingDetail>> getReservedSeats(@PathVariable Show id)
	{
		return new ResponseEntity<>(seatDetailsService.getReservedSeat(id), HttpStatus.OK);
	}

}
