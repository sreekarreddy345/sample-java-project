package com.java.jdbc;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class JdbcDatabaseExample1 {
    @Test
    public static void jdbcConnection() throws SQLException {
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sreekar", "Sreekar", "Sree@1234");
//
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student;");
//            todo preparedStatement and Callable statement
//            PreparedStatement preparedStatement = connection.prepareStatement("");
//            CallableStatement callableStatement = connection.prepareCall("");

//          todo to perform batch query
//            stmt.addBatch("");
//            stmt.addBatch("");
//            stmt.addBatch("");
//            stmt.executeBatch();

//            ResultSet resultSet = stmt.executeQuery("adfaf");
//            int i = stmt.executeUpdate("");
//            boolean execute = stmt.execute("");

            while (rs.next())
//                System.out.println(rs);
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3)
                        + "  " + rs.getString(4) + "  - " + rs.getString(5));
            if (rs.getString(3).equals("Sreekar")) {

                Assert.assertEquals(rs.getString(5), "835 Paisley Court", "Address not same");
                Assert.assertEquals(rs.getString(5), "835 Paisley Court", "Address not same");
                Assert.assertEquals(rs.getString(5), "835 Paisley Court", "Address not same");
            }
            rs.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error  - " + e);
        } finally {
            stmt.close();
            if (connection != null)
                connection.close();
        }
    }
}



