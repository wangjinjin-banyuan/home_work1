package club.banyuan.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
     private static String url;
     private static String userName;
     private static String password;

     static{
       Properties pro = new Properties();
       InputStream is = JdbcUtils.class.getClassLoader()
           .getResourceAsStream("db.properties");
       try {
         pro.load(is);
       } catch (IOException e) {
         e.printStackTrace();
       }
       url = pro.getProperty("URL");
       userName = pro.getProperty("USERNAME");
       password = pro.getProperty("PASSWORD");
     }

     public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url,userName,password);
        return con;
     }

     public static void close(Connection con, Statement st) throws SQLException {
          if(st!=null){
            st.close();
          }
          if(con!=null){
            con.close();
          }
     }

     public static void close(Connection con,Statement st, ResultSet rs) throws SQLException {
       if(rs!=null){
         rs.close();
       }
       if(st!=null){
         st.close();
       }
       if(con!=null){
         con.close();
       }
     }


}
