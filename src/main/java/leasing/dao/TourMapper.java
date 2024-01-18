package leasing.dao;

import java.util.List;
import leasing.entity.Tour;
import leasing.entity.TourExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TourMapper {
    long countByExample(TourExample example);

    int deleteByExample(TourExample example);

    int deleteByPrimaryKey(String tourId);

    int insert(Tour record);

    int insertSelective(Tour record);

    List<Tour> selectByExample(TourExample example);

    Tour selectByPrimaryKey(String tourId);

    int updateByExampleSelective(@Param("record") Tour record, @Param("example") TourExample example);

    int updateByExample(@Param("record") Tour record, @Param("example") TourExample example);

    int updateByPrimaryKeySelective(Tour record);

    int updateByPrimaryKey(Tour record);
}