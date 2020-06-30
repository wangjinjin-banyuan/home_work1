package club.banyuan.dao.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.lang.model.element.ModuleElement.UsesDirective;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
  public UserDaoImpl(Connection con){
    super(con);
  }
  @Override
  public User register(User user) {
    int i=0;
     try{
    String sql = "insert into user(id,loginName,userName,password,sex,identityCode,email,mobile,type) values(null,?,?,?,?,?,?,?,?)";
    Object[] params = new Object[]{user.getLoginName()
        ,user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile(),user.getType()};
     i= executeInsert(sql,params);
     }catch(Exception e){
       e.printStackTrace();
     }finally{
       this.closeResource();
     }
    if(i>0){
      return user;
    }else{
      return null;
    }

  }

  @Override
  public User getLoginUser(String loginName, String pwd) {
    String sql = "select * from user where loginName=? and password=?";
    ResultSet resultSet = this.executeQuery(sql.toString(),new String[]{loginName,pwd});
    User user=null;
    try {

      if(resultSet.next()) {
        user = (User)this.tableToClass(resultSet);
      }
      }catch (SQLException e) {
        e.printStackTrace();
      } catch (Exception e) {
        e.printStackTrace();
      } finally{
        this.closeResource();
        this.closeResource(resultSet);
      }
      return user;
  }

  @Override
  public Object tableToClass(ResultSet rs) throws Exception {
    User user = new User();
    user.setLoginName(rs.getString("loginName"));
    user.setUserName(rs.getString("userName"));
    user.setPassword(rs.getString("password"));
    user.setSex(rs.getInt("sex"));
    user.setEmail(rs.getString("email"));
    user.setMobile(rs.getString("mobile"));
    user.setId(rs.getInt("id"));
    user.setIdentityCode(rs.getString("identityCode"));
    user.setType(rs.getInt("type"));
    return user;

  }
}
