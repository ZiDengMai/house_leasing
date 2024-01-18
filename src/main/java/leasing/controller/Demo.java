package leasing.controller;

import leasing.entity.Rooms;
import leasing.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Demo {
    @Autowired
    RoomsService roomsService;

    /*@RequestMapping("/demo")
    public String helloWorld(){
        return "hello world";
    }*/

    @RequestMapping("/demo")
    @ResponseBody
    public List<Rooms> select_rooms_by_room_id(){
        return roomsService.select_rooms_by_room_id("1410 A1-1");
    }
}
