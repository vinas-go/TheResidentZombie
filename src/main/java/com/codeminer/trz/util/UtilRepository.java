package com.codeminer.trz.util;

import java.sql.*;

public class UtilRepository {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/trz_development", "postgres", "123");
        connection.setAutoCommit(false);
        return connection;
    }

    public static PreparedStatement getPreparedStatement(String query) throws SQLException, ClassNotFoundException {
        return getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
    }


    public static int insert(PreparedStatement preparedStatement) {
        Connection connection = null;
        int id = 0;
        try {
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            connection.commit();
            connection.close();
            preparedStatement.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
        }
        return id;
    }
}
