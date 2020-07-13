package club.banyuan.service.Impl;

import club.banyuan.dao.BidInsertDao;
import club.banyuan.dao.Impl.BidInsertDaoImpl;
import club.banyuan.entity.Bid;
import club.banyuan.service.BidInsertService;
import club.banyuan.util.JdbcUtils;

public class BidInsertServiceImpl implements BidInsertService {
    @Override
    public int InsertBid(Bid bid) throws Exception {
        BidInsertDao bidInsertDao = new BidInsertDaoImpl(JdbcUtils.getConnection());
        return bidInsertDao.InsertBid(bid);
    }
}
