package spring1218.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring1218.dao.ItemDAO;
import spring1218.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {
	//DAO를 주입받기 위해서 선언한 변수
	@Autowired
	private ItemDAO itemDao;
	
	@Override
	public void getItem() {
		Item item = itemDao.getItem(1);
		System.out.printf("번호:%d 이름:%s\n", item.getNum(),item.getName());
	}
}
