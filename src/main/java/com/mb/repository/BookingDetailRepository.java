package com.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.entity.BookingDetail;

public interface BookingDetailRepository extends JpaRepository<BookingDetail, Long>
{

}
