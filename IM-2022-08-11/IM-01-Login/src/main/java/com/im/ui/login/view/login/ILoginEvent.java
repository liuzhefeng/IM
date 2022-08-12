package com.im.ui.login.view.login;

/**
 * @author zfliu
 * @date 2022/8/12
 * @desc: 登陆窗口实现，外部给予实现
 */


//事件接口类，具体实现交给调用方，
public interface ILoginEvent {

    /**
     * 登陆验证
     *
     * @param userId       用户ID
     * @param userPassword 用户密码
     */
    void doLoginCheck(String userId, String userPassword);

}
