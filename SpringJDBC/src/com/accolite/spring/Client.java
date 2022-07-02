package com.accolite.spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		JDBC_Connection jdbc= context.getBean("jdbc", JDBC_Connection.class);
		jdbc.display();
		jdbc.establishConnection();
	}

}
