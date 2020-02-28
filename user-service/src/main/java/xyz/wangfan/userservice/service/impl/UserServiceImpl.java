package xyz.wangfan.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import xyz.wangfan.userservice.service.UserService;

/**
 * User: van
 * Date: 2020-02-28
 * Time: 14:14
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String name(String code) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();

        return ops.get(code);
    }
}
