package myAirtelPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("airtelspring.xml");
		Airtel serviceobj = (Airtel)context.getBean("service");
		serviceobj.calltheservice();

	}

}
