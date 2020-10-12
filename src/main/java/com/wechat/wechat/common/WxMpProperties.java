package com.wechat.wechat.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: WxMpProperties
 * @author: muyao
 * @description: 微信公众号配置信息
 * @date: 2020/10/10 5:25 下午
 * @version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx")
public class WxMpProperties {

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号appSecret
     */
    private String appsecret;

    /**
     * 公众号token
     */
    private String token;

    /**
     * 公众号aesKey
     */
    private String aesKey;
}
