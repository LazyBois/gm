package com.pwrd.gm.gmm.type;

/**
 * 功能类型
 * @author wangtong
 */
public enum EFunc {
    // 通用
    USUAL(0),
    // 管理员
    SYSTEM(1),
    // 开发者自定义
    DIY(2),
    ;

    private int type;

    EFunc(int type) {
        this.type = type;
    }
}
