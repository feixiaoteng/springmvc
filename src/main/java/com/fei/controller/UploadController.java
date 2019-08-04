package com.fei.controller;

import com.fei.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author feixiaoteng
 * @create 2019-08-04 5:33
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String upload(MultipartFile file){
        if(file!=null && !file.isEmpty()){
            //此时可以上传文件
        }
        return Constants.SUCCESS;
    }
}
