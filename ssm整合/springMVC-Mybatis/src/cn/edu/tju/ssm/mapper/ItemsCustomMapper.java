package cn.edu.tju.ssm.mapper;

import java.util.List;

import cn.edu.tju.ssm.po.ItemsCustom;
import cn.edu.tju.ssm.po.ItemsQueryVo;

public interface ItemsCustomMapper {
public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo ) throws Exception;
}
