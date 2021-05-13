package com.Mounika;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});
        
        	Employee cust = (Employee)context.getBean("emp");
        	
        	System.out.println(cust);
        	
        	context.close();
    }
}
