package javademo.databaseDemo;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver"); // load the class into program

        String name = "root";
        String password = "abcd1234";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost::3306/world",
                name,
                password);

        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM Faculty");

        while(resultSet.next()) {
            System.out.println(
                    resultSet.getString(2) + " " +
                    resultSet.getString(3) + " " +
                            resultSet.getInt(5)
            );
        }

        connection.close();
    }
}
