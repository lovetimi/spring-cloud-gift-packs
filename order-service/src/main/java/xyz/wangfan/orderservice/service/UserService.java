package xyz.wangfan.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.wangfan.orderservice.service.impl.UserServiceImpl;

/**
 * User: van
 * Date: 2019-04-15
 * Time: 11:27
 */
@FeignClient(name = "user-service", fallback = UserServiceImpl.class)
public interface UserService {

    @RequestMapping(value = "/user/get-name/{code}", method = RequestMethod.GET)
    public String getNameByCode(@PathVariable("code") String code);

}
