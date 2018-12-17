package com.test.admin.admin.dao;


import com.test.admin.admin.pojo.PbMenu;

import java.util.List;

public interface PbMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(PbMenu record);

    int insertSelective(PbMenu record);

    PbMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(PbMenu record);

    int updateByPrimaryKey(PbMenu record);
    List<PbMenu> selectAllMenu();
}