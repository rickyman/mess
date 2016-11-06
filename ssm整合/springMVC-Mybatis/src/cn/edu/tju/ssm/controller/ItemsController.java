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
@RequestMapping("/items")//定义根路径url 请求url=根路径url+方法url 窄化请求路径
//查询商品列表
public class ItemsController{
	@Autowired
	private ItemsService itemsService;
   @RequestMapping("/queryItems")//注解时可以省略.action
	public ModelAndView queryItems() throws Exception  {
            List<ItemsCustom> itemsList =itemsService.queryItems(null);
			ModelAndView mv=new ModelAndView();
			mv.addObject("itemsList", itemsList);
			//指定逻辑视图名
			mv.setViewName("itemsList");
		return mv;
	}
   //使用 method=RequestMethod.GET method=RequestMethod.GET可以使得http请求限制为get的请求方式
   //@RequestMapping(value="/editItem",method=RequestMethod.GET)
  //修改商品页面提示
   /*public ModelAndView editItem() throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(1);
		ModelAndView mv=new ModelAndView();
		//模型数据传到jsp页面
		mv.addObject("item", itemsCustom);
		//指定逻辑视图名
		mv.setViewName("editItem");
	return mv;
   }*/
   //使用 method=RequestMethod.GET method=RequestMethod.GET可以使得http请求限制为get的请求方式
  /* @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //返回值为String为逻辑视图名，model的作用是将数据填充到request域  如果参数与http请求中参数是同名的适配器会自动的绑定参数 http中的参数与方法中的形参进行绑定
   public  String editItem(Model model,Integer id) throws Exception{
	   System.out.println("editItem");
	   ItemsCustom itemsCustom =itemsService.findItemsById(id);
	   model.addAttribute("item", itemsCustom);
	return "editItem";
   }*/
   
   //使用 method=RequestMethod.GET method=RequestMethod.GET可以使得http请求限制为get的请求方式
   @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //返回值为String为逻辑视图名，model的作用是将数据填充到request域   @RequestPara设置绑定参数
   public  String editItem(Model model,@RequestParam(value="itemId",required=false,defaultValue="1") Integer id) throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(id);
	   model.addAttribute("item", itemsCustom);
	return "editItem";
   }
   
   //使用 method=RequestMethod.GET method=RequestMethod.GET可以使得http请求限制为get的请求方式
  /* @RequestMapping(value="/editItem",method=RequestMethod.GET)
   //无返回值  原始的servlet请求处理方式  方便处理返回json和xml数据
   public  void editItem(HttpServletRequest request,HttpServletResponse response) throws Exception{
	   ItemsCustom itemsCustom =itemsService.findItemsById(1);
	   request.setAttribute("item", itemsCustom);
	   //此时写完整路径
	   request.getRequestDispatcher("/WEB-INF/jsp/editItem.jsp").forward(request, response); 
   }*/
   @RequestMapping("/editItemSubmit")
   //请求重定向 和请求转发
   public String editItemSubmit(Integer id,ItemsCustom itemsCustom) throws Exception{
	   itemsService.updateItems(id, itemsCustom);
	   return "forward:queryItems.action";
	   //return "redirect:queryItems.action";
   }
}
