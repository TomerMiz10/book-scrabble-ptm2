package com.example.demo;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Server server = new Server();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        Thread thread = new Thread(server);
        thread.start();
        stage.setScene(scene);
        Image anotherIcon = new Image("file:src files/bookScrabble.jpg");
        stage.getIcons().add(anotherIcon);
        stage.setTitle("BookScrabble Game");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}