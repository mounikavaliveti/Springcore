import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Springcore.xml");
		SpringCustomer cust=(SpringCustomer) context.getBean("Customer");
		cust.printDetails();
	}

}
