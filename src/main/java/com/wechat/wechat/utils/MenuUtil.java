package com.wechat.wechat.utils;

import com.wechat.wechat.common.*;
import net.sf.json.JSONObject;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.utils
 * @className: MenuUtil
 * @author: muyao
 * @description: 菜单工具
 * @date: 2020/10/10 12:07 下午
 * @version: 1.0
 */
public class MenuUtil {

    private static final String CTRATE_MENU_URL  = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    /**
     * 创建菜单
     * @param accessToken
     * @param Menu 菜单json格式字符串
     * @return
     */
    public static int createMenu(String accessToken,String Menu){
        int result = Integer.MIN_VALUE;
        String url = CTRATE_MENU_URL.replaceAll("ACCESS_TOKEN", accessToken);
        JSONObject json = WeiXinUtil.doPoststr(url, Menu);
        if(json!=null){
            //从返回的数据包中取数据{"errcode":0,"errmsg":"ok"}
            result = json.getInt("errcode");
        }
        return result;
    }

    public static String initMenu(){
        String result = "";
        //创建点击一级菜单
        ClickButton button11 = new ClickButton();
        button11.setName("往期活动");
        button11.setKey("11");
        button11.setType("click");

        /* 小程序跳转按钮 需要公众号关联小程序才可以使用 */
//        MiniProgramButton miniProgramButton = new MiniProgramButton();
//        miniProgramButton.setName("猩机械");
//        miniProgramButton.setType("miniprogram");
//        miniProgramButton.setAppid("wx409c30bcf3c0c069");
//        miniProgramButton.setPagepath("/pages/index/index");
//        miniProgramButton.setUrl("www.baidu.com");

        //创建跳转型一级菜单
        ViewButton button21 = new ViewButton();
        button21.setName("百度一下");
        button21.setType("view");
        button21.setUrl("https://www.baidu.com");

        //创建其他类型的菜单与click型用法一致
        ClickButton button31 = new ClickButton();
        button31.setName("拍照发图");
        button31.setType("pic_photo_or_album");
        button31.setKey("31");

        ClickButton button32 = new ClickButton();
        button32.setName("发送位置");
        button32.setKey("32");
        button32.setType("location_select");

        //封装到一级菜单
        Button button = new Button();
        button.setName("菜单");
        button.setType("click");
        button.setSub_button(new Button[]{button31,button32});

        //封装菜单
        Menu menu = new Menu();
        menu.setButton(new Button[]{button11,button21,button});
        return JSONObject.fromObject(menu).toString();
    }

}
