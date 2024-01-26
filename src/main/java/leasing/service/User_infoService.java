package leasing.service;

import leasing.dao.User_infoMapper;
import leasing.entity.User_info;
import leasing.entity.User_infoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_infoService {
    @Autowired
    User_infoMapper user_infoMapper;

    public List<User_info> get_all_user_info(){
        return user_infoMapper.selectByExample(new User_infoExample());
    }

    public List<User_info> getUser_infoByMail(String email){
        User_infoExample user_infoExample=new User_infoExample();
        user_infoExample.createCriteria().andEmailEqualTo(email);
        return user_infoMapper.selectByExample(user_infoExample);
    }
}
