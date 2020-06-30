package club.banyuan.dao.impl;

import club.banyuan.dao.IBaseDao;
import club.banyuan.util.JdbcUtils;
import java.lang.ref.PhantomReference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDaoImpl implements IBaseDao {
    protected Connection con;
    protected PreparedStatement pst;
    public BaseDaoImpl(){

    }
    public BaseDaoImpl(Connection con){
      this.con=con;
    }


  @Override
  public ResultSet executeQuery(String sql, Object[] params)  {
    ResultSet rs =null;
    try {

      pst=con.prepareStatement(sql);
      for(int i=0;i<params.length;i++){
        pst.setObject(i+1,params[i]);
      }
      rs =pst.executeQuery();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return rs;
  }

  @Override
  public int executeUpdate(String sql, Object[] params) {
      int rows=0;
    try {
      pst=con.prepareStatement(sql);
      for(int i=0;i<params.length;i++){
        pst.setObject(i+1,params[i]);
      }
      rows=pst.executeUpdate();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      rows=-1;
    }
    return rows;
  }

  @Override
  public int executeInsert(String sql, Object[] params) {
      Long id = 0L;
    try {
      pst=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      for(int i=0;i<params.length;i++){
        pst.setObject(i+1,params[i]);
      }
      pst.executeUpdate();
      ResultSet rs =pst.getGeneratedKeys();
      if (rs.next()){
        id=rs.getLong(1);
        System.out.println("数据主键：" + id);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      id=null;
    }

    return id.intValue();
  }

  @Override
  public boolean closeResource() {
      if(pst!=null){
        try {
          pst.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
          return false;
        }
      }
    return true;
  }

  @Override
  public boolean closeResource(ResultSet reSet) {
      if(reSet!=null){
        try {
          reSet.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
          return false;
        }
      }
    return true;
  }

  public abstract Object tableToClass(ResultSet rs)throws Exception;
}
