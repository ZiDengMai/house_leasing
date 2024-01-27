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

    @RequestMapping("/cancel_priority")
    @ResponseBody
    public int cancel_priority(String process_id){
        return leasing_processService.cancel_priority(process_id);
    }

    @RequestMapping("/change_application_status")
    @ResponseBody
    public int change_application_status(String process_id){
        return leasing_processService.change_application_status(process_id);
    }

    @RequestMapping("/change_final_status")
    @ResponseBody
    public int change_final_status(String process_id){
        return leasing_processService.change_final_status(process_id);
    }

    @RequestMapping("/change_reverse_status")
    @ResponseBody
    public int change_reverse_status(String process_id){
        return leasing_processService.change_reverse_status(process_id);
    }

    @RequestMapping("/confirm_final_status")
    @ResponseBody
    public int confirm_final_status(String process_id){
        return leasing_processService.confirm_final_status(process_id);
    }

    @RequestMapping("/quickly_complete")
    public int quickly_complete(String process_id){
        return leasing_processService.quickly_complete(process_id);
    }

    @RequestMapping("/set_new_price")
    public int set_new_price(){
        return 0;
    }

    @RequestMapping("/set_up_priority")
    public int set_up_priority(String process_id){
        return leasing_processService.set_up_priority(process_id);
    }
}
