package com.nucarf.controller;


import com.nucarf.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Api(tags = "订单模块")
@RestController
public class OrderController {

    @ApiOperation(value = "订单列表")
    @GetMapping("/orderList")
    public List<Order> orderList(){
        Order order1 = new Order("1","电脑");
        Order order2 = new Order("2","键盘");
        Order order3 = new Order("3","鼠标");
        Order order4 = new Order("4","手机");

        return Arrays.asList(order1,order2,order3,order4);
    }


}
