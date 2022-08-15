package com.im.ui.view.login;

/**
 * @author zfliu
 * @date 2022/8/12
 * @desc:
 */
public class LoginController extends LoginInit implements ILoginMethod {

    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }

    /**
     * 打开登陆窗口
     */
    @Override
    public void doShow() {
        super.show();
    }

    /**
     * 登陆失败
     */
    @Override
    public void doLoginError() {
        System.out.println("登陆失败，执行提示操作");
    }

    /**
     * 登陆成功；跳转聊天窗口[关闭登陆窗口，打开新窗口]
     */
    @Override
    public void doLoginSuccess() {
        System.out.println("登陆成功，执行跳转操作");
        // 关闭原窗口
        close();
    }
}
