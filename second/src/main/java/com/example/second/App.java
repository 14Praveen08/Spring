package com.example.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext AC = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj = (Vehicle)AC.getBean("vehicle");
    	obj.drive();
		/*
		 * Vehicle v = new Car(); 
		 * Vehicle v = new Bike(); 
		 * v.drive();
		 */
    }
}
