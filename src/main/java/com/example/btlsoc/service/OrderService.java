package com.example.btlsoc.service;


import com.example.btlsoc.model.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface OrderService {
    Optional<Order> findById(int id);

    Optional<Order> findByOrderByIdAndUserId(int order_id, int user_id);
}
