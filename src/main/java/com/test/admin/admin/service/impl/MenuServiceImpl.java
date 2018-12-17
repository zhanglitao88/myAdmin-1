package com.test.admin.admin.service.impl;

import com.test.admin.admin.dao.PbMenuMapper;
import com.test.admin.admin.pojo.PbMenu;
import com.test.admin.admin.service.MenuService;
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
