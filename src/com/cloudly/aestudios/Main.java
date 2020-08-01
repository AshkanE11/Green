package com.cloudly.aestudios ;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage MainStage) throws Exception{



        Label factortxt1 = new Label("FACTOR SCENE") ;


        StackPane factorstackpane = new StackPane() ;
        factorstackpane.getChildren().addAll(factortxt1) ;

        factortxt1.getStyleClass().add("factortext1") ;



        Scene factorscene = new Scene(factorstackpane , 1200 ,700) ;
        factorscene.getStylesheets().add(getClass().getResource("MainApp.css").toExternalForm()) ;


        MainStage.setResizable(false);
        MainStage.initStyle(StageStyle.TRANSPARENT);
        MainStage.setTitle("Cloudly");
        MainStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
