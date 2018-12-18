package com.arch.admin.controller.config;

import com.arch.common.constant.SystemConst;
import com.arch.common.pojo.PbMenu;
import com.arch.common.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ShiYulong
 * @Title: MenuConfigController
 * @ProjectName admin2
 * @Description: 菜单配置控制器
 * @date 2018/12/4 17:23
 */
@Controller
public class MenuConfigController {
    @Autowired
    private MenuService menuService;
    /**
     * 跳转至菜单配置页面
     * @param model
     * @return
     */
    @RequestMapping("toMenuConfigPage")
    public String toMenuConfigPage(Model model){
        //获取所有可用菜单项
        List<PbMenu> menuList = menuService.getAllMenu();
        // 将所有菜单按菜单级别分类
        List<PbMenu> firstMenu = menuList.stream().filter(menu -> menu.getMenuLevel() == SystemConst.MENU_LEVEL_FIRST).collect(Collectors.toList());
        List<PbMenu> secondMenu = menuList.stream().filter(menu -> menu.getMenuLevel() == SystemConst.MENU_LEVEL_SECOND).collect(Collectors.toList());
        List<PbMenu> thirdMenu = menuList.stream().filter(menu -> menu.getMenuLevel() == SystemConst.MENU_LEVEL_THIRD).collect(Collectors.toList());
        model.addAttribute("firstMenu",firstMenu);
        model.addAttribute("secondMenu",secondMenu);
        model.addAttribute("thirdMenu",thirdMenu);
        return "config/menuConfig";
    }
}
