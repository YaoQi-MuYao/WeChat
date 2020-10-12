package com.wechat.wechat.utils;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: WxPush
 * @author: muyao
 * @description: 公众号推送消息
 * @date: 2020/10/10 4:42 下午
 * @version: 1.0
 */
@Slf4j
@Component
public class WxPush {

    private final WxMpService wxMpService;

    public WxPush(WxMpService wxMpService) {
        this.wxMpService = wxMpService;
    }

    /**
     * 发送微信模板信息
     *
     * @param openId 接受者openId
     * @return 是否推送成功
     */
    public Boolean SendWxMsg(String openId) {
        // 发送模板消息接口
        WxMpTemplateMessage.MiniProgram miniProgram = new WxMpTemplateMessage.MiniProgram();
        miniProgram.setAppid("wx409c30bcf3c0c069");
        miniProgram.setPagePath("/pages/index/index");
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
                // 接收者openid
                .toUser(openId)
                // 模板id
                .templateId("kNWNAB_Ab3rGc-4qeF1-Oavjt5jinOMm1jY_mVXG4pY")
                // 模板跳转链接
                .url("http://www.baidu.com")
                /* 小程序 */
//                .miniProgram(miniProgram)
                .build();
        // 添加模板数据
        templateMessage.addData(new WxMpTemplateData("first", "您好", "#FF00FF"))
                .addData(new WxMpTemplateData("keyword1", "这是个测试", "#A9A9A9"))
                .addData(new WxMpTemplateData("keyword2", "这又是个测试", "#FF00FF"))
                .addData(new WxMpTemplateData("remark", "这还是个测试", "#000000"));
        String msgId = null;
        try {
            // 发送模板消息
            msgId = wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        log.warn("·==++--·推送微信模板信息：{}·--++==·", msgId != null ? "成功" : "失败");
        return msgId != null;
    }
}
