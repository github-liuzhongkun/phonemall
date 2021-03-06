package com.city.phonemall.ware.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 9:46:28
 **/

@Data
public class WareSkuLockVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderSn;

    /** 需要锁住的所有库存信息 **/
    private List<OrderItemVo> locks;



}
