package com.zmj.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.zmj.mall.dao.PmsBrandDao;
import com.zmj.mall.dto.PmsBrand;
import com.zmj.mall.service.PmsBrandrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PmsBrandService实现类
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandrService {
    @Resource
    private PmsBrandDao pmsBrandDao;

    @Override
    public List<PmsBrand> listAllBrand() {
//        return pmsBrandDao.selectByExample(new PmsBrandExample());
        return null;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandDao.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandDao.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
//        return pmsBrandDao.selectByExample(new PmsBrandExample());
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandDao.selectByPrimaryKey(id);
    }
}
