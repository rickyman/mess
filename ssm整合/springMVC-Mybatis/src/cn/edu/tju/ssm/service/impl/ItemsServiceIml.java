package cn.edu.tju.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.tju.ssm.mapper.ItemsCustomMapper;
import cn.edu.tju.ssm.mapper.ItemsMapper;
import cn.edu.tju.ssm.po.Items;
import cn.edu.tju.ssm.po.ItemsCustom;
import cn.edu.tju.ssm.po.ItemsQueryVo;
import cn.edu.tju.ssm.service.ItemsService;

public class ItemsServiceIml implements ItemsService {
    //注入ItemsCustomMapper
	@Autowired
	private ItemsCustomMapper itemsCustomMapper;
	@Autowired
	private ItemsMapper itemsMapper;
	@Override//查询商品列表
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsCustomMapper.queryItems(itemsQueryVo);
	}
	
	@Override//根据id查询商品信息
	public ItemsCustom findItemsById(int id) throws Exception {
		//业务层处理使得以后可扩展化 不能单纯地调用dao层
		ItemsCustom itemsCustom=new ItemsCustom();
		Items items=itemsMapper.selectByPrimaryKey(id);
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}
	@Override//更新商品信息 service接口：1.单一职责 2.业务参数细化
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		//关键参数的非空校验
		if(id==null){
			//抛出异常 通知controller非空时不能调用该方法
		}
		else
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}

}
