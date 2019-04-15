package xyz.wangfan.orderservice.service.impl;

import org.springframework.stereotype.Component;
import xyz.wangfan.orderservice.service.UserService;

/**
 * User: van
 * Date: 2019-04-15
 * Time: 11:27
 */
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getNameByCode(String code) {
        return "用户服务访问失败";
    }
}
