import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionsTest {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Springcore.xml");
		SpringQuestions que=(SpringQuestions) context.getBean("Questions");
		assertAll(
				()->assertEquals(que.getQuestion(),"What is your favourite food?"),
				()->assertEquals(que.getQuestionId(),12)
			);
	}

}
