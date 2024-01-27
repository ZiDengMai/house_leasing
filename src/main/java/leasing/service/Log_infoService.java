package leasing.service;

import leasing.dao.Log_infoMapper;
import leasing.entity.Log_info;
import leasing.entity.Log_infoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class Log_infoService {

    @Autowired
    Log_infoMapper log_infoMapper;

    public int log_application_submission_confirmation(Log_info log_info){
        log_info.setLogId(UUID.randomUUID().toString());
        log_info.setTimeStamp(new Date());
        return log_infoMapper.insert(log_info);
    }
}
