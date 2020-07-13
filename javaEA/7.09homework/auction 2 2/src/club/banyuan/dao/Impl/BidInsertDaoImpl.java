package club.banyuan.dao.Impl;

import club.banyuan.dao.BidInsertDao;
import club.banyuan.entity.Bid;

import java.sql.Connection;
import java.sql.ResultSet;

public class BidInsertDaoImpl extends BaseDaoImpl implements BidInsertDao {
    public BidInsertDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public int InsertBid(Bid bid) {
        String sql ="insert into bid (b_id,b_time,b_price,auctionPersonName) values (null,?,?,?)";
        Object[] params =new Object[]{bid.getDatetime(),bid.getB_price(),bid.getAuctionPersonName()};
        int i = executeInsert(sql,params);
        return i;
    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {

        return null;
    }
}
