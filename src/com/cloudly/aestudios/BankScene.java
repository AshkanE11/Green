package com.cloudly.aestudios;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class BankScene extends Application {


    private static double xOffset = 0;
    private static double yOffset = 0;

    String datenum , datechar , amountnum , amountchar , person ;

    Label datenumlabel1 , datecharlabel1 , amountnumlabel1 , amountcharlabel1 , personlabel1 ;
    Label datenumlabel2 , datecharlabel2 , amountnumlabel2 , amountcharlabel2 , personlabel2 ;




    @Override
    public void start(Stage MainStage) {




        Image exiticon = new Image("com/cloudly/aestudios/Files/Background/exit.png") ;
        Image minimizeicon = new Image("com/cloudly/aestudios/Files/Background/minimize.png") ;
        Button menubutton = new Button("G") ;
        Button exitbutton = new Button() ;
        Button minimizebutton = new Button() ;
        exitbutton.setGraphic(new ImageView(exiticon));
        minimizebutton.setGraphic(new ImageView(minimizeicon));



        // MAINBACKGROUND  &&&  LOGO  !!!!!!!!

        Image mainbackground = new Image("com/cloudly/aestudios/Files/Background/mainbackground.png") ;
        ImageView mainbackgrounddisplay = new ImageView(mainbackground) ;
        mainbackgrounddisplay.setFitWidth(1200);
        mainbackgrounddisplay.setFitHeight(700);


        Image mainlogo = new Image("com/cloudly/aestudios/Files/Background/mainlogo.png") ;
        ImageView mainlogodisplay = new ImageView(mainlogo) ;
        mainlogodisplay.setFitWidth(200);
        mainlogodisplay.setFitHeight(200);









        // STARTING SCENE BUILD  ...


        Image cheque = new Image("com/cloudly/aestudios/Files/Background/cheque.png") ;
        ImageView chequeshow = new ImageView(cheque) ;


        TextField chequedatenum = new TextField() ;
        TextField chequedatechar = new TextField() ;
        TextField chequeamount = new TextField() ;
        TextField chequeamountchar = new TextField() ;
        TextField chequeperson = new TextField() ;

        chequedatenum.setPromptText("Date Num");
        chequedatechar.setPromptText("Date Char");
        chequeamount.setPromptText("Amount");
        chequeamountchar.setPromptText("Amount Char");
        chequeperson.setPromptText("Person");


        Button finishbutton = new Button("Convert") ;
        Button printbutton = new Button() ;
        Image printicon = new Image("com/cloudly/aestudios/Files/Background/printer.png") ;
        printbutton.setGraphic(new ImageView(printicon));












        StackPane bankstackpane = new StackPane() ;
        bankstackpane.getChildren().addAll(mainbackgrounddisplay , mainlogodisplay , menubutton , exitbutton , minimizebutton , chequedatenum , chequedatechar , chequeamount , chequeamountchar , chequeperson , finishbutton , chequeshow , printbutton) ;



        menubutton.getStyleClass().add("menubutton") ;
        exitbutton.getStyleClass().add("exitbutton") ;
        minimizebutton.getStyleClass().add("minimizebutton") ;
        mainbackgrounddisplay.getStyleClass().add("mainbackgrounddisplay") ;
        mainlogodisplay.getStyleClass().add("mainlogodisplay") ;
        chequedatenum.getStyleClass().add("chequedatenum") ;
        chequedatechar.getStyleClass().add("chequedatechar") ;
        chequeamount.getStyleClass().add("chequeamount") ;
        chequeamountchar.getStyleClass().add("chequeamountchar") ;
        chequeperson.getStyleClass().add("chequeperson") ;
        finishbutton.getStyleClass().add("finishbutton") ;
        chequeshow.getStyleClass().add("chequeshow") ;
        printbutton.getStyleClass().add("printbutton") ;



        Scene bankscene = new Scene(bankstackpane , 1200 , 700) ;
        bankscene.getStylesheets().add(getClass().getResource("BankScene.css").toExternalForm()) ;

        MainStage.setScene(bankscene);
        MainStage.setTitle("Green");








        // Finishbutton EVENT HANDELER &&&&& PRINT HANDELER




        finishbutton.setOnAction(e -> {





            datenum = chequedatenum.getText().toString() ;
            datechar = chequedatechar.getText().toString() ;
            amountnum = chequeamount.getText().toString() ;
            amountchar = chequeamountchar.getText().toString() ;
            person = chequeperson.getText().toString() ;




            datenumlabel1 = new Label() ;
            datecharlabel1 = new Label() ;
            amountnumlabel1 = new Label() ;
            amountcharlabel1 = new Label() ;
            personlabel1 = new Label() ;




            datenumlabel1.setText(datenum) ;
            datecharlabel1.setText(datechar) ;
            amountnumlabel1.setText(amountnum) ;
            amountcharlabel1.setText(amountchar) ;
            personlabel1.setText(person) ;






            bankstackpane.getChildren().addAll(datenumlabel1 , datecharlabel1 , amountnumlabel1 , amountcharlabel1 , personlabel1) ;






            datenumlabel1.getStyleClass().add("datenumlabel1") ;
            datecharlabel1.getStyleClass().add("datecharlabel1") ;
            amountnumlabel1.getStyleClass().add("amountnumlabel1") ;
            amountcharlabel1.getStyleClass().add("amountcharlabel1") ;
            personlabel1.getStyleClass().add("personlabel1") ;





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });



        finishbutton.setOnMousePressed(e -> {


            datenum = chequedatenum.getText().toString() ;
            datechar = chequedatechar.getText().toString() ;
            amountnum = chequeamount.getText().toString() ;
            amountchar = chequeamountchar.getText().toString() ;
            person = chequeperson.getText().toString() ;



            datenumlabel2 = new Label() ;
            datecharlabel2 = new Label() ;
            amountnumlabel2 = new Label() ;
            amountcharlabel2 = new Label() ;
            personlabel2 = new Label() ;




            datenumlabel1.setText(datenum) ;
            datecharlabel1.setText(datechar) ;
            amountnumlabel1.setText(amountnum) ;
            amountcharlabel1.setText(amountchar) ;
            personlabel1.setText(person) ;





            bankstackpane.getChildren().removeAll(datenumlabel1 , datecharlabel1 , amountnumlabel1 , amountcharlabel1 , personlabel1) ;
            bankstackpane.getChildren().addAll(datenumlabel2 , datecharlabel2 , amountnumlabel2 , amountcharlabel2 , personlabel2) ;





            datenumlabel2.getStyleClass().add("datenumlabel2") ;
            datecharlabel2.getStyleClass().add("datecharlabel2") ;
            amountnumlabel2.getStyleClass().add("amountnumlabel2") ;
            amountcharlabel2.getStyleClass().add("amountcharlabel2") ;
            personlabel2.getStyleClass().add("personlabel2") ;






        });



















        //NavigationBar HERE !!!!!!!!!!!!!!    *****************************************************************






        HBox MenuRoot = new HBox();
        VBox menubar = new VBox();




        // ADD ITEMS FOR MENUBAR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        Image mainlogomenubar = new Image("com/cloudly/aestudios/Files/Background/mainlogomenubar.png") ;
        ImageView mainlogomenubardisplay = new ImageView(mainlogomenubar) ;
        mainlogomenubardisplay.setFitWidth(300);
        mainlogomenubardisplay.setFitHeight(800);
        Image backarrow = new Image("com/cloudly/aestudios/Files/Background/undo.png") ;
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
                bankstackpane.getChildren().remove(MenuRoot);
            }
        });



        menubutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bankstackpane.getChildren().add(MenuRoot);
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






        // MAKES DRAGGING BRO !!!!!!!!!!!



        bankstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = MainStage.getX() - event.getScreenX();
                yOffset = MainStage.getY() - event.getScreenY();
            }
        });

        bankstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                MainStage.setX(event.getScreenX() + xOffset);
                MainStage.setY(event.getScreenY() + yOffset);
            }
        });



        // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



        exitbutton.setOnAction(e -> { Platform.exit(); });
        minimizebutton.setOnAction(e -> MainStage.setIconified(true));





        // SCENE CHANGER HERE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!








        orderbutton.setOnAction(e -> {

            OrderScene orderscene = new OrderScene() ;

            orderscene.start(MainStage);


        });

        factorbutton.setOnAction(e -> {

            FactorScene factorScene = new FactorScene() ;

            factorScene.start(MainStage);



        });

        bankbutton.setOnAction(e -> {

            BankScene bankScene = new BankScene() ;

            bankScene.start(MainStage);


        });


        morebutton.setOnAction(e -> {

            MoreScene moreScene = new MoreScene() ;


            moreScene.start(MainStage);




        });





    }


}