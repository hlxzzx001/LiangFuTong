package com.LFT.controller;

import com.LFT.pojo.AdminStore;
import com.LFT.service.AdminStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/adminStore")
public class AdminStoreController {

    @Autowired
    private AdminStoreService adminStoreService;

    @RequestMapping("/getuserallfoodinfor")
    @ResponseBody
    public List<AdminStore> findAll(String num){
     return adminStoreService.findAll(num);
    }

}
