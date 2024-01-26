package leasing.controller;

import leasing.entity.User_info;
import leasing.service.User_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user_infoController")
public class User_infoController {
    @Autowired
    User_infoService user_infoService;

    @RequestMapping("/get_all_user_info")
    @ResponseBody
    public List<User_info> get_all_user_info(){
        return user_infoService.get_all_user_info();
    }

    @RequestMapping("/getUser_infoByMail")
    @ResponseBody
    public List<User_info> getUser_infoByMail(String email){
        return  user_infoService.getUser_infoByMail(email);
    }
}
