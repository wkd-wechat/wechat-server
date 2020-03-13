package com.wkd.wechat.service;

import com.wkd.wechat.dao.ChatRecordDao;
import com.wkd.wechat.entity.ChatRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRecordService {

    @Autowired
    private ChatRecordDao chatRecordDao;
    public List<ChatRecord> findAllBySession(String session,String quesId,String ansId){
        return chatRecordDao.findAllBySessionAndQuesIdAndAnsIdOrderByTime(session,quesId,ansId);
    }
}
