package leasing.dao;

import java.util.List;
import leasing.entity.Leasing_process;
import leasing.entity.Leasing_processExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Leasing_processMapper {
    long countByExample(Leasing_processExample example);

    int deleteByExample(Leasing_processExample example);

    int deleteByPrimaryKey(String processId);

    int insert(Leasing_process record);

    int insertSelective(Leasing_process record);

    List<Leasing_process> selectByExample(Leasing_processExample example);

    Leasing_process selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") Leasing_process record, @Param("example") Leasing_processExample example);

    int updateByExample(@Param("record") Leasing_process record, @Param("example") Leasing_processExample example);

    int updateByPrimaryKeySelective(Leasing_process record);

    int updateByPrimaryKey(Leasing_process record);
}