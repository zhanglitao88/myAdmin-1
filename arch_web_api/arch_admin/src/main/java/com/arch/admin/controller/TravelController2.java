package com.arch.admin.controller;

import com.arch.common.pojo.TlCostTravel;
import com.arch.common.service.TravelService;
import com.arch.common.utils.PageBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShiYulong
 * @Title: TravelController2
 * @ProjectName admin2
 * @Description: TODO
 * @date 2018/12/3 15:21
 */
@Controller
public class TravelController2 {
    private static final Logger logger = Logger.getLogger(TravelController2.class);
    @Autowired
    private TravelService travelService;

    @RequestMapping("toTravelListPage")
    public String toTravelListPage(Model model, PageBean pageBean){
        model.addAttribute("testValue","test2");

        TlCostTravel costTravel = new TlCostTravel();
        costTravel.setTravelSite("");
        travelService.getTravelList(pageBean,costTravel);
        model.addAttribute("pageBean",pageBean);
        return "test2";
    }
}
