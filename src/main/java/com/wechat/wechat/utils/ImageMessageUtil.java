package com.wechat.wechat.utils;

import com.thoughtworks.xstream.XStream;
import com.wechat.wechat.bean.Image;
import com.wechat.wechat.common.ImageMessage;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: ImageMessageUtil
 * @author: muyao
 * @description: 返回图片工具
 * @date: 2020/10/10 10:58 上午
 * @version: 1.0
 */
public class ImageMessageUtil implements BaseMessageUtil<ImageMessage>{

    /**
     *  将信息转为xml格式
     *  @author muyao
     *  @date 2020/10/10 11:01 上午
     *  @param  
     */ 
    @Override
    public String messageToxml(ImageMessage imageMessage) {
        XStream xtream = new XStream();
        xtream.alias("xml", imageMessage.getClass());
        xtream.alias("Image", new Image().getClass());
        return xtream.toXML(imageMessage);
    }


    /**
     * 	封装信息
     *  @author muyao
     *  @date 2020/10/10 11:01 上午
     *  @param  
     */ 
    @Override
    public String initMessage(String FromUserName, String ToUserName) {
        Image image = new Image();
        image.setMediaId(getmediaId());
        ImageMessage message = new ImageMessage();
        message.setFromUserName(ToUserName);
        message.setToUserName(FromUserName);
        message.setCreateTime(System.currentTimeMillis());
        message.setMsgType("image");
        message.setImage(image);
        return messageToxml(message);
    }

    /**
     * 获取Media
     * @return
     */
    public String getmediaId(){
        String path = "/Users/muyao/Desktop/1.png";
        String accessToken = WeiXinUtil.getAccess_Token();
        String mediaId = null;
        try {
            mediaId = UploadUtil.upload(path, accessToken, "image");

        } catch (KeyManagementException | NoSuchAlgorithmException
                | NoSuchProviderException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mediaId;
    }

}
