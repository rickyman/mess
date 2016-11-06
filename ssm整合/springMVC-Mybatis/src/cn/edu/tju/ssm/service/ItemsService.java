package cn.edu.tju.ssm.service;

import java.util.List;

import cn.edu.tju.ssm.po.ItemsCustom;
import cn.edu.tju.ssm.po.ItemsQueryVo;

public interface ItemsService {
	//��ѯ��Ʒ�б�
	public List<ItemsCustom> queryItems(ItemsQueryVo itemsQueryVo ) throws Exception;
	
	//����id��ѯ��Ʒ��Ϣ
	public ItemsCustom findItemsById(int id) throws Exception;
	
	//������Ʒ��Ϣ service�ӿڣ�1.��һְ�� 2.ҵ�����ϸ��
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;
	
}
