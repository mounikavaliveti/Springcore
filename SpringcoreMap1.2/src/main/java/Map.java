

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Springcore.xml");
		SpringQuestions que=(SpringQuestions) context.getBean("Questions");
		que.output();

	}

}
