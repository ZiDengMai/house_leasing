package leasing.dao;

import java.util.List;
import leasing.entity.Early_move_in_apply;
import leasing.entity.Early_move_in_applyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Early_move_in_applyMapper {
    long countByExample(Early_move_in_applyExample example);

    int deleteByExample(Early_move_in_applyExample example);

    int deleteByPrimaryKey(String earlyMoveInId);

    int insert(Early_move_in_apply record);

    int insertSelective(Early_move_in_apply record);

    List<Early_move_in_apply> selectByExample(Early_move_in_applyExample example);

    Early_move_in_apply selectByPrimaryKey(String earlyMoveInId);

    int updateByExampleSelective(@Param("record") Early_move_in_apply record, @Param("example") Early_move_in_applyExample example);

    int updateByExample(@Param("record") Early_move_in_apply record, @Param("example") Early_move_in_applyExample example);

    int updateByPrimaryKeySelective(Early_move_in_apply record);

    int updateByPrimaryKey(Early_move_in_apply record);
}