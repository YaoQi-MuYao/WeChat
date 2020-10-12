package com.wechat.wechat.utils;

import com.wechat.wechat.bean.AccessToken;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: WxUserUtil
 * @author: muyao
 * @description: 获取微信公众号用户的OpenId
 * @date: 2020/10/10 6:22 下午
 * @version: 1.0
 */
public class WxUserUtil {

    /* 获取10000个用户的openId */
    private static final String ALL_USER_URL = "https://api.weixin.qq.com/cgi-bin/user/get?" +
            "access_token=ACCESS_TOKEN";

    /* 从指定的用户openId开始查询用户OpenId */
    private static final String USER_URL = "https://api.weixin.qq.com/cgi-bin/user/get?" +
            "access_token=ACCESS_TOKEN&next_openid=NEXT_OPENID";

    public static List<String> userOpenId(String openId,String accessToken) {
        /* 从起始位置查询openId */
        if (openId == null){
            String url = ALL_USER_URL.replace("ACCESS_TOKEN", accessToken);
            JSONObject jsonObject = WeiXinUtil.doGetstr(url);
            JSONObject data = (JSONObject) jsonObject.get("data");
            JSONArray openids = (JSONArray) data.get("openid");
            return openids;
        } else {
            /* 从指定openId查询 openId */
            String url = USER_URL.replace("NEXT_OPENID", openId).replace("ACCESS_TOKEN", accessToken);
            JSONObject jsonObject = WeiXinUtil.doGetstr(url);
            JSONObject data = (JSONObject) jsonObject.get("data");
            JSONArray openids = (JSONArray) data.get("openid");
            return openids;
        }
    }
}
