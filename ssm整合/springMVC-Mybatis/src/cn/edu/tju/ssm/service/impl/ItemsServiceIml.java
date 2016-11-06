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
    //ע��ItemsCustomMapper
	@Autowired
	private ItemsCustomMapper itemsCustomMapper;
	@Autowired
	private ItemsMapper itemsMapper;
	@Override//��ѯ��Ʒ�б�
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsCustomMapper.queryItems(itemsQueryVo);
	}
	
	@Override//����id��ѯ��Ʒ��Ϣ
	public ItemsCustom findItemsById(int id) throws Exception {
		//ҵ��㴦��ʹ���Ժ����չ�� ���ܵ����ص���dao��
		ItemsCustom itemsCustom=new ItemsCustom();
		Items items=itemsMapper.selectByPrimaryKey(id);
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}
	@Override//������Ʒ��Ϣ service�ӿڣ�1.��һְ�� 2.ҵ�����ϸ��
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		//�ؼ������ķǿ�У��
		if(id==null){
			//�׳��쳣 ֪ͨcontroller�ǿ�ʱ���ܵ��ø÷���
		}
		else
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}

}
