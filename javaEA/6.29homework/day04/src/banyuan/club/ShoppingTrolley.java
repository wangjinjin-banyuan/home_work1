package banyuan.club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingTrolley {

  public static void main(String[] args) {
    Map<String,Integer> productMap= new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入查询关键字：");
    String key = sc.nextLine();
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    try {
      con= JdbcUtils.getConnection("shoppingstreet");
      pst = con.prepareStatement("select p.name,od.quantity from product p \n"
          + "inner join order_detail od on p.id=od.productId\n"
          + "where p.name like ? or od.description like ? group by p.name; ");
      pst.setString(1,"%"+key+"%");
      pst.setString(2,"%"+key+"%");
      rs = pst.executeQuery();

      while(rs.next()){
       productMap.put(rs.getString(1),rs.getInt(2));

      }

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }finally {
      try {
        JdbcUtils.close(con,pst,rs);
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }



  }
}
