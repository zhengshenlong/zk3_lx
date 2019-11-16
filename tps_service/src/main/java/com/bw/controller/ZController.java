package com.bw.controller;


import com.bw.bean.Zy;
import com.bw.service.ZService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
@CrossOrigin
@RequestMapping("/zsl/")
public class ZController {

    @Autowired
    private ZService  zService;

    @GetMapping("list")
    public PageInfo<Zy> zhanshi(@RequestParam(defaultValue = "1",value = "pageNo")Integer pageNo,
                                @RequestParam(defaultValue = "2",value = "pageSize")Integer pageSize){
        return  zService.selectAll(pageNo,pageSize);
    }
}
