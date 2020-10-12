package com.wechat.wechat.common;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: ViewButton
 * @author: muyao
 * @description: 链接
 * @date: 2020/10/10 12:06 下午
 * @version: 1.0
 */
public class ViewButton extends Button {
    private String url;//网页链接

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
