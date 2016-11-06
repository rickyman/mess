package cn.edu.tju.ssm.mapper;

import cn.edu.tju.ssm.po.TbSchool;
import cn.edu.tju.ssm.po.TbSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSchoolMapper {
    int countByExample(TbSchoolExample example);

    int deleteByExample(TbSchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSchool record);

    int insertSelective(TbSchool record);

    List<TbSchool> selectByExample(TbSchoolExample example);

    TbSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSchool record, @Param("example") TbSchoolExample example);

    int updateByExample(@Param("record") TbSchool record, @Param("example") TbSchoolExample example);

    int updateByPrimaryKeySelective(TbSchool record);

    int updateByPrimaryKey(TbSchool record);
}