package com.mydomain.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.common.resources.Resources;
import com.mydomain.domain.Customer;

import java.io.Reader;
import java.io.IOException;
import java.util.List;
import java.sql.SQLException;

/**
 * This is not a best practices class.  It's just an example
 * to give you an idea of how iBATIS works.  For a more complete
 * example, see JPetStore 5.0 at http://www.ibatis.com.
 */
public class SimpleExample {

  /**
   * SqlMapClient instances are thread safe, so you only need one.
   * In this case, we'll use a static singleton.  So sue me.  ;-)
   */
  private static SqlMapClient sqlMapper;

  /**
   * It's not a good idea to put code that can fail in a class initializer,
   * but for sake of argument, here's how you configure an SQL Map.
   */
  static {
    try {
      Reader reader = Resources.getResourceAsReader("com/mydomain/data/SqlMapConfig.xml");
      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
      reader.close(); 
    } catch (IOException e) {
      // Fail fast.
      throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
    }
  }

  public static List selectAllCustomers () throws SQLException {
    return sqlMapper.queryForList("selectAllCustomers");
  }

  public static Customer selectCustomerById  (int id) throws SQLException {
    return (Customer) sqlMapper.queryForObject("selectCustomerById", id);
  }

  public static void insertCustomer () throws SQLException {
    sqlMapper.insert("insertCustomer");
  }

}
