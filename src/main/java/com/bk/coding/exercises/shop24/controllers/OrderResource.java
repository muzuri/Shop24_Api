package com.bk.coding.exercises.shop24.controllers;

import com.bk.coding.exercises.shop24.models.Order;
import com.bk.coding.exercises.shop24.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderResource {
    @Autowired
    OrderService orderService;


    @PostMapping("/new")
    public Order saveCargo(@RequestBody Order order) {
        System.out.println("Create new order........" + order);
        return orderService.saveOrder(order);
    }
}
