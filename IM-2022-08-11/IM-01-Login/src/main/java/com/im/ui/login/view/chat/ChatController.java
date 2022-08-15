package com.im.ui.login.view.chat;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public class ChatController extends ChatInit implements IChatMethod {

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        this.chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        super.show();
    }
}
