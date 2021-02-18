package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static final Logger logger = LoggerFactory.getLogger(DBManager.class);

//    static final String DB_URL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
//    static final String USR = "root";
//    static final String PWD = "root";

    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    private DBManager() {
        try {
            conn = DriverManager.getConnection(Constants.DB_HOST, Constants.DB_USER, Constants.DB_PASSWORD);
            statement = conn.createStatement();
        } catch (SQLException e) {
            logger.error("connect mysql failed, error: " + e);
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
        String sql = "select * from loginpage";
        try {
            resultSet = getResult(sql);
            while (resultSet.next()) {
                tableList.add(resultSet.getString(3));
            }
        } catch (SQLException e) {
            logger.error("no such table error: " + e);
        }
        return tableList;
    }
}
