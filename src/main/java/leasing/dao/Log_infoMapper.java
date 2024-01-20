package leasing.dao;

import java.util.List;
import leasing.entity.Log_info;
import leasing.entity.Log_infoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Log_infoMapper {
    long countByExample(Log_infoExample example);

    int deleteByExample(Log_infoExample example);

    int deleteByPrimaryKey(String logId);

    int insert(Log_info record);

    int insertSelective(Log_info record);

    List<Log_info> selectByExample(Log_infoExample example);

    Log_info selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") Log_info record, @Param("example") Log_infoExample example);

    int updateByExample(@Param("record") Log_info record, @Param("example") Log_infoExample example);

    int updateByPrimaryKeySelective(Log_info record);

    int updateByPrimaryKey(Log_info record);
}