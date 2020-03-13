package com.wkd.wechat.dao;

import com.wkd.wechat.entity.ChatRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChatRecordDao extends JpaRepository<ChatRecord,String> {

    List<ChatRecord> findAllBySessionAndQuesIdAndAnsIdOrderByTime(String session,String quesId,String buyId);
}
