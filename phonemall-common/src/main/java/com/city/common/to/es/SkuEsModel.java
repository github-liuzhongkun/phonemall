package com.city.common.to.es;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:41:33
 **/

@Data
public class SkuEsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catalogId;

    private String brandName;

    private String brandImg;

    private String catalogName;

    private List<Attrs> attrs;

    @Data
    public static class Attrs implements Serializable {
        private static final long serialVersionUID = 1L;

        private Long attrId;

        private String attrName;

        private String attrValue;

    }


}
