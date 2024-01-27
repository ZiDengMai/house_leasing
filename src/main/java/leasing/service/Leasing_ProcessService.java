package leasing.service;

import leasing.dao.Leasing_processMapper;
import leasing.entity.Leasing_process;
import leasing.entity.Leasing_processExample;
import leasing.entity.Leasing_processExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Leasing_ProcessService {
    @Autowired
    Leasing_processMapper leasing_processMapper;

    public List<Leasing_process> select_leasing_process_group_by_status(){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        Criteria criteria=leasing_processExample.createCriteria();
        leasing_processExample.setOrderByClause("status ASC");
        return leasing_processMapper.selectByExample(leasing_processExample);
    }

    public int cancel_priority(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setIsTopPriority(0);
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int change_application_status(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setApplicationStatus("Complete");
        leasing_process.setStatus("Applied");
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int change_final_status(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setLeaseStatus("Waiting For Confirm");
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int change_reverse_status(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setAdminStatus("Waiting For Confirm");
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int confirm_final_status(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setStatus("Complete");
        leasing_process.setLeaseStatus("Complete");
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int confirm_reverse_status(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setStatus("Reserved");
        leasing_process.setAdminStatus("Complete");
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int quickly_complete(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setStatus("Complete");
        leasing_process.setIsTopPriority(1);
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }

    public int set_new_price(){
        return 0;
    }

    public int set_up_priority(String process_id){
        Leasing_processExample leasing_processExample=new Leasing_processExample();
        leasing_processExample.createCriteria().andProcessIdEqualTo(process_id);
        Leasing_process leasing_process=new Leasing_process();
        leasing_process.setIsTopPriority(1);
        return leasing_processMapper.updateByExampleSelective(leasing_process,leasing_processExample);
    }
}
