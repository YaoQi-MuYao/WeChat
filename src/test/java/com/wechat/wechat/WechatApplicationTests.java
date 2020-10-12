package com.wechat.wechat;

import com.wechat.wechat.utils.MenuUtil;
import com.wechat.wechat.utils.UploadUtil;
import com.wechat.wechat.utils.WeiXinUtil;
import com.wechat.wechat.utils.WxUserUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

@SpringBootTest
class WechatApplicationTests {

    @Test
    void contextLoads() {
        String access_token = WeiXinUtil.getAccess_Token();
        System.out.println("调用成功access_token:"+access_token);
    }

    @Test
    void imgTest() {
        String accesss_token = WeiXinUtil.getAccess_Token();
        String path = "/Users/muyao/Desktop/1.png";
        try {
            String mediaId = UploadUtil.upload(path, accesss_token, "image");
            System.out.println(mediaId);
        } catch (KeyManagementException | NoSuchAlgorithmException | NoSuchProviderException | IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void menuTest() {
        String accessToken  = WeiXinUtil.getAccess_Token();
        String menu = MenuUtil.initMenu();
        System.out.println(menu);
        int result = MenuUtil.createMenu(accessToken,menu);
        if(result==0){
            System.out.println("菜单创建成功");
        }else{
            System.out.println("错误码"+result);
        }

    }

    @Test
    void getUserOpenId() {
        String accessToken = WeiXinUtil.getAccess_Token();
        List<String> userOpenId = WxUserUtil.userOpenId(null, accessToken);
        System.out.println(userOpenId);
    }

}
