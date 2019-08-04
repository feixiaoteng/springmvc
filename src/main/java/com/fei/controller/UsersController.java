package com.fei.controller;

import com.fei.entity.Users;
import com.fei.service.UsersService;
import com.fei.util.Constants;
import com.fei.valid.UsersValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebInitParam;
import javax.validation.Valid;
import java.util.List;


/**
 * @author feixiaoteng
 * @create 2019-06-28 2:15
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
   /* @GetMapping("/create")
    public Object create(@Valid Users users, BindingResult bindingResult){
        List<FieldError> errors = bindingResult.getFieldErrors();
        for (FieldError error : errors) {
            System.out.println("field = " + error.getField());
            System.out.println("defaultMessage = " + error.getDefaultMessage());
        }
        usersService.add(users);
        return Constants.SUCCESS;
    }*/

@GetMapping("/create")
public Object create(@Validated({UsersValid.class}) Users users, BindingResult bindingResult){
    List<FieldError> errors = bindingResult.getFieldErrors();
    for (FieldError error : errors) {
        System.out.println("field = " + error.getField());
        System.out.println("defaultMessage = " + error.getDefaultMessage());
    }
    usersService.add(users);
    return Constants.SUCCESS;
}
    @GetMapping("/update")
    public Object update(Users users){
        System.out.println(users);
        return Constants.SUCCESS;
    }


    /**
     * 返回值可以使用(forward:)(redirect:)为前缀,转发或者是重定向
     */
    @GetMapping("/get")
    @ResponseBody
    public Object get(Long id){
        return usersService.get(id);
    }


    /**
     * 由 @InitBinder 标识的方法• ，可以对 WebDataBinder 对
     * 象进行初始化。WebDataBinder 是 DataBinder 的子类，用
     * 于完成由表单字段到 JavaBean 属性的绑定
     * @InitBinder方法不能有返回值，它必须声明为void• 。
     * @InitBinder方法的参数通常是是 WebDataBinder
     */
@InitBinder
public void initBinder(WebDataBinder dataBinder){
    dataBinder.setDisallowedFields("name");
}
  /*  @ModelAttribute
    public void getModelAttribute(Long id,Model model){//id=1
        model.addAttribute("u",new Users(id,"代腾飞","123456"));
        return ;
    }*/
    /*    @GetMapping("cookleValue")
    @ResponseBody
    public String testCookleValue(@CookieValue(value = "JSESSIONID",required = false)String sessionId, Map<String,Object> map){
        System.out.println("JSESSIONID = " + sessionId);
        System.out.println("map = " + map);
        return sessionId;
    }*/
    /*@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String get(@PathVariable("id")Long id){
        System.out.println("id = [" + id + "]");
        return Constants.SUCCESS;
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String post(){
        System.out.println("post");
        return Constants.SUCCESS;
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public String delete(){
        System.out.println("delete");
        return Constants.SUCCESS;
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public String put(){
        System.out.println("put");
        return Constants.SUCCESS;
    }*/
}
