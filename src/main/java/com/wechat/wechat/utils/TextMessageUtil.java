package com.wechat.wechat.utils;

import com.thoughtworks.xstream.XStream;
import com.wechat.wechat.common.MessageText;

import java.util.Date;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: TextMessageUtil
 * @author: muyao
 * @description: 将发送消息封装成对应的xml格式
 * @date: 2020/10/9 5:09 下午
 * @version: 1.0
 */
public class TextMessageUtil {

    /**
     *  将发送消息封装成对应的xml格式
     *  @author muyao
     *  @date 2020/10/9 5:12 下午
     *  @param message 需要发送的消息
     */ 
    public String messageToxml(MessageText message) {
        XStream xstream = new XStream();
        xstream.alias("xml", message.getClass());
        return xstream.toXML(message);
    }
    /**
     * 封装发送消息对象,封装时，需要将调换发送者和接收者的关系
     * @param FromUserName
     * @param ToUserName
     */
    public String initMessage(String FromUserName, String ToUserName, String content) {
        MessageText text = new MessageText();
        text.setToUserName(FromUserName);
        text.setFromUserName(ToUserName);
        text.setContent(content);
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgType("text");
        return messageToxml(text);
    }

}
