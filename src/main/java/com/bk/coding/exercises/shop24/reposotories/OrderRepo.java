package com.bk.coding.exercises.shop24.reposotories;

import com.bk.coding.exercises.shop24.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepo extends JpaRepository<Order, Long> {
    Order findByOrderRefNo(UUID clientUuid);
}
