package xyz.wangfan.userservice.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: van
 * Date: 2019-04-15
 * Time: 10:57
 */
@RestController
@RequestMapping(value = "/user")
public class UserAction {

    @RequestMapping(value = "/get-name/{code}", method = RequestMethod.GET)
    public String getUserNameByCode(@PathVariable("code") String code) {
        return "张三";
    }

}
