package spring1218.dao;

import org.springframework.stereotype.Repository;

import spring1218.domain.Item;

@Repository
public class ItemDAO {
	public Item getItem(int num) {
		Item item = new Item();
		item.setNum(num);
		item.setName("apple");
		return item;
	}
}
