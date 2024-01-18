package leasing.dao;

import java.util.List;
import leasing.entity.Tenants;
import leasing.entity.TenantsExample;
import org.apache.ibatis.annotations.Param;

public interface TenantsMapper {
    long countByExample(TenantsExample example);

    int deleteByExample(TenantsExample example);

    int deleteByPrimaryKey(String tenantsId);

    int insert(Tenants record);

    int insertSelective(Tenants record);

    List<Tenants> selectByExample(TenantsExample example);

    Tenants selectByPrimaryKey(String tenantsId);

    int updateByExampleSelective(@Param("record") Tenants record, @Param("example") TenantsExample example);

    int updateByExample(@Param("record") Tenants record, @Param("example") TenantsExample example);

    int updateByPrimaryKeySelective(Tenants record);

    int updateByPrimaryKey(Tenants record);
}