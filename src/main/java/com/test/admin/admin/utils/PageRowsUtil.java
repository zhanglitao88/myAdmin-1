package com.test.admin.admin.utils;

/**
 * 分页行数工具类
 * 
 */
public final class PageRowsUtil {

    /**
     * 每页行数
     * */
    private static final int FIFTEEN = 15;
    /** 每页行数 */
    private static Integer pageRows = FIFTEEN;

    /**
     * 无参构造方法
     * */
    private PageRowsUtil() {
    }

    public static Integer getPageRows() {
        return pageRows;
    }

    /**
     * 设置分页行数
     * */
    public static void setPageRows(Integer pageRows) {
        PageRowsUtil.pageRows = pageRows;
    }

}
