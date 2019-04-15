package xyz.wangfan.orderservice.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.wangfan.orderservice.service.UserService;
import xyz.wangfan.orderservice.vo.PlaceOrderVo;


/**
 * User: van
 * Date: 2019-04-15
 * Time: 10:56
 */
@RestController
@RequestMapping(value = "/order")
public class OrderAction {

    @Value("${url}") // git配置文件里的key
    private String url;


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/place-order", method = RequestMethod.POST)
    public String placeOrder(@RequestBody PlaceOrderVo placeOrderVo) {
        String name = userService.getNameByCode(placeOrderVo.getCode());

        return name + "下了单：" + placeOrderVo.getSkuCode();
    }


    @RequestMapping(value = "/hi")
    public String hi() {
        return "the default websiteis：" + url;
    }

}
