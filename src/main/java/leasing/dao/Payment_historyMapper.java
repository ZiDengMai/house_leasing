package leasing.dao;

import java.util.List;
import leasing.entity.Payment_history;
import leasing.entity.Payment_historyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Payment_historyMapper {
    long countByExample(Payment_historyExample example);

    int deleteByExample(Payment_historyExample example);

    int deleteByPrimaryKey(Long paymentId);

    int insert(Payment_history record);

    int insertSelective(Payment_history record);

    List<Payment_history> selectByExampleWithBLOBs(Payment_historyExample example);

    List<Payment_history> selectByExample(Payment_historyExample example);

    Payment_history selectByPrimaryKey(Long paymentId);

    int updateByExampleSelective(@Param("record") Payment_history record, @Param("example") Payment_historyExample example);

    int updateByExampleWithBLOBs(@Param("record") Payment_history record, @Param("example") Payment_historyExample example);

    int updateByExample(@Param("record") Payment_history record, @Param("example") Payment_historyExample example);

    int updateByPrimaryKeySelective(Payment_history record);

    int updateByPrimaryKeyWithBLOBs(Payment_history record);

    int updateByPrimaryKey(Payment_history record);
}