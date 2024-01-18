package leasing.dao;

import java.util.List;
import leasing.entity.Rooms;
import leasing.entity.RoomsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoomsMapper {
    long countByExample(RoomsExample example);

    int deleteByExample(RoomsExample example);

    int deleteByPrimaryKey(String roomId);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    List<Rooms> selectByExample(RoomsExample example);

    List<Rooms> select_all_rooms_group_by_property_id_unit_id(RoomsExample example);

    Rooms selectByPrimaryKey(String roomId);

    int updateByExampleSelective(@Param("record") Rooms record, @Param("example") RoomsExample example);

    int updateByExample(@Param("record") Rooms record, @Param("example") RoomsExample example);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);
}