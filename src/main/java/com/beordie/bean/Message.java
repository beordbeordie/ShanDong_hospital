package com.beordie.bean;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class Message<T> {
    //返回分页对象
    private PageInfo<T> pageInfo;
    //返回集合
    private List<T> list;
    //返回对象
    private T obj;
    //状态码
    private Integer code = 200;
    //信息
    private String msg = "ok";

    public Message() {
    }

    /**
     * @return
     * @description 只返回一个列表
     * @author 30500
     * @date 2021/7/23 17:51
     * @type [java.util.List<T>]
     */
    public Message(List<T> list) {
        this.list = list;
    }

    /**
     * @return
     * @description 只返回一个对象
     * @author 30500
     * @date 2021/7/23 17:52
     * @type [T]
     */
    public Message(T obj) {
        this.obj = obj;
    }

    /**
     * @return
     * @description 返回分页信息
     * @author 30500
     * @date 2021/7/23 17:52
     * @type [com.github.pagehelper.PageInfo<T>]
     */
    public Message(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * @return
     * @description 只有消息通知
     * @author 30500
     * @date 2021/7/24 7:16
     * @type [java.lang.String]
     */
    public Message(String msg) {
        this.msg = msg;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
