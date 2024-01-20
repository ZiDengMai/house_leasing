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

}
