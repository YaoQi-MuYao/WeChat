package com.wechat.wechat.bean;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.bean
 * @className: AccessToken
 * @author: muyao
 * @description: 公众号token
 * @date: 2020/10/9 6:01 下午
 * @version: 1.0
 */
public class AccessToken {

    /* 获取到的凭证 */
    private String access_token;

    /* 凭证有效时间 */
    private int expires_in;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

}
