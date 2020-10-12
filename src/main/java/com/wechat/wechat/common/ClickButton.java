package com.wechat.wechat.common;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: ClickButton
 * @author: muyao
 * @description: 点击按钮
 * @date: 2020/10/10 12:05 下午
 * @version: 1.0
 */
public class ClickButton extends Button {
    private String key;//菜单KEY值

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
