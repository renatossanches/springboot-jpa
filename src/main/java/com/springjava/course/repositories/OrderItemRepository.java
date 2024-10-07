package com.springjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.course.entities.OrderItem;
import com.springjava.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
