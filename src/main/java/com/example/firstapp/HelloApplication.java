package com.example.firstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
      //  Scene scene = new Scene(fxmlLoader.load(), 320, 240);VBox layout = new VBox()Label mess = new label("Hello woord")layout.getChildren().add(mess)Scene scene = new Scene(layout);

        VBox layout = new VBox();
        Label mess = new Label("Hello World!!");

        layout.getChildren().add(mess);
        layout.getChildren().add(new Button("click me !!"));

        Scene scene = new Scene(layout);
        stage.setTitle("Hello!");

        stage.setScene(scene);

        stage.setHeight(450);
        stage.setWidth(450);
        stage.show();
    }
}
