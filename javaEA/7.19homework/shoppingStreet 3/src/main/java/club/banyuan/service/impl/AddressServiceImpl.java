package club.banyuan.service.impl;

import club.banyuan.dao.AddressDao;
import club.banyuan.entity.Address;
import club.banyuan.service.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

  @Autowired
  private AddressDao addressDao;
  @Override
  public List<Address> getAddressbyUserId(int userId) {
    return addressDao.getAddressbyUserId(userId);
  }
}
