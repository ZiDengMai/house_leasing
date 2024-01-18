package leasing.dao;

import java.util.List;
import leasing.entity.User_info;
import leasing.entity.User_infoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface User_infoMapper {
    long countByExample(User_infoExample example);

    int deleteByExample(User_infoExample example);

    int deleteByPrimaryKey(String email);

    int insert(User_info record);

    int insertSelective(User_info record);

    List<User_info> selectByExample(User_infoExample example);

    User_info selectByPrimaryKey(String email);

    int updateByExampleSelective(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByExample(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByPrimaryKeySelective(User_info record);

    int updateByPrimaryKey(User_info record);
}