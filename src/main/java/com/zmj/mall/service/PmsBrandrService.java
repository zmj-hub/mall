package com.zmj.mall.service;

import com.zmj.mall.dto.PmsBrand;

import java.util.List;

public interface PmsBrandrService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
