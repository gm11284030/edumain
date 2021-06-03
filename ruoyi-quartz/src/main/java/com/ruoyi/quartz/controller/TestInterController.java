package com.ruoyi.quartz.controller;

import com.ruoyi.quartz.service.ITestEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test/inter")
public class TestInterController {

    @Autowired
    ITestEduService testEduService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Map<Object,Object> insertInfo(@RequestBody Map<String, String> req, HttpServletRequest request)throws Exception{

        Map<Object,Object> result = new HashMap<Object,Object>();
        int gost = testEduService.insertInfo(req);
        if(gost==1){
            result.put("rtnCode","0");
            result.put("rtnMsg","入库成功！");
        }else{
            result.put("rtnCode","-1");
            result.put("rtnMsg","入库成功！");
        }
        return result;
    }

}
