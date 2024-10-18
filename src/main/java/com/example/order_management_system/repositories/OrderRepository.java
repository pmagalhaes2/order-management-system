package com.example.order_management_system.repositories;

import com.example.order_management_system.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
