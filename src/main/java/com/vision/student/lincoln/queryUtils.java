package com.lincoln;

import java.sql.ResultSet;
import java.sql.SQLException;

public class queryUtils {

    static String sql = null;
    static String sql2 = null;
    static utilsDome db1 = null;
    static ResultSet ret = null;
    static ResultSet ret2 = null;

    public static String getCode() {
        sql = "select * from code";//SQL语句
        db1 = new utilsDome(sql);//创建DBHelper对象
        String uid="";
        try {
            ret = db1.pst.executeQuery();//执行语句，得到结果集
            while (ret.next()) {
                uid = ret.getString(1);

            }//显示数据
            ret.close();
            db1.close();//关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
      return uid;
    }

    public static String getName() {
        sql2 = "select * from name";//SQL语句
        db1 = new utilsDome(sql2);//创建DBHelper对象
        String uid="";
        try {
            ret2 = db1.pst.executeQuery();//执行语句，得到结果集
            while (ret2.next()) {
                uid = ret2.getString(1);
            }//显示数据
            ret2.close();
            db1.close();//关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return uid;
    }



}
