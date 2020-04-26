/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import com.bookDao.BookDAO;
import com.bookDao.BookDAOProxy;

/**
 *
 * @author ASUS
 */
public class DAOFactory {
      public static BookDAO getBookDAOInstance(){//取得DAO实例 
         return new BookDAOProxy();//返回代理实例 
    } 
}
