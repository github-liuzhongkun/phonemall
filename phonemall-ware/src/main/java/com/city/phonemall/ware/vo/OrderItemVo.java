package com.city.phonemall.ware.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class OrderItemVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long skuId;

    private Boolean check;

    private String title;

    private String image;

    /**
     * 商品套餐属性
     */
    private List<String> skuAttrValues;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    /** 商品重量 **/
    private BigDecimal weight = new BigDecimal("0.085");
}
