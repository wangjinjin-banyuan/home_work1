package banyuan.club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
      private  static String db = null;
      private  static String URL = "jdbc:mysql://localhost:3306/";
      private  static String USER = "root";
      private  static String PWD ="12345678";

      public static Connection getConnection(String dbName)throws SQLException {
        String url=URL+db;
        if(dbName!=null && dbName!=""){
          url=URL+dbName;
        }
        Connection con= DriverManager.getConnection(url,USER,PWD);
        return con;
      }

      public static void close(Connection con, Statement st)throws SQLException{
        if(st!=null){
          try{
            st.close();
          }catch(SQLException e){
            e.printStackTrace();
          }
        }
        if(con!=null){
          try{
            con.close();
          }catch(SQLException e){
            e.printStackTrace();
          }
        }
      }

  public static void close(Connection con, Statement st, ResultSet rs)throws SQLException{
    if(rs!=null){
      try{
        rs.close();
      }catch(SQLException e){
        e.printStackTrace();
      }
    }
    if(st!=null){
      try{
        st.close();
      }catch(SQLException e){
        e.printStackTrace();
      }
    }
    if(con!=null){
      try{
        con.close();
      }catch(SQLException e){
        e.printStackTrace();
      }
    }
  }
  }


