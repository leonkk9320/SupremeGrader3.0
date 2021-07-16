package JDBC;

import java.sql.*;
public class JdbcConn {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hhh?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "hhh20001004hhh";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("连接数据库成功");

            // 执行查询
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select * from person";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()) {
                // 通过字段检索
                int personid = rs.getInt(1);
                String lastname = rs.getString(2);
                String firstname = rs.getString(3);
                String address = rs.getString(4);
                String city = rs.getString(5);

                // 输出数据
                System.out.print("PersonID: " + personid);
                System.out.print(", LastName: " + lastname);
                System.out.print(", FirstName: " + firstname);
                System.out.print(", Address: " + address);
                System.out.print(", City: " + city);
                System.out.println();
            }
            rs.close();

            int result;
            result = stmt.executeUpdate("delete from person where personid='1234'");
            System.out.println("有"+result+"行记录被删除");
            result = stmt.executeUpdate("insert into person (personid,lastname,firstname,address) values ('1234','Insert','by Java','Java')");
            System.out.println("有"+result+"行记录被添加");

            // 完成后关闭
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            if (conn!=null) {
                try {
                    conn.close();
                    System.out.println("关闭数据库");
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException se) {
                    // 什么都不做
                }
            }
        }
    }
}
