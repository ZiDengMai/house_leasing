package leasing.service;

import leasing.dao.RoomsMapper;
import leasing.entity.Rooms;
import leasing.entity.RoomsExample;
import leasing.entity.RoomsExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomsService {

    @Autowired
    RoomsMapper roomsMapper;

    public List<Rooms> select_rooms_by_room_id(String room_id){
        RoomsExample roomsExample=new RoomsExample();
        Criteria criteria=roomsExample.createCriteria();
        criteria.andRoomIdEqualTo(room_id);
        return roomsMapper.selectByExample(roomsExample);
    }

    public List<Rooms> select_all_rooms_group_by_property_id_unit_id(){
        RoomsExample roomsExample=new RoomsExample();
        Criteria criteria=roomsExample.createCriteria();
        roomsExample.setOrderByClause("property_id ASC,unit_id ASC");
        return roomsMapper.select_all_rooms_group_by_property_id_unit_id(roomsExample);
    }
}
