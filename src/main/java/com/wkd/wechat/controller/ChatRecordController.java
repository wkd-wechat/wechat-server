package com.wkd.wechat.controller;

import com.wkd.wechat.entity.ChatRecord;
import com.wkd.wechat.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatRecordController {

    @Autowired
    private ChatRecordService chatRecordService;
    @GetMapping("/findAll")
    public List<ChatRecord> findAll(String session,String salerId,String buyerId){
        return chatRecordService.findAllBySession(session,salerId,buyerId);
    }
}
