package com.example.btlsoc.repository;

import com.example.btlsoc.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
//    Optional<Order> findByOrderByIdAndUserId(int order_id, int user_id);
}
