package com.mb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.dto.ShowDto;
import com.mb.entity.Show;
import com.mb.response.SuccResponse;
import com.mb.service.ShowService;

@RestController
public class ShowController extends BaseController
{

	@Autowired
	private ShowService showService;

	@PostMapping("/shows")
	public ResponseEntity<SuccResponse> saveShow(@RequestBody ShowDto showDto)
	{
		SuccResponse responseModel = SuccResponse.getInstance();
		responseModel.setData(showService.saveShow(showDto));
		responseModel.setMessage("User Registered Successfully");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<SuccResponse>(responseModel, HttpStatus.ACCEPTED);
	}

	@GetMapping("/shows")
	public ResponseEntity<List<Show>> getShow()
	{
		return new ResponseEntity<>(showService.getShow(), HttpStatus.OK);
	}

	@GetMapping("/shows/{id}")
	public ResponseEntity<?> getShowById(@PathVariable("id") long id)
	{

		Show show = showService.getShowById(id);
		return new ResponseEntity<>(show, HttpStatus.OK);

	}

	@PutMapping("/shows/{id}")
	public ResponseEntity<?> updateShow(@PathVariable long id,
			@RequestBody ShowDto showDto)
	{

		Show show = showService.updateShow(id, showDto);

		return new ResponseEntity<>(show, HttpStatus.OK);
	}
}
