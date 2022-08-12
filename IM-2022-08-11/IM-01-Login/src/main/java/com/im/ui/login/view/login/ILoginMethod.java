package com.im.ui.login.view.login;

/**
 * @author zfliu
 * @date 2022/8/12
 * @desc: 窗口方法，给予外部调用
 */
public interface ILoginMethod {

    /**
     * 打开登陆窗口
     */
    void doShow();

    /**
     * 登陆失败
     */
    void doLoginError();

    /**
     * 登陆成功；跳转聊天窗口[关闭登陆窗口，打开新窗口]
     */
    void doLoginSuccess();

}
