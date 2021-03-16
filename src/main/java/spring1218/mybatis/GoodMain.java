package spring1218.mybatis;

import org.springframework.context.support.GenericXmlApplicationContext;

public class GoodMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(
				"classpath:dbContext.xml");
		GoodDAO dao = context.getBean(GoodDAO.class);
		//System.out.printf("%s\n", dao.getlist());
		System.out.printf("%s\n", dao.getgood(1));
		context.close();
	}

}
