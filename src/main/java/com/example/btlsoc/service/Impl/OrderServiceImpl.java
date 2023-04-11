package com.example.btlsoc.service.Impl;

import com.example.btlsoc.model.Order;
import com.example.btlsoc.repository.OrderRepository;
import com.example.btlsoc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Optional<Order> findById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public Optional<Order> findByOrderByIdAndUserId(int order_id, int user_id) {
//        return orderRepository.findByOrderByIdAndUserId(order_id, user_id);
        return null;
    }
}
