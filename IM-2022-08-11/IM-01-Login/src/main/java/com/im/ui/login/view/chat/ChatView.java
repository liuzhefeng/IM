package com.im.ui.login.view.chat;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public class ChatView {

    private ChatInit chatInit;

    private IChatEvent chatEvent;

    public ChatView(ChatInit chatInit, IChatEvent chatEvent) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
    }

}
