package club.banyuan.dao;

import club.banyuan.entity.Address;
import java.util.List;

public interface AddressDao{
  List<Address> getAddressbyUserId(int userId) throws Exception;
}
