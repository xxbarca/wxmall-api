package com.li.missyou.repository;

import com.li.missyou.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    @Query("select c from Coupon c " +
            "join c.categoryList ca " +
            "join Activity a on a.id = c.activityId " +
            "where ca.id = :cid " +
            "and a.startTime < :now " +
            "and a.endTime > :now")
    List<Coupon> findByCategory(Long cid, Date now);
}
