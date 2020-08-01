package com.cloudly.aestudios ;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class MainApp extends Application {


    private static double xOffset = 0;
    private static double yOffset = 0;


    @Override
    public void start(Stage InfoStage) {

        Image exiticon = new Image("com//cloudly//aestudios//Files//Background//exit.png") ;
        Image minimizeicon = new Image("com//cloudly//aestudios//Files//Background//minimize.png") ;

        Button menubutton = new Button("G") ;
        Button exitbutton = new Button() ;
        Button minimizebutton = new Button() ;
        exitbutton.setGraphic(new ImageView(exiticon));
        minimizebutton.setGraphic(new ImageView(minimizeicon));


        // MAINBACKGROUND  &&&  LOGO  !!!!!!!!

        Image mainbackground = new Image("com//cloudly//aestudios//Files//Background//mainbackground.png") ;
        ImageView mainbackgrounddisplay = new ImageView(mainbackground) ;
        mainbackgrounddisplay.setFitWidth(1200);
        mainbackgrounddisplay.setFitHeight(700);


        Image mainlogo = new Image("com//cloudly//aestudios//Files//Background//mainlogo.png") ;
        ImageView mainlogodisplay = new ImageView(mainlogo) ;
        mainlogodisplay.setFitWidth(200);
        mainlogodisplay.setFitHeight(200);



        // GENERAL1 HERE !!!

        Label general1label1 = new Label("Total") ;
        Label general1label2 = new Label("Value") ;
        Label general1label3 = new Label("0") ;
        Label general1label4 = new Label("$" + "0") ;
        HBox general1 = new HBox(general1label1 , general1label2 , general1label3 , general1label4) ;


        // GENERAL2 HERE !!!

        Label general2label1 = new Label("Factors") ;
        Label general2label2 = new Label("Value") ;
        Label general2label3 = new Label("0") ;
        Label general2label4 = new Label("$" + "0") ;
        HBox general2 = new HBox(general2label1 , general2label2 , general2label3 , general2label4) ;



        // GENERAL3 HERE !!!

        Label general3label1 = new Label("Orders") ;
        Label general3label2 = new Label("Value") ;
        Label general3label3 = new Label("0") ;
        Label general3label4 = new Label("$" + "0") ;
        HBox general3 = new HBox(general3label1 , general3label2 , general3label3 , general3label4) ;



        // GENERAL4 HERE !!!

        Label general4label1 = new Label("Cheques") ;
        Label general4label2 = new Label("Value") ;
        Label general4label3 = new Label("0") ;
        Label general4label4 = new Label("$" + "0") ;
        HBox general4 = new HBox(general4label1 , general4label2 , general4label3 , general4label4) ;







        StackPane mainstackpane = new StackPane() ;
        mainstackpane.getChildren().addAll(mainbackgrounddisplay , mainlogodisplay , menubutton , general1 , general2 , general3 , general4 , exitbutton , minimizebutton) ;



        menubutton.getStyleClass().add("menubutton") ;
        mainlogodisplay.getStyleClass().add("mainlogodisplay") ;
        exitbutton.getStyleClass().add("exitbutton") ;
        minimizebutton.getStyleClass().add("minimizebutton") ;






        // general1 styling

        general1.getStyleClass().add("general1") ;
        general1label1.getStyleClass().add("general1label1") ;
        general1label2.getStyleClass().add("general1label2") ;
        general1label3.getStyleClass().add("general1label3") ;
        general1label4.getStyleClass().add("general1label4") ;

        // general2 styling

        general2.getStyleClass().add("general2") ;
        general2label1.getStyleClass().add("general2label1") ;
        general2label2.getStyleClass().add("general2label2") ;
        general2label3.getStyleClass().add("general2label3") ;
        general2label4.getStyleClass().add("general2label4") ;

        // general3 styling

        general3.getStyleClass().add("general3") ;
        general3label1.getStyleClass().add("general3label1") ;
        general3label2.getStyleClass().add("general3label2") ;
        general3label3.getStyleClass().add("general3label3") ;
        general3label4.getStyleClass().add("general3label4") ;

        // general4 styling

        general4.getStyleClass().add("general4") ;
        general4label1.getStyleClass().add("general4label1") ;
        general4label2.getStyleClass().add("general4label2") ;
        general4label3.getStyleClass().add("general4label3") ;
        general4label4.getStyleClass().add("general4label4") ;


        // Application Icon

        Image icon = new Image("com//cloudly//aestudios//Files//Background//applicationicon.png") ;







        Scene mainscene = new Scene(mainstackpane , 1200 , 700) ;
        mainscene.getStylesheets().add(getClass().getResource("MainApp.css").toExternalForm()) ;





        InfoStage.setScene(mainscene);
        InfoStage.setTitle("Green");
        InfoStage.getIcons().add(icon) ;
        InfoStage.show() ;






        // MAKES DRAGGING BRO !!!!!!!!!!!!!!!!!!


        mainstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = InfoStage.getX() - event.getScreenX();
                yOffset = InfoStage.getY() - event.getScreenY();
            }
        });

        mainstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                InfoStage.setX(event.getScreenX() + xOffset);
                InfoStage.setY(event.getScreenY() + yOffset);
            }
        });





        // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



        exitbutton.setOnAction(e -> { Platform.exit(); });
        minimizebutton.setOnAction(e -> InfoStage.setIconified(true));






        //NavigationBar HERE !!!!!!!!!!!!!!    *****************************************************************






        HBox MenuRoot = new HBox();
        VBox menubar = new VBox();




        // ADD ITEMS FOR MENUBAR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        Image mainlogomenubar = new Image("com//cloudly//aestudios//Files//Background//mainlogomenubar.png") ;
        ImageView mainlogomenubardisplay = new ImageView(mainlogomenubar) ;
        mainlogomenubardisplay.setFitWidth(300);
        mainlogomenubardisplay.setFitHeight(800);
        Image backarrow = new Image("com//cloudly//aestudios//Files//Background//undo.png") ;
        Button backbutton = new Button();
        backbutton.setGraphic(new ImageView(backarrow));
        Button homebutton = new Button("Home");
        Button factorbutton = new Button("Factor");
        Button orderbutton = new Button("Order");
        Button bankbutton = new Button("Bank") ;
        Button morebutton = new Button("More") ;







        menubar.getStyleClass().add("menubar") ;
        MenuRoot.getStyleClass().add("MenuRoot") ;
        backbutton.getStyleClass().add("backbutton-menubar") ;
        homebutton.getStyleClass().add("homebutton-menubar");
        factorbutton.getStyleClass().add("factorbutton-menubar") ;
        orderbutton.getStyleClass().add("orderbutton-menubar") ;
        bankbutton.getStyleClass().add("bankbutton-menubar") ;
        morebutton.getStyleClass().add("morebutton-menubar") ;
        mainlogomenubardisplay.getStyleClass().add("mainlogomenubardisplay") ;








        menubar.getChildren().addAll(mainlogomenubardisplay , backbutton , homebutton , factorbutton , orderbutton , bankbutton , morebutton);
        VBox.setVgrow(homebutton , Priority.ALWAYS);
        MenuRoot.getChildren().add(menubar);



        // NAVIGATIONBAR EVENT HANDELERS *****************


        backbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                FadeTransition hideFileRootTransition = new FadeTransition(Duration.millis(500), MenuRoot);
                hideFileRootTransition.setFromValue(1.0);
                hideFileRootTransition.setToValue(0.0);

                FadeTransition showEditorRootTransition = new FadeTransition(Duration.millis(500));
                showEditorRootTransition.setFromValue(0.0);
                showEditorRootTransition.setToValue(1.0);

                showEditorRootTransition.play();
                hideFileRootTransition.play();
                mainstackpane.getChildren().remove(MenuRoot);
            }
        });



        menubutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainstackpane.getChildren().add(MenuRoot);
                FadeTransition hideEditorRootTransition = new FadeTransition(Duration.millis(500));
                hideEditorRootTransition.setFromValue(1.0);
                hideEditorRootTransition.setToValue(0.0);

                FadeTransition showFileRootTransition = new FadeTransition(Duration.millis(500), MenuRoot);
                showFileRootTransition.setFromValue(0.0);
                showFileRootTransition.setToValue(1.0);
                hideEditorRootTransition.play();
                showFileRootTransition.play();
            }
        });




        // SCENE CHANGER HERE !!!!!!!!!!!!!!!!!!!!!!!!


        factorbutton.setOnAction(e -> {


            FactorScene factorscene = new FactorScene() ;

            factorscene.start(InfoStage);


        });

        orderbutton.setOnAction(e -> {


            OrderScene orderscene = new OrderScene() ;

            orderscene.start(InfoStage);



        });



        bankbutton.setOnAction(e -> {


            BankScene bankscene = new BankScene() ;


            bankscene.start(InfoStage);





        });




        morebutton.setOnAction(e -> {

            MoreScene moreScene = new MoreScene() ;


            moreScene.start(InfoStage);




        });






    }




}
