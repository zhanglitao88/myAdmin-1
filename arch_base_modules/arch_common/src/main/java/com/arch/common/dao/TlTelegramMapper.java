package com.arch.common.dao;

import com.arch.common.pojo.TlTelegram;

public interface TlTelegramMapper {
    int deleteByPrimaryKey(Integer teleId);

    int insert(TlTelegram record);

    int insertSelective(TlTelegram record);

    TlTelegram selectByPrimaryKey(Integer teleId);

    int updateByPrimaryKeySelective(TlTelegram record);

    int updateByPrimaryKeyWithBLOBs(TlTelegram record);

    int updateByPrimaryKey(TlTelegram record);
}