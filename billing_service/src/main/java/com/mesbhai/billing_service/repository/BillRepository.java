package com.mesbhai.billing_service.repository;

import com.mesbhai.billing_service.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
