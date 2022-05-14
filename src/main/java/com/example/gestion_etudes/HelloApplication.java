package com.example.gestion_etudes;

import Database.CreateTables;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        CreateTables.createTableSubject();
        CreateTables.createTableGroup();
        CreateTables.createTableTeacher();
        CreateTables.createTableTeaching();
        CreateTables.createTableStudent();
        CreateTables.createTableSession();
        CreateTables.createTableFollow();
        CreateTables.createTableAbsence();
        CreateTables.createTableHomework();
        CreateTables.createTableEvaluation();
        CreateTables.createTableRecording();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}