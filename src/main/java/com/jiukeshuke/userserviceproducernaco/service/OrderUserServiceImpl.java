package com.jiukeshuke.userserviceproducernaco.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jiukeshuke.userserviceproducernaco.entity.OrderUser;
import com.jiukeshuke.userserviceproducernaco.user.dao.OrderUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * @Author
 * @create 2019-06-18
 **/
@Service
public class OrderUserServiceImpl implements OrderUserService {

    @Autowired
    private OrderUserDao orderUserDao;


    @LcnTransaction
    @Transactional
    @Override
    public int insertOrderUser(OrderUser orderUser) throws Exception {
        return orderUserDao.insertOrderUser(orderUser);
    }

    @Override
    public OrderUser selectOrderUserById(Long id) {
        return orderUserDao.selectOrderUserById(id);
    }
}
