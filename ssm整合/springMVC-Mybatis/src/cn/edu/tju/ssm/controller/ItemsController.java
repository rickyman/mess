package cn.edu.tju.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.tju.ssm.po.ItemsCustom;
import cn.edu.tju.ssm.po.ItemsQueryVo;
import cn.edu.tju.ssm.service.ItemsService;
@org.springframework.stereotype.Controller
@RequestMapping("/items")//�����·��url ����url=��·��url+����url խ������·��
//��ѯ��Ʒ�б�
public class ItemsController{
	@Autowired
	private ItemsService itemsService;
   @RequestMapping("/queryItems")//ע��ʱ����ʡ��.action
	public ModelAndView queryItems() throws Exception  {
            List<ItemsCustom> itemsList =itemsService.queryItems(null);
			ModelAndView mv=new ModelAndView();
			mv.addObject("itemsList", itemsList);
			//ָ���߼���ͼ��
			mv.setViewName("itemsList");
		return mv;
	}
   //ʹ�� method=RequestMethod.GET method=RequestMethod.GET����ʹ��http��������Ϊget������ʽ
   //@RequestMapping(value="/editItem",method=RequestMethod.GET)
  //�޸���Ʒҳ����ʾ
   /*public ModelAndView editItem() throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(1);
		ModelAndView mv=new ModelAndView();
		//ģ�����ݴ���jspҳ��
		mv.addObject("item", itemsCustom);
		//ָ���߼���ͼ��
		mv.setViewName("editItem");
	return mv;
   }*/
   //ʹ�� method=RequestMethod.GET method=RequestMethod.GET����ʹ��http��������Ϊget������ʽ
  /* @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //����ֵΪStringΪ�߼���ͼ����model�������ǽ�������䵽request��  ���������http�����в�����ͬ�������������Զ��İ󶨲��� http�еĲ����뷽���е��βν��а�
   public  String editItem(Model model,Integer id) throws Exception{
	   System.out.println("editItem");
	   ItemsCustom itemsCustom =itemsService.findItemsById(id);
	   model.addAttribute("item", itemsCustom);
	return "editItem";
   }*/
   
   //ʹ�� method=RequestMethod.GET method=RequestMethod.GET����ʹ��http��������Ϊget������ʽ
   @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //����ֵΪStringΪ�߼���ͼ����model�������ǽ�������䵽request��   @RequestPara���ð󶨲���
   public  String editItem(Model model,@RequestParam(value="itemId",required=false,defaultValue="1") Integer id) throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(id);
	   model.addAttribute("item", itemsCustom);
	return "editItem";
   }
   
   //ʹ�� method=RequestMethod.GET method=RequestMethod.GET����ʹ��http��������Ϊget������ʽ
  /* @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //�޷���ֵ  ԭʼ��servlet������ʽ  ���㴦����json��xml����
   public  void editItem(HttpServletRequest request,HttpServletResponse response) throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(1);
	   request.setAttribute("item", itemsCustom);
	   //��ʱд����·��
	   request.getRequestDispatcher("/WEB-INF/jsp/editItem.jsp").forward(request, response); 
   }*/
   @RequestMapping("/editItemSubmit")
   //�����ض��� ������ת��
   public String editItemSubmit(Integer id,ItemsCustom itemsCustom) throws Exception{
	   itemsService.updateItems(id, itemsCustom);
	   return "forward:queryItems.action";
	   //return "redirect:queryItems.action";
   }
}
