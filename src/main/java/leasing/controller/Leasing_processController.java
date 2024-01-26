package leasing.controller;


import leasing.entity.Leasing_process;
import leasing.service.Leasing_ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leasing_processController")
public class Leasing_processController {

    @Autowired
    Leasing_ProcessService leasing_processService;

    @RequestMapping("/select_leasing_process_group_by_status")
    @ResponseBody
    public List<Leasing_process> select_leasing_process_group_by_status(){
        return leasing_processService.select_leasing_process_group_by_status();
    }

}
