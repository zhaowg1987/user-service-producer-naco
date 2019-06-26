package com.jiukeshuke.userserviceproducernaco.user.dao;

import com.jiukeshuke.userserviceproducernaco.entity.OrderUser;

/**
 * 用户操作Dao层
 *
 * @Author
 * @create 2019-06-18
 **/
public interface OrderUserDao {

    int insertOrderUser(OrderUser orderUser);

    OrderUser selectOrderUserById(Long id);
}
