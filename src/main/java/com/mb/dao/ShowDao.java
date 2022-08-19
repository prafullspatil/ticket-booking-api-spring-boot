package com.mb.dao;

import java.util.List;
import com.mb.entity.Show;

public interface ShowDao
{

	public Show saveShow(Show show);

	List<Show> getShow();

	Show getShowById(long id);
}
