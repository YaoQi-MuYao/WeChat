package com.wechat.wechat.utils;

import com.wechat.wechat.common.ImageMessage;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: BaseMessageUtil
 * @author: muyao
 * @description: 消息封装工具类的基类, 这里采用泛型, 方便后期功能扩展
 * @date: 2020/10/9 5:02 下午
 * @version: 1.0
 */
public interface BaseMessageUtil<T> {

    /**
     * 将回复的信息对象转xml格式给微信
     * @param t message
     * @return 回复信息
     */
    public abstract String messageToxml(T t);

    /**
     * 回复的信息封装
     * @param FromUserName 发送消息的订阅者
     * @param ToUserName 要发送的人
     * @return json格式的返回数据
     */
    public abstract String initMessage(String FromUserName,String ToUserName);

}
