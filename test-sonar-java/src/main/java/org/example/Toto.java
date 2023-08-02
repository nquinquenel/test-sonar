package org.example;

import java.sql.*;
import java.util.Enumeration;
import java.util.function.Supplier;

public class Toto {
  public void getUser(Connection con, String user) throws SQLException {

    Statement stmt1 = null;
    Statement stmt2 = null;
    PreparedStatement pstmt;
    try {
      stmt1 = con.createStatement();
      ResultSet rs1 = stmt1.executeQuery("GETDATE()"); // No issue; hardcoded query

      stmt2 = con.createStatement();
      ResultSet rs2 = stmt2.executeQuery("select FNAME, LNAME, SSN " +
              "from USERS where UNAME=" + user);  // Sensitive

      pstmt = con.prepareStatement("select FNAME, LNAME, SSN " +
              "from USERS where UNAME=" + user);  // Sensitive
      ResultSet rs3 = pstmt.executeQuery();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}