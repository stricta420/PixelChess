package com.example.chess_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(File_names_menadger.FileNames.MAIN_MENU_FXML.getFullFileName()));
        Scene scene = new Scene(fxmlLoader.load(), 512, 512);
        stage.setTitle("Pixel Chess");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}