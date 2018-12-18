package com.arch.common.service;


import com.arch.common.pojo.TlCostTravel;
import com.arch.common.utils.PageBean;

/**
 * @author ShiYulong
 * @Title: TravelService
 * @ProjectName admin2
 * @Description: TODO
 * @date 2018/12/3 14:12
 */
public interface TravelService {
    TlCostTravel getById(Integer id);

    PageBean getTravelList(PageBean pageBean, TlCostTravel travel);
}
