package xyz.wangfan.userservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.wangfan.userservice.service.impl.OrderServiceImpl;

/**
 * User: van
 * Date: 2019-05-29
 * Time: 15:58
 */

@FeignClient(name = "order-service", fallback = OrderServiceImpl.class)
public interface OrderServcie {

    @RequestMapping(value = "/order/hi", method = RequestMethod.GET)
    public String sayHi();
}
