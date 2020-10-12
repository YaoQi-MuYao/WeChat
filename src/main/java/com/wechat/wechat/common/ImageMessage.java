package com.wechat.wechat.common;

import com.wechat.wechat.bean.Image;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.common
 * @className: ImageMessage
 * @author: muyao
 * @description: 图片消息
 * @date: 2020/10/10 10:44 上午
 * @version: 1.0
 */
public class ImageMessage extends BaseMessage {

    private com.wechat.wechat.bean.Image Image;//Image节点

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }

}
