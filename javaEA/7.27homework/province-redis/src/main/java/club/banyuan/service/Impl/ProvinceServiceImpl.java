package club.banyuan.service.Impl;

import club.banyuan.entity.Province;
import club.banyuan.mapper.ProvinceMapper;
import club.banyuan.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;


    @Override
    public List<Province> getAll() throws SQLException {
        return provinceMapper.selectAll();
    }
}
