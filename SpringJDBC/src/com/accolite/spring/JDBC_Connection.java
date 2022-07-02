package com.accolite.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBC_Connection {
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.driver}")
	private String driver;
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	
	public void display() {
		System.out.println(url+" "+driver+" "+username+" "+password);
	}
	
	public void establishConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("connection success "+con);
	}

}
