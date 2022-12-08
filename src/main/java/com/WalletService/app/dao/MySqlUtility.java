package com.WalletService.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlUtility {

    public static Connection getConnectionToMySQL() {
        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6582970", "sql6582970", "Es8GwBpTIv");
            System.out.println("Connection to MYSQL successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

//    public static void main(String[] args) {
//        getConnectionToMySQL();
//    }
}

