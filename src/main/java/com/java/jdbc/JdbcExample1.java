package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sreekar", "Sreekar", "Sree@1234");
//           here sree is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from securityusers;");

//            ResultSet resultSet = stmt.executeQuery("adfaf");
//            int i = stmt.executeUpdate("");
//            boolean execute = stmt.execute("");

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3)
                        + "  " + rs.getString(4) + "  " + rs.getString(5));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



