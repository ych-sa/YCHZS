/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookDao;

import com.dbc.DBConnection;
import com.vo.Book;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class BookDAOProxy implements BookDAO{
       private DBConnection dbc=null;//定义数据库连接 
       private BookDAO dao=null;//定义DAO接口 
  public BookDAOProxy(){ 
      try{ 
         this.dbc=new DBConnection();//实例化数据库连接  
      }catch(Exception e){ 
          e.printStackTrace(); 
      } 
      this.dao=new BookDAOImp(dbc.getCon()); 
  } 

    @Override
    public void deleteBook() throws SQLException {
        dao.deleteBook();
        dbc.closeCon();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveTable(Book book) throws SQLException {
        dao.saveTable(book);
        dbc.closeCon();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findBook(Book book) throws SQLException {
        ResultSet rs=null;
        rs=dao.findBook(book);
        return rs;//To change body of generated methods, choose Tools | Templates.
    }
}
