package com.mb.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mb.entity.Show;
import com.mb.exception.CustomException;
import com.mb.repository.ShowRepository;

@Repository
public class ShowDaoImpl implements ShowDao
{
	@Autowired
	private ShowRepository showRepository;

	@Override
	public Show saveShow(Show show)
	{

		try
		{
			return showRepository.save(show);
		}
		catch (Exception e)
		{
			throw new CustomException("Error while saving Movie");
		}
	}

	@Override
	public List<Show> getShow()
	{

		return showRepository.findAll();
	}

	@Override
	public Show getShowById(long id)
	{

		return showRepository.findShowById(id);
	}

}
