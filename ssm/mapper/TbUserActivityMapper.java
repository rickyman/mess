package cn.edu.tju.ssm.mapper;

import cn.edu.tju.ssm.po.TbUserActivity;
import cn.edu.tju.ssm.po.TbUserActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserActivityMapper {
    int countByExample(TbUserActivityExample example);

    int deleteByExample(TbUserActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserActivity record);

    int insertSelective(TbUserActivity record);

    List<TbUserActivity> selectByExample(TbUserActivityExample example);

    TbUserActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserActivity record, @Param("example") TbUserActivityExample example);

    int updateByExample(@Param("record") TbUserActivity record, @Param("example") TbUserActivityExample example);

    int updateByPrimaryKeySelective(TbUserActivity record);

    int updateByPrimaryKey(TbUserActivity record);
}