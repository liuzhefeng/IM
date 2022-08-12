package com.im.ui.login.view.login;

/**
 * @author zfliu
 * @date 2022/8/12
 * @desc: 页面展示元素和事件定义
 */
public class LoginView {

    private LoginInit loginInit;
    private ILoginEvent loginEvent;

    public LoginView(LoginInit loginInit, ILoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }

}
