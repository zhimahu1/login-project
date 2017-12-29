package com.jd.login;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;

import java.util.logging.Logger;

/**
 * IUserDao接口的实现类
 *
 * @author gacl
 */
public class UserDaoImpl implements IUserDao {
    /**
     * JDBC通过用户名和密码进行查询，登录时
     *
     * @author gacl
     */
    Logger logger = Logger.getLogger(IUserDao.class.getName());
    public Boolean find(String userName, String userPwd) {
        Connection connection = MysqlConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        String sql = "select * from registerUser where name=? and password=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, userPwd);
            result = preparedStatement.executeQuery();
            return result.next();
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            MysqlConnection.release(connection, preparedStatement, result);
        }
    }

    /**
     * JDBC往数据库中插入，注册成功后插入
     *
     * @author gacl
     */
    @SuppressWarnings("deprecation")
    public Boolean add(User user) {
        Connection connection = MysqlConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        String sql = "insert into registerUser(name,password,birthday,email) values(?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            //因为属性birthday是java.sql.Date类型,数据库字段birthday时date类型的，所以不需要转换
            preparedStatement.setDate(3, user.getBirthday());
            preparedStatement.setString(4, user.getEmail());
            int re = preparedStatement.executeUpdate();
            if (re == 0) {
                return false;
            }
            return true;
        } catch (SQLException se) {
           /* if(logger.isLoggable(Level.SEVERE)){
                logger.severe("用户信息已存在,"+"入参:{"+user+"},e:{"+se+"}");
            }*/
            throw new UserExistException("用户信息已经存在");
        } finally {
            MysqlConnection.release(connection, preparedStatement, result);
        }
    }

    /**
     * JDBC通过用户名进行查询，注册时判断
     *
     * @author gacl
     */
    public Boolean find(String userName) {
        Connection connection = MysqlConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        String sql = "select * from registerUser where name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            result = preparedStatement.executeQuery();
            return result.next();
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            MysqlConnection.release(connection, preparedStatement, result);
        }
    }
}