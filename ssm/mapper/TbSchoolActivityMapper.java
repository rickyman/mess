package cn.edu.tju.ssm.mapper;

import cn.edu.tju.ssm.po.TbSchoolActivity;
import cn.edu.tju.ssm.po.TbSchoolActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSchoolActivityMapper {
    int countByExample(TbSchoolActivityExample example);

    int deleteByExample(TbSchoolActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSchoolActivity record);

    int insertSelective(TbSchoolActivity record);

    List<TbSchoolActivity> selectByExample(TbSchoolActivityExample example);

    TbSchoolActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSchoolActivity record, @Param("example") TbSchoolActivityExample example);

    int updateByExample(@Param("record") TbSchoolActivity record, @Param("example") TbSchoolActivityExample example);

    int updateByPrimaryKeySelective(TbSchoolActivity record);

    int updateByPrimaryKey(TbSchoolActivity record);
}