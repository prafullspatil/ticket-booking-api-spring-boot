package com.mb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.dto.BookingDetailDto;
import com.mb.entity.BookingDetail;
import com.mb.response.SuccResponse;
import com.mb.service.BookingDetailService;

@RestController
public class BookingDetailController extends BaseController
{

	@Autowired
	private BookingDetailService seatDetailsService;

	@PostMapping("/seat-details")
	public ResponseEntity<SuccResponse> saveSeatDetails(@RequestBody BookingDetailDto bookingDetailDto)
	{
		SuccResponse responseModel = SuccResponse.getInstance();
		responseModel.setData(seatDetailsService.saveSeatDetails(bookingDetailDto));
		responseModel.setMessage("User Registered Successfully");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<SuccResponse>(responseModel, HttpStatus.ACCEPTED);
	}

	@GetMapping("/seat-details")
	public ResponseEntity<List<BookingDetail>> getSeatDetails()
	{
		return new ResponseEntity<>(seatDetailsService.getSeatDetails(), HttpStatus.OK);
	}

}
