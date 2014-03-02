package com.mydomain.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mydomain.data.SimpleExample;

public class Main {

  /**
   * @param args
   * @throws SQLException 
   */
  public static void main(String[] args) throws SQLException {

    SimpleExample se = new SimpleExample();
    se.insertCustomer();
    List lst = se.selectAllCustomers();
    System.out.println("lst: " + lst.size());
  }

}
