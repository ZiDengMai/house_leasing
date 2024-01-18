package leasing.dao;

import java.util.List;
import leasing.entity.Parking_spot;
import leasing.entity.Parking_spotExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Parking_spotMapper {
    long countByExample(Parking_spotExample example);

    int deleteByExample(Parking_spotExample example);

    int deleteByPrimaryKey(String propertyId);

    int insert(Parking_spot record);

    int insertSelective(Parking_spot record);

    List<Parking_spot> selectByExample(Parking_spotExample example);

    Parking_spot selectByPrimaryKey(String propertyId);

    int updateByExampleSelective(@Param("record") Parking_spot record, @Param("example") Parking_spotExample example);

    int updateByExample(@Param("record") Parking_spot record, @Param("example") Parking_spotExample example);

    int updateByPrimaryKeySelective(Parking_spot record);

    int updateByPrimaryKey(Parking_spot record);
}