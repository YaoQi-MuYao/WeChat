package com.wechat.wechat.common;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: MiniProgramButton
 * @author: muyao
 * @description: 小程序按钮
 * @date: 2020/10/10 2:34 下午
 * @version: 1.0
 */
public class MiniProgramButton extends Button {

    private String key;

    private String pagepath;

    private String appid;

    private String url;


    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppid() {
        return appid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
