package com.test.admin.admin.service.impl;

import com.test.admin.admin.dao.TlCostTravelMapper;
import com.test.admin.admin.pojo.TlCostTravel;
import com.test.admin.admin.service.TravelService;
import com.test.admin.admin.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShiYulong
 * @Title: TravelServiceImpl
 * @ProjectName admin2
 * @Description: TODO
 * @date 2018/12/3 14:14
 */
@Service(value = "travelService")
public class TravelServiceImpl implements TravelService {
    @Autowired
    private TlCostTravelMapper travelMapper;
    @Override
    public TlCostTravel getById(Integer id) {
        return travelMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean getTravelList(PageBean pageBean, TlCostTravel travel) {
        Map<String,Object> paraMap = new HashMap<>();
        paraMap.put("travelSite",travel.getTravelSite());
        pageBean.setRows(travelMapper.selectRowForPageBean(paraMap));
        // 分页
        paraMap.put("startRowNum", pageBean.getStartRowNum());
        paraMap.put("endRowNum", pageBean.getEndRowNum());
        List<TlCostTravel> travelList = travelMapper.selectByPageBean(paraMap);
        pageBean.setList(travelList);
        return pageBean;
    }
}
