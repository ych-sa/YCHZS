package com.bookDao;

import com.dbc.DBConnection;
import com.vo.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class BookDAOImp implements BookDAO{
    public Connection con=null;
    public PreparedStatement ps=null;
    public BookDAOImp(Connection con){
        this.con=con;
    }
    @Override
     public void deleteBook()throws SQLException{
         String sql = "delete from Book";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.executeUpdate();
         if(this.ps!=null)
         ps.close();
     }
    @Override
    public void saveTable(Book book)throws SQLException{
      
        String sql="insert into Book values(?,?,?,?,?,?)";
        PreparedStatement ps=this.con.prepareStatement(sql);
        ps.setString(1,book.getBookId());
        ps.setString(2,book.getBookName());
        ps.setString(3, book.getAuthor());
        ps.setString(4,book.getPublishingName());
        ps.setString(5,book.getPublishingDate());
        ps.setString(6,book.getStatus());
        ps.executeUpdate();
        if(this.ps!=null)
        ps.close();
  
    }
    @Override
    public ResultSet findBook(Book book)throws SQLException{
        String sql="select * from Book where BookID like ? and BookName like ? and Author like ? and Press like ? and PressDate like ? and Status like ?";
        PreparedStatement ps=this.con.prepareStatement(sql);
        book.changeAttribute();//判断是否有属性为空
        ps.setString(1,book.getBookId());
        ps.setString(2, book.getBookName());
        ps.setString(3, book.getAuthor());
        ps.setString(4,book.getPublishingName());
        ps.setString(5,book.getPublishingDate());
        ps.setString(6,book.getStatus());
        ResultSet rs=ps.executeQuery();
        return rs;
    }
}
