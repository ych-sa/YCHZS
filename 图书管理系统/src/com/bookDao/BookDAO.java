/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookDao;

import com.vo.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public interface BookDAO {
    /**
     * @throws SQLException 
     */
    public void deleteBook()throws SQLException;      
   /**
    * 
    * @param book 
    * @throws SQLException 
    */
    public void saveTable(Book book)throws SQLException;
    /**
     * 
     * @param book
     * @return
     * @throws SQLException 
     */
    public ResultSet findBook(Book book)throws SQLException;
  
}
