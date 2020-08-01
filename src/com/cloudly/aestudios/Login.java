package com.cloudly.aestudios ;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application {

    String username = "Boss" ;
    String password = "Boss" ;

    String usernamecheck , passwordcheck ;


    private static double xOffset = 0;
    private static double yOffset = 0;


    @Override
    public void start(Stage InfoStage) {

        Label text1 = new Label("Green") ;
        Label text2 = new Label("AE Studios Presents") ;
        Label text3 = new Label("LoginNow") ;
        Label text4 = new Label("@CopyRight2020") ;
        Label text5 = new Label("Cloudly V2.0") ;
        TextField usernametxtfield = new TextField() ;
        usernametxtfield.setPromptText("Username");
        PasswordField passwordtxtfield = new PasswordField() ;
        passwordtxtfield.setPromptText("Password");
        Button loginbutton = new Button("Login") ;
        Image mainloginimage = new Image ("com//cloudly//aestudios//Files//Background//59.jpg") ;
        ImageView imagedisplay = new ImageView(mainloginimage) ;
        imagedisplay.setFitWidth(800);
        imagedisplay.setFitHeight(800);








        StackPane loginstackpane = new StackPane() ;
        loginstackpane.getChildren().add(usernametxtfield) ;
        loginstackpane.getChildren().add(passwordtxtfield) ;
        loginstackpane.getChildren().add(loginbutton) ;
        loginstackpane.getChildren().add(imagedisplay) ;
        loginstackpane.getChildren().addAll(text1) ;
        loginstackpane.getChildren().add(text2) ;
        loginstackpane.getChildren().add(text3) ;
        loginstackpane.getChildren().add(text4) ;
        loginstackpane.getChildren().add(text5) ;




        text1.getStyleClass().add("text1") ;
        text2.getStyleClass().add("text2") ;
        text3.getStyleClass().add("text3") ;
        text4.getStyleClass().add("text4") ;
        text5.getStyleClass().add("text5") ;
        usernametxtfield.getStyleClass().add("usernametxtfield") ;
        passwordtxtfield.getStyleClass().add("passwordtxtfield") ;
        loginbutton.getStyleClass().add("loginbutton") ;
        imagedisplay.getStyleClass().add("imagedisplay") ;






        Scene loginscene = new Scene(loginstackpane , 1200 , 700) ;
        loginscene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm()) ;
        InfoStage.setScene(loginscene);







        // MAKES DRAGGING BRO !!!!!!!!!!!!!!!!!!




        loginstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        loginstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });








        // LOGIN STATS CHECKER &&& SCENE CHANGER




         loginbutton.setOnAction(e -> {




             usernamecheck = usernametxtfield.getText().toString() ;
             passwordcheck = passwordtxtfield.getText().toString() ;



             MainApp mainApp = new MainApp() ;


             mainApp.start(InfoStage);






         });





    }

}
