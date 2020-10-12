package com.wechat.wechat.bean;

import java.util.List;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.bean
 * @className: OpenIds
 * @author: muyao
 * @description: 用户openId
 * @date: 2020/10/10 6:17 下午
 * @version: 1.0
 */
public class OpenIds {

    private List<String> openid;

    public void setOpenid(List<String> openid) {
        this.openid = openid;
    }

    public List<String> getOpenid() {
        return openid;
    }
}
