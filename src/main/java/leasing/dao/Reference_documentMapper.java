package leasing.dao;

import java.util.List;
import leasing.entity.Reference_document;
import leasing.entity.Reference_documentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Reference_documentMapper {
    long countByExample(Reference_documentExample example);

    int deleteByExample(Reference_documentExample example);

    int deleteByPrimaryKey(String referenceDocumentId);

    int insert(Reference_document record);

    int insertSelective(Reference_document record);

    List<Reference_document> selectByExample(Reference_documentExample example);

    Reference_document selectByPrimaryKey(String referenceDocumentId);

    int updateByExampleSelective(@Param("record") Reference_document record, @Param("example") Reference_documentExample example);

    int updateByExample(@Param("record") Reference_document record, @Param("example") Reference_documentExample example);

    int updateByPrimaryKeySelective(Reference_document record);

    int updateByPrimaryKey(Reference_document record);
}