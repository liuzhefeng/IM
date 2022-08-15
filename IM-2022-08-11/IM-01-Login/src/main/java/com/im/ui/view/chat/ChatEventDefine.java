package com.im.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @author zfliu
 * @date 2022/8/15
 * @desc:
 */
public class ChatEventDefine {

    private ChatInit chatInit;

    public ChatEventDefine(ChatInit chatInit) {
        this.chatInit = chatInit;

        chatInit.move();
        this.barChat();
        this.barFriend();
    }

    // 聊天
    private void barChat() {
        Button bar_chat = chatInit.$("bar_chat", Button.class);
        Pane group_bar_chat = chatInit.$("group_bar_chat", Pane.class);
        bar_chat.setOnAction(event -> {
            switchBarChat(bar_chat, group_bar_chat, true);
            switchBarFriend(chatInit.$("bar_friend", Button.class), chatInit.$("group_bar_friend", Pane.class), false);
        });
        bar_chat.setOnMouseEntered(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            bar_chat.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/chat_1.png')");
        });
        bar_chat.setOnMouseExited(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            bar_chat.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/chat_0.png')");
        });
    }

    // 好友
    private void barFriend() {
        Button bar_friend = chatInit.$("bar_friend", Button.class);
        Pane group_bar_friend = chatInit.$("group_bar_friend", Pane.class);
        bar_friend.setOnAction(event -> {
            switchBarFriend(bar_friend, group_bar_friend, true);
            switchBarChat(chatInit.$("bar_chat", Button.class), chatInit.$("group_bar_chat", Pane.class), false);
        });
        bar_friend.setOnMouseEntered(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
            bar_friend.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/friend_1.png')");
        });
        bar_friend.setOnMouseExited(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
            bar_friend.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/friend_0.png')");
        });
    }

    // 切换：bar_chat
    private void switchBarChat(Button bar_chat, Pane group_bar_chat, boolean toggle) {
        if (toggle) {
            bar_chat.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/chat_2.png')");
            group_bar_chat.setVisible(true);
        } else {
            bar_chat.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/chat_0.png')");
            group_bar_chat.setVisible(false);
        }
    }

    // 切换：bar_friend
    private void switchBarFriend(Button bar_friend, Pane group_bar_friend, boolean toggle) {
        if (toggle) {
            bar_friend.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/friend_2.png')");
            group_bar_friend.setVisible(true);
        } else {
            bar_friend.setStyle("-fx-background-image: url('/com/im/ui/chat/img/system/friend_0.png')");
            group_bar_friend.setVisible(false);
        }
    }

}
