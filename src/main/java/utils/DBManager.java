package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
    static final String USR = "root";
    static final String PWD = "root";

    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    private DBManager() {
        try {
            conn = DriverManager.getConnection(DB_URL, USR, PWD);
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static DBManager instance = new DBManager();

    public static DBManager getInstance() {
        return instance;
    }

    public ResultSet getResult(String sql) {
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public List<String> getTables() {
        ArrayList<String> tableList = new ArrayList<String>();
        String sql = "show tables";
        try {
            resultSet = getResult(sql);
            while (resultSet.next()) {
                tableList.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableList;
    }
}
