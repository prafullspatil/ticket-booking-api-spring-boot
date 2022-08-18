package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dto.ShowDto;
import com.mb.entity.Show;
import com.mb.repository.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService
{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ShowRepository showRepository;

	@Override
	public List<Show> getShow()
	{
		return showRepository.findAll();
	}

	@Override
	public Show saveShow(ShowDto showDto)
	{
		Show show = modelMapper.map(showDto, Show.class);
		return showRepository.save(show);
	}

	@Override
	public Show getShowById(long id)
	{

		return showRepository.findShowById(id);

	}

	@Override
	public Show updateShow(long id, ShowDto showDto)
	{
		Show oldShow = showRepository.findShowById(id);
		Show updatedShow = modelMapper.map(showDto, Show.class);
		updatedShow.setId(oldShow.getId());
		// updatedUser.setUser(employeeUuid);

		return showRepository.save(updatedShow);
	}

}
