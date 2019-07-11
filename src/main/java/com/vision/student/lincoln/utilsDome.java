package com.lincoln;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class utilsDome {
    public static final String url = "jdbc:mysql://101.132.103.2/spider";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "asdf@123456";

    public static Connection conn = null;
    public static PreparedStatement pst = null;

    public utilsDome(String sql) {
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url,user,password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
            System.out.print(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
