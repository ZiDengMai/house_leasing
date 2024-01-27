package leasing.controller;

import leasing.dao.Log_infoMapper;
import leasing.entity.Log_info;
import leasing.service.Log_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log_infoController")
public class Log_infoController {
    @Autowired
    Log_infoService log_infoService;

    @RequestMapping("/log_application_submission_confirmation")
    @ResponseBody
    public int log_application_submission_confirmation(@RequestBody Log_info log_info){
        return log_infoService.log_application_submission_confirmation(log_info);
    }
}
