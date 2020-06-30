package banyuan.club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegister {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String name = sc.nextLine();
    System.out.println("请输入密码：");
    String password = sc.nextLine();

    try {
      register(name,password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public  static  void register(String name ,String password) throws SQLException {
    Connection con = JdbcUtils.getConnection("shoppingstreet");
    String sql ="insert into user (loginName,userName,password) values ('123',?,?)";
    PreparedStatement pst=con.prepareStatement(sql);
    pst.setString(1,name);
    pst.setString(2,password);
    int count=0;
     count+=pst.executeUpdate();
    if(count>0){
      System.out.println("注册成功！");
    }else{
      System.out.println("注册失败，请重新注册！");
    }
    JdbcUtils.close(con,pst);
  }
}
