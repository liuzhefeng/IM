package com.im.ui.login.view;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author zfliu
 * @date 2022/8/12
 * @desc:
 */
public abstract class UIObject extends Stage {

    protected Parent root;
    private double xOffset;
    private double yOffset;

    //获取元素位置
    public <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    public void clearViewListSelectedAll(ListView<Pane>... listViews) {
        for (ListView<Pane> listView : listViews) {
            listView.getSelectionModel().clearSelection();
        }
    }


    // 移动窗体
    public void move() {
        root.setOnMousePressed(event -> {
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
            root.setCursor(Cursor.CLOSED_HAND);
            //System.out.println("xOffset: "+xOffset+",yOffset: "+yOffset);
        });
        root.setOnMouseDragged(event -> {
            setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);
        });
        root.setOnMouseReleased(event -> {
            root.setCursor(Cursor.DEFAULT);
        });
    }

    // 初始化页面
    public abstract void initView();

    // 初始化事件定义
    public abstract void initEventDefine();

}
