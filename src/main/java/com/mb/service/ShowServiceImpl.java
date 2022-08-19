package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dao.ShowDao;
import com.mb.dto.ShowDto;
import com.mb.entity.Show;

@Service
public class ShowServiceImpl implements ShowService
{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ShowDao showDao;

	@Override
	public List<Show> getShow()
	{
		return showDao.getShow();
	}

	@Override
	public Show saveShow(ShowDto showDto)
	{
		Show show = modelMapper.map(showDto, Show.class);
		return showDao.saveShow(show);
	}

	@Override
	public Show getShowById(long id)
	{

		return showDao.getShowById(id);

	}

}
