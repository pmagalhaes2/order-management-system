package com.example.order_management_system.repositories;

import com.example.order_management_system.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
