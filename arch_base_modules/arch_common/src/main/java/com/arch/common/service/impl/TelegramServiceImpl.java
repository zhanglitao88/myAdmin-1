package com.arch.common.service.impl;

import com.arch.common.dao.TlTelegramMapper;
import com.arch.common.pojo.TlTelegram;
import com.arch.common.service.TelegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ShiYulong
 * @Title: TelegramServiceImpl
 * @ProjectName architecture
 * @Description: TODO
 * @date 2018/12/18 14:03
 */
@Service("telegramService")
public class TelegramServiceImpl implements TelegramService {
    @Autowired
    private TlTelegramMapper tlTelegramMapper;
    @Override
    public TlTelegram selectById(Integer id) {
        return tlTelegramMapper.selectByPrimaryKey(id);
    }
}
