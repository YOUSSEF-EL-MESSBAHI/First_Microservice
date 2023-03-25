package com.mesbhai.billing_service.repository;

import com.mesbhai.billing_service.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
