package com.fei.controller;

import com.fei.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * @author feixiaoteng
 * @create 2019-08-04 0:35
 */
@Controller
public class TestController {
    /**
     * @ExceptionHandler: 在@Controller中只能作用该类所发生的的异常
     *  属性:指定处理异常类型的类
     * @param ex 异常对象
     * @param model 可以向页面传递
     */
    /*@ExceptionHandler({ArithmeticException.class})
    public String testException(Exception ex, Model model){
        System.out.println("ex = " + ex.getMessage());
        model.addAttribute("ex",ex.getMessage());
        return Constants.SUCCESS;
    }*/
    @Autowired
    private MessageSource messageSource;
    @RequestMapping("test")
    public String test(Locale locale){
        System.out.println(messageSource.getMessage("i18n.name",null,locale));
        return Constants.SUCCESS;
    }
}
