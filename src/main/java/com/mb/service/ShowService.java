package com.mb.service;

import java.util.List;
import com.mb.dto.ShowDto;
import com.mb.entity.Show;

public interface ShowService
{
	public Show saveShow(ShowDto showDto);

	List<Show> getShow();

	Show getShowById(long id);

}
