package cn.edu.tju.ssm.mapper;

import cn.edu.tju.ssm.po.TbCoach;
import cn.edu.tju.ssm.po.TbCoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCoachMapper {
    int countByExample(TbCoachExample example);

    int deleteByExample(TbCoachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCoach record);

    int insertSelective(TbCoach record);

    List<TbCoach> selectByExample(TbCoachExample example);

    TbCoach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCoach record, @Param("example") TbCoachExample example);

    int updateByExample(@Param("record") TbCoach record, @Param("example") TbCoachExample example);

    int updateByPrimaryKeySelective(TbCoach record);

    int updateByPrimaryKey(TbCoach record);
}