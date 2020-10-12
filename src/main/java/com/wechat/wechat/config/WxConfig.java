package com.wechat.wechat.config;

import com.wechat.wechat.common.WxMpProperties;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.config
 * @className: WxConfig
 * @author: muyao
 * @description: 微信公众号配置类
 * @date: 2020/10/10 5:05 下午
 * @version: 1.0
 */
@Configuration
public class WxConfig {

    private final WxMpProperties wxMpProperties;

    /**
     *  声明实例
     *  @author muyao
     *  @date 2020/10/10 5:07 下午
     */
    @Bean
    public WxMpService wxMpService() {
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }

    /**
     *  微信客户端配置存储
     *  @author muyao
     *  @date 2020/10/10 5:32 下午
     */
    @Bean
    public WxMpConfigStorage wxMpConfigStorage() {
        WxMpDefaultConfigImpl wxMpDefaultConfig = new WxMpDefaultConfigImpl();
        wxMpDefaultConfig.setAppId(wxMpProperties.getAppId());
        wxMpDefaultConfig.setSecret(wxMpProperties.getAppsecret());
        wxMpDefaultConfig.setAesKey(wxMpProperties.getAesKey());
        wxMpDefaultConfig.setToken(wxMpProperties.getToken());
        return wxMpDefaultConfig;
    }

    /**
     *  构造注入配置信息
     *  @author muyao
     *  @date 2020/10/10 5:32 下午
     *  @param wxMpProperties 配置信息
     */ 
    WxConfig(WxMpProperties wxMpProperties) {
        this.wxMpProperties = wxMpProperties;
    }
}
