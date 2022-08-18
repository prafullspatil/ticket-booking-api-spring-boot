package com.mb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.mb.entity.BookingDetail;
import com.mb.entity.Show;

public interface BookingDetailRepository extends JpaRepository<BookingDetail, Long>
{

	@Query(value = "SELECT b FROM BookingDetail b  where show=(?1)")
	public List<BookingDetail> findReservedSeats(Show id);
}
