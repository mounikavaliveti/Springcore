import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringTestDriver {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Springcore.xml");
		SpringCustomer cust=(SpringCustomer) context.getBean("Customer");
		assertAll(
		()->assertEquals(cust.getCustomerName(),"Mounika"),
		()->assertEquals(cust.getCustomerId(),101),
		()->assertEquals(cust.getCustomerContact(),9720531773L),
		()->assertEquals(cust.getCustomerAddress().getStreet(),"Hyderabad"),
		()->assertEquals(cust.getCustomerAddress().getCity(),"Hyderabad"),
		()->assertEquals(cust.getCustomerAddress().getZip(),123456),
		()->assertEquals(cust.getCustomerAddress().getCountry(),"India")
	);
	}

}
