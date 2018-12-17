package com.test.admin.admin.service;


import com.test.admin.admin.pojo.TlCostTravel;
import com.test.admin.admin.utils.PageBean;

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
