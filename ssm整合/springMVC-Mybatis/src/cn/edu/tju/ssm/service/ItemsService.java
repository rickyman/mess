package cn.edu.tju.ssm.service;

import java.util.List;

import cn.edu.tju.ssm.po.ItemsCustom;
import cn.edu.tju.ssm.po.ItemsQueryVo;

public interface ItemsService {
	//查询商品列表
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo ) throws Exception;
	
	//根据id查询商品信息
	public ItemsCustom findItemsById(int id) throws Exception;
	
	//更新商品信息 service接口：1.单一职责 2.业务参数细化
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;
	
}
