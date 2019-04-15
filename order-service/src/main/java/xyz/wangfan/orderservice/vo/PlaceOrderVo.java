package xyz.wangfan.orderservice.vo;

/**
 * User: van
 * Date: 2019-04-15
 * Time: 11:26
 */
public class PlaceOrderVo {
    private String code;
    private String skuCode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Override
    public String toString() {
        return "PlaceOrderVo{" +
                "code='" + code + '\'' +
                ", skuCode='" + skuCode + '\'' +
                '}';
    }
}
