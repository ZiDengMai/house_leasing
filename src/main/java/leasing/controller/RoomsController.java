package leasing.controller;


import leasing.entity.Rooms;
import leasing.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roomsController")
public class RoomsController {
    @Autowired
    RoomsService roomsService;

    @RequestMapping("/rooms_panel")
    @ResponseBody
    public List<Rooms> select_all_rooms_group_by_property_id_unit_id(){
        return roomsService.select_all_rooms_group_by_property_id_unit_id();
    }
}
