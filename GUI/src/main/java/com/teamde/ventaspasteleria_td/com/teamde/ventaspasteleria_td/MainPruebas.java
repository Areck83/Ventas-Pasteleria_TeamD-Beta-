package com.teamde.ventaspasteleria_td;

import com.teamde.ventaspasteleria_td.Vista.Login;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPruebas extends Application {
    public MainPruebas() {
    }

    public void start(Stage stage) throws IOException {
        Pane menu = new Login(stage);
        Scene scene = new Scene(menu, 900.0, 500.0);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Login");
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}