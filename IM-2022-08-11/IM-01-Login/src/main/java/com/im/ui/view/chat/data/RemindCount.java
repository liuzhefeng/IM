package com.im.ui.view.chat.data;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public class RemindCount {

    private int count = 0;  // 消息提醒条数

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
