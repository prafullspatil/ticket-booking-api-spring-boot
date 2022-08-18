package com.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>
{
	Show findShowById(long id);
}
