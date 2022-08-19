package com.mb.controller;

import static com.mb.constant.UrlMapping.SHOWS;
import static com.mb.constant.UrlMapping.SINGLE_SHOW;
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
import com.mb.dto.ShowDto;
import com.mb.entity.Show;
import com.mb.response.SuccResponse;
import com.mb.service.ShowService;

@RestController
public class ShowController extends BaseController
{

	@Autowired
	private ShowService showService;

	@PostMapping(SHOWS)
	public ResponseEntity<SuccResponse> saveShow(@Valid @RequestBody ShowDto showDto)
	{
		SuccResponse responseModel = SuccResponse.getInstance();
		responseModel.setData(showService.saveShow(showDto));
		responseModel.setMessage("Show added Successfully");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<SuccResponse>(responseModel, HttpStatus.ACCEPTED);
	}

	@GetMapping(SHOWS)
	public ResponseEntity<List<Show>> getShow()
	{
		return new ResponseEntity<>(showService.getShow(), HttpStatus.OK);
	}

	@GetMapping(SINGLE_SHOW)
	public ResponseEntity<?> getShowById(@PathVariable("id") long id)
	{

		Show show = showService.getShowById(id);
		return new ResponseEntity<>(show, HttpStatus.OK);

	}

}
