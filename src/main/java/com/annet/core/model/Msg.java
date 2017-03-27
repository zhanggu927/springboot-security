package com.annet.core.model;

/**
 * 创建人： Zhang
 * 修改时间：2017/3/24
 * 描述：不同角色用户的数据展示
 */
public class Msg {
    private String title;
    private String content;
    private String etraInfo;

    public Msg() {
    }

    public Msg(String title, String content, String etraInfo) {
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEtraInfo() {
        return etraInfo;
    }

    public void setEtraInfo(String etraInfo) {
        this.etraInfo = etraInfo;
    }
}
