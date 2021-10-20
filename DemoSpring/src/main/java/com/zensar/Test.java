package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctrr =new ClassPathXmlApplicationContext("Springconfig.xml");
		System.out.println("container started...!");
		Student s1 =(Student) ctrr.getBean("sobj");
		System.out.println(s1);
		
	
	}

}
