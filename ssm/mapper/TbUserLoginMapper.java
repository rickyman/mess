package cn.edu.tju.ssm.mapper;

import cn.edu.tju.ssm.po.TbUserLogin;
import cn.edu.tju.ssm.po.TbUserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserLoginMapper {
    int countByExample(TbUserLoginExample example);

    int deleteByExample(TbUserLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserLogin record);

    int insertSelective(TbUserLogin record);

    List<TbUserLogin> selectByExample(TbUserLoginExample example);

    TbUserLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserLogin record, @Param("example") TbUserLoginExample example);

    int updateByExample(@Param("record") TbUserLogin record, @Param("example") TbUserLoginExample example);

    int updateByPrimaryKeySelective(TbUserLogin record);

    int updateByPrimaryKey(TbUserLogin record);
}