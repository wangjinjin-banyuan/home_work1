package banyuan.club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String name = sc.nextLine();
    System.out.println("请输入密码：");
    String password = sc.nextLine();
    try {
      validate(name,password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public  static  void validate(String name ,String password) throws SQLException {
    Connection con = JdbcUtils.getConnection(null);
    String sql ="select * from user where name=? and password=?";
    PreparedStatement pst=con.prepareStatement(sql);
    pst.setString(1,name);
    pst.setString(2,password);

    ResultSet rs=pst.executeQuery();
    if(rs.next()){
      System.out.println("成功");
    }else{
      System.out.println("失败");
    }
    JdbcUtils.close(con,pst,rs);
  }

}
