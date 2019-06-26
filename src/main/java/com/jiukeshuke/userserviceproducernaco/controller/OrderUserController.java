package com.jiukeshuke.userserviceproducernaco.controller;

import com.jiukeshuke.userserviceproducernaco.entity.CommonRespData;
import com.jiukeshuke.userserviceproducernaco.entity.OrderUser;
import com.jiukeshuke.userserviceproducernaco.service.OrderUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单用户Controller
 *
 * @Author
 * @create 2019-06-18
 **/
@Slf4j
@RestController
public class OrderUserController {

    @Autowired
    private OrderUserService orderUserService;

    @RequestMapping("/insertUser")
    public CommonRespData insertOrder(@RequestBody OrderUser orderUser) {
        CommonRespData commonRespData = new CommonRespData();
        try {
            orderUserService.insertOrderUser(orderUser);
            commonRespData.setStatus(200);
            commonRespData.setMessage("操作成功");
            commonRespData.setData(orderUser);
        } catch (Exception e) {
            commonRespData.setStatus(500);
            commonRespData.setMessage(e.toString());
            log.error("存储用户信息发生异常。", e);
        }
        return commonRespData;
    }

    @RequestMapping("/getOrderUser")
    public CommonRespData getOrderUser(Long orderUserId) {
        CommonRespData commonRespData = new CommonRespData();
        try {
            OrderUser orderUser = orderUserService.selectOrderUserById(orderUserId);
            commonRespData.setStatus(200);
            commonRespData.setMessage("操作成功");
            commonRespData.setData(orderUser);
        } catch (Exception e) {
            commonRespData.setStatus(500);
            commonRespData.setMessage(e.toString());
            log.error("查询出现异常.", e);
        }
        return commonRespData;
    }


}
