package spring1218;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring1218.config.AppContext;
import spring1218.controller.ItemController;
import spring1218.dao.ItemDAO;
import spring1218.service.ItemServiceImpl;

public class Main {

	public static void main(String[] args) {
		/*
		//일반적인 프로그래밍에서는 객체생성을 직접 해야 한다
		ItemDAO itemDao = new ItemDAO();
		
		ItemServiceImpl itemService = new ItemServiceImpl();
		itemService.setItemDao(itemDao);
		
		ItemController itemController = new ItemController();
		itemController.setItemService(itemService);
		itemController.getItem();
		*/
		
		/*
		//설정파일 가져오기
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(
				"classpath:applicationContext.xml");
		*/
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		
		//bean을 가져오기
		ItemController itemController = context.getBean(ItemController.class);
		itemController.getItem();
		
		context.close();
	}

}
