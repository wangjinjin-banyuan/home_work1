package club.banyuan.dao;

import club.banyuan.entity.Bid;

public interface BidInsertDao extends IBaseDao {
    public int InsertBid(Bid bid);
}
