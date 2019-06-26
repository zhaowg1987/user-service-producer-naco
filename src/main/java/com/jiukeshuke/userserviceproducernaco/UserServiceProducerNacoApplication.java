package com.jiukeshuke.userserviceproducernaco;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//指定扫描的mapper接口所在的包
@MapperScan("com.jiukeshuke.userserviceproducernaco.**.dao")
@EnableFeignClients
@EnableDistributedTransaction
@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceProducerNacoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProducerNacoApplication.class, args);
    }

}
