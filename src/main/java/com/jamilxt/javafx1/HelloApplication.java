package com.jamilxt.javafx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image(HelloApplication.class.getResource("jamilxt-avatar.jpg").getPath());
        stage.getIcons().add(icon);

        stage.setTitle("Stage Demo Program w00t w00t");
        stage.setScene(scene);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.show();
    }
}