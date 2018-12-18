package com.arch.common.service;

import com.arch.common.pojo.TlTelegram;

/**
 * @author ShiYulong
 * @Title: TelegramService
 * @ProjectName architecture
 * @Description: TODO
 * @date 2018/12/18 14:02
 */
public interface TelegramService {
    TlTelegram selectById(Integer id);
}
