package com.example.btlsoc.controller;

import com.example.btlsoc.model.Order;
import com.example.btlsoc.model.User;
import com.example.btlsoc.security.CustomUserDetailsService;
import com.example.btlsoc.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @GetMapping("order/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable(name = "id") int id){
        Optional<Order> order = orderService.findById(id);
        return new ResponseEntity<>(order.get(), HttpStatus.OK);
    }

    @GetMapping("orders")
    public ResponseEntity<List<Order>> getOrders(Principal principal){
        List<Order> orders = new ArrayList<>();
        User user = (User) customUserDetailsService.loadUserByUsername(principal.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getUsername());
        System.out.println(user.getId());
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
