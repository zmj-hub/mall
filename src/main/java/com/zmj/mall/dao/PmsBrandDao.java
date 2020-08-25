package com.zmj.mall.dao;

import com.zmj.mall.dto.PmsBrand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zmj
 */
@Mapper
public interface PmsBrandDao {

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);
}