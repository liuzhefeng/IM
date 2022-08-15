package com.im.ui.login;

import com.im.ui.login.view.chat.ChatController;
import com.im.ui.login.view.login.ILoginMethod;
import com.im.ui.login.view.login.LoginController;
import javafx.stage.Stage;

/**
 * @author zfliu
 * @date 2022/8/11
 * @desc:
 */
public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) throws Exception {
        //ILoginMethod login = new LoginController(
        //        (userId, userPassword) ->
        //                System.out.println("登陆 userId：" + userId + " userPassword：" + userPassword));
        //
        //login.doShow();

        ChatController chat = new ChatController();
        chat.doShow();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
