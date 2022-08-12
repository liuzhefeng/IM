package com.im.ui.login;

import com.im.ui.login.view.Login;
import javafx.stage.Stage;

/**
 * @author zfliu
 * @date 2022/8/11
 * @desc:
 */
public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
