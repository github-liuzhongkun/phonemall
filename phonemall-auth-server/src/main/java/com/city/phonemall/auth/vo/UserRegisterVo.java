package com.city.phonemall.auth.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@Data
public class UserRegisterVo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 6, max = 19, message = "用户名长度在6-18字符")
    private String userName;

    @NotEmpty(message = "密码必须填写")
    @Length(min = 6, max = 18, message = "密码必须是6—18位字符")
    private String password;

    @NotEmpty(message = "手机号不能为空")
    @Pattern(regexp = "^[1]([3-9])[0-9]{9}$", message = "手机号格式不正确")
    private String phone;

    @NotEmpty(message = "验证码不能为空")
    private String code;

}
