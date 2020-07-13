package club.banyuan.service.Impl;

import club.banyuan.dao.BidShowDao;
import club.banyuan.dao.Impl.BidShowDaoImpl;
import club.banyuan.entity.Bid;
import club.banyuan.service.BidShowService;
import club.banyuan.util.JdbcUtils;

import java.util.List;

public class BidShowServiceImpl implements BidShowService {
    @Override
    public List<Bid> bidShow() throws Exception {
        BidShowDao bidShowDao = new BidShowDaoImpl(JdbcUtils.getConnection());
        return bidShowDao.bidShow();
    }
}
