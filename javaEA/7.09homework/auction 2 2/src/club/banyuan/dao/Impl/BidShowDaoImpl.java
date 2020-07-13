package club.banyuan.dao.Impl;

import club.banyuan.dao.BidShowDao;
import club.banyuan.entity.Bid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BidShowDaoImpl extends BaseDaoImpl implements BidShowDao {
    public BidShowDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public List<Bid> bidShow(){
        List<Bid> bids = new ArrayList<>();
        String sql ="select * from bid";
        Bid bid  = null;
        try {
            ResultSet rs = executeQuery1(sql);
            while (rs.next()) {
                bid = tableToClass(rs);
                bids.add(bid);
            }
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return bids;
    }

    @Override
    public Bid tableToClass(ResultSet rs) throws Exception {
        Bid bid = new Bid(rs.getInt(1),rs.getTime(2),rs.getFloat(3),rs.getString(4));
        return bid;
    }
}
