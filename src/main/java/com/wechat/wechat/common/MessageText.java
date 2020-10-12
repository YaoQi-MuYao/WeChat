package com.wechat.wechat.common;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: MessageText
 * @author: muyao
 * @description: 消息内容实体
 * @date: 2020/10/9 4:55 下午
 * @version: 1.0
 */
public class MessageText extends BaseMessage {

    private String Content;//文本消息内容

    private String MsgId;//消息id，64位整型

    public MessageText() {

    }


    public MessageText(String toUserName, String fromUserName,
                       long createTime, String msgType, String content, String msgId) {
        super();
        ToUserName = toUserName;
        FromUserName = fromUserName;
        CreateTime = createTime;
        MsgType = msgType;
        Content = content;
        MsgId = msgId;
    }


    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }

}
