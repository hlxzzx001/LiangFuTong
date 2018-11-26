package com.LFT.controller;

import com.LFT.pojo.Order;
import com.LFT.pojo.OrderItem;
import com.LFT.pojo.User;
import com.LFT.pojo.UserFood;
import com.LFT.service.*;
import com.LFT.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cash")
public class CashierEndController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserFoodService userFoodService;


    /**
     * 根据订单id查询订单信息
     * @param orderID
     * @return
     */
    @RequestMapping(value = "queryorderinfo", method = RequestMethod.POST)
    @ResponseBody
    public String queryOrderByID(@RequestParam("orderid") String orderID){
        Map<String, Object> result = new HashMap<String, Object>();
        Order order = orderService.selectById(orderID);
        if (order != null){
            int orderItemNum = orderItemService.queryOrderItemNumByOrderID(orderID);
            List<OrderItem> orderItemList = orderItemService.queryOrderItem(orderID);
            result.put("message","success");
            result.put("orderitemnum", orderItemNum);
            result.put("order",order);
            result.put("orderlist",orderItemList);
            return JsonUtil.map2json(result);
        }else {
            result.put("message","no order");
            return JsonUtil.map2json(result);
        }

    }

    /**
     *
     *根据用户账号查询用户的信息 和 存粮信息
     * @param phone
     * @return
     */
    @RequestMapping(value = "queryuserinfo", method = RequestMethod.POST)
    @ResponseBody
    public String queryUserInfo(@RequestParam("phone") String phone){
        Map<String, Object> result = new HashMap<String, Object>();
        if (userService.queryByUsername(phone)){
            User user = userService.queryUserByUsername(phone);
            List<UserFood> userFoodList = userFoodService.queryUserAllFood(user.getUserId());
            result.put("message","success");
            result.put("user",user);
            result.put("userfood",userFoodList);
            return JsonUtil.map2json(result);
        }else {
            result.put("message","no user");
            return JsonUtil.map2json(result);
        }
    }

}
