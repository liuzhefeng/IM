package com.im.ui.view.chat.data;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public class TalkData {

    private String talkName;
    private String talkHead;

    public TalkData() {
    }

    public TalkData(String talkName, String talkHead) {
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }

    public String getTalkHead() {
        return talkHead;
    }

    public void setTalkHead(String talkHead) {
        this.talkHead = talkHead;
    }

}
