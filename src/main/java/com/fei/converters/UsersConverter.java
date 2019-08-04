package com.fei.converters;

import com.fei.entity.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 自定义类型转换器:页数传入(1id-name-password)格式的数据字符串,如果请求的属性名称和方法的入参名称相同,且入参类型是Users类型,就会使用该类型转换器
 */
public class UsersConverter implements Converter<String, Users> {
    public Users convert(String s) {
        Users u= null;
        if(StringUtils.hasLength(s)) {
            String[] split = s.split("-");
            if (split.length==3) {
                u = new Users(Long.parseLong(split[0]),split[1],split[2]);
            }
        }
        return u;
    }
}
