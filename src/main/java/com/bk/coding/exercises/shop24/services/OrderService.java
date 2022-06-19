package com.bk.coding.exercises.shop24.services;

import com.bk.coding.exercises.shop24.models.Order;
import com.bk.coding.exercises.shop24.reposotories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public Order saveOrder(Order order) {

        Date odt = new Date();
        Date expdt;

        Calendar c = Calendar.getInstance();
        c.setTime(odt);
        c.add(Calendar.DATE, 2); //expires after 2 days
        expdt = c.getTime();
        order.setOrderDate(odt);
        order.setExpDate(expdt);
        order.setOrderRefNo(UUID.randomUUID());

        return orderRepo.save(order);
    }

    public Order findOrder(UUID orderRefNo) {
        return orderRepo.findByOrderRefNo(orderRefNo);
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }
}
