package club.banyuan.dao.Impl;

import club.banyuan.dao.AdminDao;
import club.banyuan.entity.Administrator;
import club.banyuan.entity.User;
import java.sql.Connection;
import java.sql.ResultSet;

public class AdminDaoImpl extends BaseDaoImpl implements AdminDao {

  public AdminDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Administrator getLoginAdmin(String adminName, String pwd) {
    String sql = "select * from Administrator where adminName=? and a_password=?";
    ResultSet rs = executeQuery(sql,new Object[]{adminName,pwd});
    Administrator admin = null;
    try {
      if(rs.next()){
        admin = tableToClass(rs);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return admin;

  }

  @Override
  public Administrator tableToClass(ResultSet rs) throws Exception {
    Administrator admin = new Administrator(rs.getInt(1),
        rs.getString(2),
        rs.getString(3));

    return admin;
  }
}
