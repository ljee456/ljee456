package spring1218.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring1218.service.ItemServiceImpl;

@Controller
public class ItemController {
	//Service 변수
	@Autowired
	private ItemServiceImpl itemService;

	
	//사용자의 요청을 받아서 서비스를 호출하는 메소드
	public void getItem() {
		itemService.getItem();
	}
}
