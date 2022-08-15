package com.im.ui.login.view.chat;

import com.im.ui.login.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public abstract class ChatInit extends UIObject {

    private static final String RESOURCE_NAME = "/com/im/ui/chat/chat.fxml";

    ChatInit() {
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
        this.getIcons().add(new Image("/com/im/ui/chat/img/head/logo.png"));
        initView();
        initEventDefine();
    }

}
