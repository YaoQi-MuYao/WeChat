package com.wechat.wechat.common;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: BaseMessage
 * @author: muyao
 * @description: 回复消息的基类
 * @date: 2020/10/9 4:54 下午
 * @version: 1.0
 */
public class BaseMessage {
    protected String ToUserName;
    protected String FromUserName;
    protected long CreateTime;
    protected String MsgType;

    public BaseMessage() {
        super();
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

}
