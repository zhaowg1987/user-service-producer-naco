package com.jiukeshuke.userserviceproducernaco.service;

import com.jiukeshuke.userserviceproducernaco.entity.OrderUser;

/**
 * 服务
 *
 * @Author
 * @create 2019-06-18
 **/
public interface OrderUserService {

    int insertOrderUser(OrderUser orderUser) throws Exception;

    OrderUser selectOrderUserById(Long id);

}
