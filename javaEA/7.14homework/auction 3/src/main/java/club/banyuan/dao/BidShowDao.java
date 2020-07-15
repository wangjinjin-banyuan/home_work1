package club.banyuan.dao;

import club.banyuan.entity.Bid;
import java.util.List;

public interface BidShowDao extends IBaseDao {
    public List<Bid> bidShow();
}
