package com.cloudly.aestudios;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Info extends Application {


    private static double xOffset = 0;
    private static double yOffset = 0;


    @Override
    public void start(Stage InfoStage) throws Exception {





        Label scene1txt = new Label("Greetings To Cloudly !") ;
        Label scene1txt2 = new Label("Cloudly, is delightful accounting conformity for inventory management roles and Functions.") ;
        Label scene1txt3 = new Label("Cloudly is a further intelligent form of way and easement for administration") ;
        Label scene1txt4 = new Label("and tiny corporations that wants to get more widely and extensively acquainted") ;
        Label scene1txt5 = new Label("by their business statics and attachments.") ;
        Button scene1rightbutton = new Button("") ;
        Image scene1image = new Image("com/cloudly/aestudios/Files/Background/add.png") ;
        ImageView scene1imagedisplay = new ImageView(scene1image) ;
        scene1imagedisplay.setFitWidth(500);
        scene1imagedisplay.setFitHeight(600);

        Image scene1imagelogo = new Image("com/cloudly/aestudios/Files/Background/addl.png") ;
        ImageView scene1imagelogodisplay = new ImageView(scene1imagelogo) ;
        scene1imagelogodisplay.setFitWidth(100);
        scene1imagelogodisplay.setFitHeight(100);

        StackPane infostackpane = new StackPane() ;
        infostackpane.getChildren().add(scene1imagedisplay) ;
        infostackpane.getChildren().add(scene1rightbutton) ;
        infostackpane.getChildren().add(scene1txt) ;
        infostackpane.getChildren().add(scene1imagelogodisplay) ;
        infostackpane.getChildren().addAll(scene1txt2 , scene1txt3 , scene1txt4 ,  scene1txt5) ;

        scene1txt.getStyleClass().add("scene1txt") ;
        scene1imagedisplay.getStyleClass().add("scene1imagedisplay") ;
        scene1rightbutton.getStyleClass().add("scene1rightbutton") ;
        scene1imagelogodisplay.getStyleClass().add("scene1imagelogodisplay") ;
        infostackpane.getStyleClass().add("root1") ;
        scene1txt2.getStyleClass().add("scene1txt2") ;
        scene1txt3.getStyleClass().add("scene1txt3") ;
        scene1txt4.getStyleClass().add("scene1txt4") ;
        scene1txt5.getStyleClass().add("scene1txt5") ;

        Scene infoscene = new Scene(infostackpane , 1200 , 700) ;
        infoscene.getStylesheets().add(getClass().getResource("Info.css").toExternalForm()) ;

        InfoStage.setScene(infoscene);
        InfoStage.setResizable(false);
        InfoStage.initStyle(StageStyle.UNDECORATED);
        InfoStage.show();








        //SCENE 2 HERE *********************************************************************************


        Label scene2txt = new Label("Secure, Fast, Easy.") ;
        Label scene2txt2 = new Label("Cloudly is a high formation vision from every business manager's.") ;
        Label scene2txt3 = new Label("and counselor's perspective. Whom") ;
        Label scene2txt4 = new Label("its a business survey which gives that peace of mind to users for using") ;
        Label scene2txt5 = new Label("it by their component for their professions.") ;
        Button scene2rightbutton = new Button("") ;
        Button scene2leftbutton = new Button("") ;
        Image scene2image = new Image("com//cloudly//aestudios//Files//Background//third.png") ;
        ImageView scene2imagedisplay = new ImageView(scene2image) ;
        scene2imagedisplay.setFitWidth(500);
        scene2imagedisplay.setFitHeight(600);

        Image scene2logo = new Image("com//cloudly//aestudios//Files//Background//secondl.png") ;
        ImageView scene2logodisplay = new ImageView(scene2logo) ;
        scene2logodisplay.setFitWidth(100);
        scene2logodisplay.setFitHeight(100);

        StackPane scene2stackpane = new StackPane() ;
        scene2stackpane.getChildren().addAll( scene2imagedisplay , scene2txt ,  scene2rightbutton , scene2leftbutton , scene2logodisplay , scene2txt2 , scene2txt3 , scene2txt4 , scene2txt5) ;

        scene2txt.getStyleClass().add("scene2txt") ;
        scene2imagedisplay.getStyleClass().add("scene2imagedisplay") ;
        scene2rightbutton.getStyleClass().add("scene2rightbutton") ;
        scene2leftbutton.getStyleClass().add("scene2leftbutton") ;
        scene2stackpane.getStyleClass().add("root2") ;
        scene2logodisplay.getStyleClass().add("scene2logodisplay") ;
        scene2txt2.getStyleClass().add("scene2txt2") ;
        scene2txt3.getStyleClass().add("scene2txt3") ;
        scene2txt4.getStyleClass().add("scene2txt4") ;
        scene2txt5.getStyleClass().add("scene2txt5") ;



        Scene scene2scene = new Scene(scene2stackpane , 1200 ,700) ;
        scene2scene.getStylesheets().add(getClass().getResource("Info.css").toExternalForm()) ;




        //SCENE 3 HERE *********************************************************************************



        Label scene3txt = new Label("Latest Stationary...") ;
        Label scene3txt2 = new Label("Consequently, there are more efficient ways of accomplishing and ") ;
        Label scene3txt3 = new Label("operating rather than stimulating and extremely laborious ways ... Cloudly") ;
        Label scene3txt4 = new Label("is the most dependable alternative to have your company beneficial and") ;
        Label scene3txt5 = new Label("admirable running even with hard provocations with further mindfulness.") ;
        Button scene3rightbutton = new Button("") ;
        Button scene3leftbutton = new Button("") ;
        Image scene3image = new Image("com//cloudly//aestudios//Files//Background//forth.png") ;
        ImageView scene3imagedisplay = new ImageView(scene3image) ;
        scene3imagedisplay.setFitWidth(600);
        scene3imagedisplay.setFitHeight(600);

        Image scene3logo = new Image("com//cloudly//aestudios//Files//Background//thirdl.png") ;
        ImageView scene3logodisplay = new ImageView(scene3logo) ;

        StackPane scene3stackpane = new StackPane() ;
        scene3stackpane.getChildren().addAll( scene3imagedisplay , scene3txt ,  scene3rightbutton , scene3leftbutton , scene3logodisplay , scene3txt2 , scene3txt3 , scene3txt4 , scene3txt5) ;

        scene3txt.getStyleClass().add("scene3txt") ;
        scene3imagedisplay.getStyleClass().add("scene3imagedisplay") ;
        scene3rightbutton.getStyleClass().add("scene3rightbutton") ;
        scene3leftbutton.getStyleClass().add("scene3leftbutton") ;
        scene3stackpane.getStyleClass().add("root3") ;
        scene3logodisplay.getStyleClass().add("scene3logodisplay") ;
        scene3txt2.getStyleClass().add("scene3txt2") ;
        scene3txt3.getStyleClass().add("scene3txt3") ;
        scene3txt4.getStyleClass().add("scene3txt4") ;
        scene3txt5.getStyleClass().add("scene3txt5") ;


        Scene scene3scene = new Scene(scene3stackpane , 1200 ,700) ;
        scene3scene.getStylesheets().add(getClass().getResource("Info.css").toExternalForm()) ;



        //SCENE 4 HERE *********************************************************************************




        Label scene4txt = new Label("Start Your Expedition ...") ;
        Button startbutton = new Button("Start") ;
        Button scene4leftbutton = new Button("") ;
        Image scene4image = new Image("com//cloudly//aestudios//Files//Background//46.png") ;
        ImageView scene4imagedisplay = new ImageView(scene4image) ;
        scene4imagedisplay.setFitWidth(1100);
        scene4imagedisplay.setFitHeight(700);

        StackPane scene4stackpane = new StackPane() ;
        scene4stackpane.getChildren().addAll( scene4imagedisplay , scene4txt , scene4leftbutton , startbutton) ;

        scene4txt.getStyleClass().add("scene4txt") ;
        scene4imagedisplay.getStyleClass().add("scene4imagedisplay") ;
        scene4leftbutton.getStyleClass().add("scene4leftbutton") ;
        scene4stackpane.getStyleClass().add("root4") ;
        startbutton.getStyleClass().add("startbutton") ;


        Scene scene4scene = new Scene(scene4stackpane , 1200 ,700) ;
        scene4scene.getStylesheets().add(getClass().getResource("Info.css").toExternalForm()) ;




        //HANDELERS HERE *********************************************************************************



        scene1rightbutton.setOnAction(e -> InfoStage.setScene(scene2scene));

        scene2rightbutton.setOnAction(e -> InfoStage.setScene(scene3scene));
        scene2leftbutton.setOnAction(e -> InfoStage.setScene(infoscene));

        scene3rightbutton.setOnAction(e -> InfoStage.setScene(scene4scene));
        scene3leftbutton.setOnAction(e -> InfoStage.setScene(scene2scene));

        scene4leftbutton.setOnAction(e -> InfoStage.setScene(scene3scene));




        // MAKES DRAGGING BRO !!!!!!!!!!!!!!!!!!


        // SCENE1

        infostackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        infostackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });


        // SCENE2

        scene2stackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        scene2stackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });


        // SCENE3


        scene3stackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        scene3stackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });

        // SCENE4

        scene4stackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        scene4stackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });


        // SCENE SWICHER


        startbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                Login loginform = new Login() ;
                loginform.start(InfoStage);





            }
        });





    }





    public static void main(String [] args){ launch(args); }


}
