package com.jd.login;

import java.sql.*;
import java.util.logging.Logger;

/**
 * Created by huyanxia on 2017/8/31.
 */
public class MysqlConnection {
    private static Logger logger = Logger.getLogger(MysqlConnection.class.getName());
    private static Connection connection = null;
    private final static String url = "jdbc:mysql://localhost:3306/mybatis";
    private final static String name = "root";
    private final static String password = "123456";
    private final static String driver = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, name, password);
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            logger.severe("驱动加载失败" + cne);
        } catch (SQLException se) {
            se.printStackTrace();
            logger.severe("数据库连接失败" + se);
        } catch (Exception e) {
            logger.severe("服务器内部异常" + e);
        }
        return connection;
    }

    public static void release(Connection con, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException sql) {
                logger.severe("数据库关闭异常" + sql);
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException sql) {
                logger.severe("数据库关闭异常" + sql);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException sql) {
                logger.severe("数据库关闭异常" + sql);
            }
        }
    }
}
