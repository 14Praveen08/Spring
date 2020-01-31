package com.sample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * ApplicationContext AC = new ClassPathXmlApplicationContext("spring.xml");
		 * Vehicle obj = (Vehicle)AC.getBean("bike"); obj.drive();
		 */
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Tyre t=(Tyre)context.getBean("tyre");
    	System.out.println(t);
		
    }
}
