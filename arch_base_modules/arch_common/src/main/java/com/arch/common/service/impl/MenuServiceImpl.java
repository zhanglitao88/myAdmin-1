package com.arch.common.service.impl;


import com.arch.common.dao.PbMenuMapper;
import com.arch.common.pojo.PbMenu;
import com.arch.common.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShiYulong
 * @Title: MenuServiceImpl
 * @ProjectName admin2
 * @Description: 菜单接口实现类
 * @date 2018/12/4 17:25
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private PbMenuMapper menuMapper;
    @Override
    public List<PbMenu> getAllMenu() {
        return menuMapper.selectAllMenu();
    }
}
