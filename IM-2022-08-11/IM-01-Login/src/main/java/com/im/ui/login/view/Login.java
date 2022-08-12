package com.im.ui.login.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author zfliu
 * @date 2022/8/11
 * @desc:
 */
public class Login extends Stage {

    private static final String RESOURCE_NAME = "/com/im/ui/login/login.fxml";

    private Parent root;

    public Login() {
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image("/com/im/ui/login/img/system/logo.png"));
    }

}
