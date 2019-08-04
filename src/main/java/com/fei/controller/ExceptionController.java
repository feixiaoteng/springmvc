package com.fei.controller;

import com.fei.util.Constants;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author feixiaoteng
 * @create 2019-08-04 1:46
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler({ArithmeticException.class})
    public String testException(Exception exception, Model model){
        System.out.println("@ControllerAdvice:testException:"+exception);
        model.addAttribute("exception",exception.getClass());
        return Constants.SUCCESS;
    }
}