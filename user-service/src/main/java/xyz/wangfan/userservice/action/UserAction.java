package xyz.wangfan.userservice.action;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.wangfan.userservice.service.OrderServcie;
import xyz.wangfan.userservice.service.UserService;
import xyz.wangfan.userservice.service.impl.OrderServiceImpl;

/**
 * User: van
 * Date: 2019-04-15
 * Time: 10:57
 */
@RestController
@RequestMapping(value = "/user")
public class UserAction {

    @Autowired
    private OrderServcie orderServcie;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get-name/{code}", method = RequestMethod.GET)
    public String getUserNameByCode(@PathVariable("code") String code) {
        return userService.name(code);
    }

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi() {
        return orderServcie.sayHi();

    }

}
