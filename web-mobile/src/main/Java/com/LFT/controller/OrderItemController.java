package com.LFT.controller;

import com.LFT.pojo.Order;
import com.LFT.pojo.OrderItem;
import com.LFT.service.OrderItemService;
import com.LFT.service.OrderService;
import com.LFT.utils.JsonUtil;
import com.LFT.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/orderItem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
    @Autowired
    private OrderService orderService;

    /**
     * 一个生成订单
     */
    @RequestMapping("/createOrderItem")
    @ResponseBody
    public String createOrderItem(OrderItem orderItem, @RequestParam("uid") String uid) {
        Map<String, String> result = new HashMap<String, String>();
        String oid = UUIDUtils.getOrderIdByTime();
        //创建订单项
        orderItem.setOrderitemId(UUIDUtils.getOrderIdByTime());
        orderItem.setOrderId(oid);
        int rows = orderItemService.OrderItemAdd(orderItem);
        //创建订单
        Order order = new Order();
        order.setOrderPaytype(orderItem.getOrderItemPay());
        order.setOrderMoney(orderItem.getOrderitemTotalmoney());
        order.setOrderCreatetime(new Date());
        order.setOrderUpdatetime(new Date());
        order.setOrderStatus(1);//1.未交易 2.交易成功
        order.setOrderId(oid);
        order.setUserId(uid);
        int row1 = orderService.createOrder(order);
        if (rows == 1 || row1 == 1) {
            result.put("message", "success");
            result.put("orderid", oid);
        }
        return JsonUtil.map2json(result);
    }

}