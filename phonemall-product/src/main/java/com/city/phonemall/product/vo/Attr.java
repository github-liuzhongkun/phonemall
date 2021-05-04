package com.city.phonemall.product.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 08:26:33
 */

@Data
public class Attr implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long attrId;
  private String attrName;
  private String attrValue;
}
