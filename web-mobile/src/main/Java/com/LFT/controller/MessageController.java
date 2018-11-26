package com.LFT.controller;

import com.LFT.pojo.Message;
import com.LFT.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    /**
     * 消息的控制类
     */

    @Autowired
    private MessageService messageService;

    @RequestMapping("getusermessage")
    @ResponseBody
    public List<Message> getAllMessage(@RequestParam("uid") String UserID) {


        return messageService.queryMessageByUserID(Integer.valueOf(UserID));


    }

}
