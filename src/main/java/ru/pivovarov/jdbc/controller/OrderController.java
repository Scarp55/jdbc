package ru.pivovarov.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pivovarov.jdbc.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/fetch-product")
    @ResponseBody
    public List<String> transfer(@RequestParam(value = "name") String customerName) {
        return orderService.getProductNameFromCustomerName(customerName);
    }
}
