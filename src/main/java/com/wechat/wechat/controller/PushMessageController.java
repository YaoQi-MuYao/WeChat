package com.wechat.wechat.controller;

import com.wechat.wechat.utils.WxPush;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.controller
 * @className: PushMessage
 * @author: muyao
 * @description: 公众号推送模版信息
 * @date: 2020/10/10 5:38 下午
 * @version: 1.0
 */
@Slf4j
@RestController
public class PushMessageController {
    private final WxPush wxPush;

    protected PushMessageController(WxPush wxPush) {
        this.wxPush = wxPush;
    }
    

    /**
     *  发送微信模板消息
     *  @author muyao
     *  @date 2020/10/10 5:41 下午
     *  @param openId 推送的用户openId
     */
    @PostMapping("/sendWxInfo")
    public void sendWxInfo(@RequestParam String openId) {
        // 执行发送
        Boolean aBoolean = wxPush.SendWxMsg(openId);
        System.out.println(aBoolean);
    }
}
