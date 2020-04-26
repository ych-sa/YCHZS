/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ASUS
 */
public class DBConnection {
        private static final String DBdriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DBURL="jdbc:sqlserver://localhost:1433;DatabaseName=BookDB"; 
	private static final String DBUSER="sa"; 
	private static final String DBPASS="123456"; 
	private Connection con=null; 
	public DBConnection(){
		try {
			Class.forName(DBdriver);
			this.con=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public Connection getCon(){
		return this.con;
	}
	public void closeCon(){
		if(this.con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
