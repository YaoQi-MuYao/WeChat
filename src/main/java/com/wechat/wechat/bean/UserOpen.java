package com.wechat.wechat.bean;

/**
 * @projectName: wechat
 * @package: com.wechat.wechat.bean
 * @className: UserOpen
 * @author: muyao
 * @description: 关注公众号的用户OpenId
 * @date: 2020/10/10 6:12 下午
 * @version: 1.0
 */
public class UserOpen {

    private Integer total;

    private Integer count;

    private OpenIds data;

    private String next_openid;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OpenIds getData() {
        return data;
    }

    public void setData(OpenIds data) {
        this.data = data;
    }

    public String getNext_openid() {
        return next_openid;
    }

    public void setNext_openid(String next_openid) {
        this.next_openid = next_openid;
    }
}
