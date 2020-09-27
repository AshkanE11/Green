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
    String datenum2 , datechar2 , amountnum2 , amountchar2 , person2 ;
    String datenum3 , datechar3 , amountnum3 , amountchar3 , person3 ;
    String datenum4 , datechar4 , amountnum4 , amountchar4 , person4 ;
    String datenum5 , datechar5 , amountnum5 , amountchar5 , person5 ;
    String datenum6 , datechar6 , amountnum6 , amountchar6 , person6 ;


    // PAIR ONE
    Label datenumlabel1 , datecharlabel1 , amountnumlabel1 , amountcharlabel1 , personlabel1 ;
    Label datenumlabel2 , datecharlabel2 , amountnumlabel2 , amountcharlabel2 , personlabel2 ;

    // PAIR TWO
    Label datenumlabel3 , datecharlabel3 , amountnumlabel3 , amountcharlabel3 , personlabel3 ;
    Label datenumlabel4 , datecharlabel4 , amountnumlabel4 , amountcharlabel4 , personlabel4 ;

    // PAIR THREE
    Label datenumlabel5 , datecharlabel5 , amountnumlabel5 , amountcharlabel5 , personlabel5 ;
    Label datenumlabel6 , datecharlabel6 , amountnumlabel6 , amountcharlabel6 , personlabel6 ;

    // PAIR FOUR
    Label datenumlabel7 , datecharlabel7 , amountnumlabel7 , amountcharlabel7 , personlabel7 ;
    Label datenumlabel8 , datecharlabel8 , amountnumlabel8 , amountcharlabel8 , personlabel8 ;

    // PAIR FIVE
    Label datenumlabel9 , datecharlabel9 , amountnumlabel9 , amountcharlabel9 , personlabel9 ;
    Label datenumlabel10 , datecharlabel10 , amountnumlabel10 , amountcharlabel10 , personlabel10 ;

    // PAIR SIX
    Label datenumlabel11 , datecharlabel11 , amountnumlabel11 , amountcharlabel11 , personlabel11 ;
    Label datenumlabel12 , datecharlabel12 , amountnumlabel12 , amountcharlabel12 , personlabel12 ;

    // PAIR SEVEN
    Label datenumlabel13 , datecharlabel13 , amountnumlabel13 , amountcharlabel13 , personlabel13 ;
    Label datenumlabel14 , datecharlabel14 , amountnumlabel14 , amountcharlabel14 , personlabel14 ;

    // PAIR EIGHT
    Label datenumlabel15 , datecharlabel15 , amountnumlabel15 , amountcharlabel15 , personlabel15 ;
    Label datenumlabel16 , datecharlabel16 , amountnumlabel16 , amountcharlabel16 , personlabel16 ;






    public static ImageView chequeshow ;


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


        Image Melatcheque = new Image("com/cloudly/aestudios/Files/Background/cheque.png") ;
        Image Ansarcheque = new Image("com/cloudly/aestudios/Files/Background/ansar.png") ;
        Image Hasanecheque = new Image("com/cloudly/aestudios/Files/Background/gharzolhasane.png") ;
        Image Keshavarzcheque = new Image("com/cloudly/aestudios/Files/Background/keshavarzi.png") ;
        Image Maskancheque = new Image("com/cloudly/aestudios/Files/Background/maskan.jpg") ;
        Image Parsiancheque = new Image("com/cloudly/aestudios/Files/Background/parsian.png") ;
        Image Samancheque = new Image("com/cloudly/aestudios/Files/Background/saman.png") ;
        Image EmptyLogo = new Image("com/cloudly/aestudios/Files/Background/empty.jpg") ;

        chequeshow = new ImageView() ;



        Button bankSwitch1 = new Button("M") ;
        Button bankSwitch2 = new Button("A") ;
        Button bankSwitch3 = new Button("G") ;
        Button bankSwitch4 = new Button("K") ;
        Button bankSwitch5 = new Button("M") ;
        Button bankSwitch6 = new Button("P") ;
        Button bankSwitch7 = new Button("S") ;


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
        Button finishbutton2 = new Button("Convert") ;
        Button finishbutton3 = new Button("Convert") ;
        Button finishbutton4 = new Button("Convert") ;
        Button finishbutton5 = new Button("Convert") ;
        Button finishbutton6 = new Button("Convert") ;
        Button finishbutton7 = new Button("Convert") ;
        Button printbutton = new Button() ;
        Image printicon = new Image("com/cloudly/aestudios/Files/Background/printer.png") ;
        printbutton.setGraphic(new ImageView(printicon));












        StackPane bankstackpane = new StackPane() ;
        bankstackpane.getChildren().addAll(mainbackgrounddisplay , mainlogodisplay , menubutton , exitbutton , minimizebutton , chequedatenum , chequedatechar , chequeamount , chequeamountchar , chequeperson , printbutton , bankSwitch1 , bankSwitch2 , bankSwitch3 , bankSwitch4 , bankSwitch5 , bankSwitch6 , bankSwitch7 , chequeshow) ;



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
        finishbutton2.getStyleClass().add("finishbutton") ;
        finishbutton3.getStyleClass().add("finishbutton") ;
        finishbutton4.getStyleClass().add("finishbutton") ;
        finishbutton5.getStyleClass().add("finishbutton") ;
        finishbutton6.getStyleClass().add("finishbutton") ;
        finishbutton7.getStyleClass().add("finishbutton") ;
        chequeshow.getStyleClass().add("chequeshow") ;
        printbutton.getStyleClass().add("printbutton") ;
        bankSwitch1.getStyleClass().add("bankSwitch1") ;
        bankSwitch2.getStyleClass().add("bankSwitch2") ;
        bankSwitch3.getStyleClass().add("bankSwitch3") ;
        bankSwitch4.getStyleClass().add("bankSwitch4") ;
        bankSwitch5.getStyleClass().add("bankSwitch5") ;
        bankSwitch6.getStyleClass().add("bankSwitch6") ;
        bankSwitch7.getStyleClass().add("bankSwitch7") ;



        Scene bankscene = new Scene(bankstackpane , 1200 , 700) ;
        bankscene.getStylesheets().add(getClass().getResource("BankScene.css").toExternalForm()) ;

        MainStage.setScene(bankscene);
        MainStage.setTitle("Green");





        // Banks Changing ...


        bankSwitch1.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton2 , finishbutton3 , finishbutton4 , finishbutton5 , finishbutton6 , finishbutton7);
            chequeshow.setImage(Melatcheque);
            bankstackpane.getChildren().addAll(chequeshow , finishbutton) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });

        bankSwitch2.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton3 , finishbutton4 , finishbutton5 , finishbutton6 , finishbutton7);
            chequeshow.setImage(Ansarcheque);
            bankstackpane.getChildren().addAll(chequeshow , finishbutton2) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });


        bankSwitch3.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton2 , finishbutton4 , finishbutton5 , finishbutton6 , finishbutton7);
            chequeshow = new ImageView(Hasanecheque) ;
            bankstackpane.getChildren().addAll(chequeshow , finishbutton3) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });


        bankSwitch4.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton2 , finishbutton3 , finishbutton5 , finishbutton6 , finishbutton7);
            chequeshow = new ImageView(Keshavarzcheque) ;
            bankstackpane.getChildren().addAll(chequeshow , finishbutton4) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });


        bankSwitch5.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton2 , finishbutton3 , finishbutton3 , finishbutton4 , finishbutton6 , finishbutton7);
            chequeshow = new ImageView(Maskancheque) ;
            bankstackpane.getChildren().addAll(chequeshow , finishbutton5) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });


        bankSwitch6.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton2 , finishbutton3 , finishbutton4 , finishbutton5 , finishbutton7) ;
            chequeshow = new ImageView(Parsiancheque) ;
            bankstackpane.getChildren().addAll(chequeshow , finishbutton6) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);



        });


        bankSwitch7.setOnAction(e -> {



            bankstackpane.getChildren().removeAll(chequeshow , finishbutton , finishbutton2 , finishbutton3 , finishbutton4 , finishbutton5 , finishbutton6);
            chequeshow = new ImageView(Samancheque) ;
            bankstackpane.getChildren().addAll(chequeshow , finishbutton7) ;
            chequeshow.getStyleClass().add("chequeshow") ;
            chequeshow.setFitWidth(800);
            chequeshow.setFitHeight(400);




        });






        // Finishbutton EVENT HANDELER &&&&& PRINT HANDELER



        // FINISH ONE


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



            bankstackpane.getChildren().removeAll(datenumlabel1 , datecharlabel1 , amountnumlabel1 , amountcharlabel1 , personlabel1) ;




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


        // FINISH TWO


        finishbutton2.setOnAction(e -> {





            datenum2 = chequedatenum.getText().toString() ;
            datechar2 = chequedatechar.getText().toString() ;
            amountnum2 = chequeamount.getText().toString() ;
            amountchar2 = chequeamountchar.getText().toString() ;
            person2 = chequeperson.getText().toString() ;




            datenumlabel5 = new Label() ;
            datecharlabel5 = new Label() ;
            amountnumlabel5 = new Label() ;
            amountcharlabel5 = new Label() ;
            personlabel5 = new Label() ;




            datenumlabel5.setText(datenum2) ;
            datecharlabel5.setText(datechar2) ;
            amountnumlabel5.setText(amountnum2) ;
            amountcharlabel5.setText(amountchar2) ;
            personlabel5.setText(person2) ;






            bankstackpane.getChildren().addAll(datenumlabel5 , datecharlabel5 , amountnumlabel5 , amountcharlabel5 , personlabel5) ;




            datenumlabel5.setStyle("-fx-translate-x: 40px; -fx-translate-y: -100px");
            datecharlabel5.setStyle("-fx-translate-x: -60px; -fx-translate-y: -72px");
            amountnumlabel5.setStyle("-fx-translate-x: -210px; -fx-translate-y: -12px");
            amountcharlabel5.setStyle("-fx-translate-x: -380px; -fx-translate-y: 113px");
            personlabel5.setStyle("-fx-translate-x: 0px; -fx-translate-y: 30px");





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });


        finishbutton2.setOnMousePressed(e -> {




            bankstackpane.getChildren().removeAll(datenumlabel5 , datecharlabel5 , amountnumlabel5 , amountcharlabel5 , personlabel5) ;



            datenum2 = chequedatenum.getText().toString() ;
            datechar2 = chequedatechar.getText().toString() ;
            amountnum2 = chequeamount.getText().toString() ;
            amountchar2 = chequeamountchar.getText().toString() ;
            person2 = chequeperson.getText().toString() ;



            datenumlabel5.setStyle("-fx-translate-x: 40px; -fx-translate-y: -100px");
            datecharlabel5.setStyle("-fx-translate-x: -60px; -fx-translate-y: -72px");
            amountnumlabel5.setStyle("-fx-translate-x: -210px; -fx-translate-y: -12px");
            amountcharlabel5.setStyle("-fx-translate-x: -380px; -fx-translate-y: 113px");
            personlabel5.setStyle("-fx-translate-x: 0px; -fx-translate-y: 30px");



            datenumlabel5 = new Label() ;
            datecharlabel5 = new Label() ;
            amountnumlabel5 = new Label() ;
            amountcharlabel5 = new Label() ;
            personlabel5 = new Label() ;




            datenumlabel5.setText(datenum2) ;
            datecharlabel5.setText(datechar2) ;
            amountnumlabel5.setText(amountnum2) ;
            amountcharlabel5.setText(amountchar2) ;
            personlabel5.setText(person2) ;






            bankstackpane.getChildren().addAll(datenumlabel5 , datecharlabel5 , amountnumlabel5 , amountcharlabel5 , personlabel5) ;






            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);










        });


        // FINISH THREE


        finishbutton3.setOnAction(e -> {





            datenum3 = chequedatenum.getText().toString() ;
            datechar3 = chequedatechar.getText().toString() ;
            amountnum3 = chequeamount.getText().toString() ;
            amountchar3 = chequeamountchar.getText().toString() ;
            person3 = chequeperson.getText().toString() ;




            datenumlabel9 = new Label() ;
            datecharlabel9 = new Label() ;
            amountnumlabel9 = new Label() ;
            amountcharlabel9 = new Label() ;
            personlabel9 = new Label() ;




            datenumlabel9.setText(datenum3) ;
            datecharlabel9.setText(datechar3) ;
            amountnumlabel9.setText(amountnum3) ;
            amountcharlabel9.setText(amountchar3) ;
            personlabel9.setText(person3) ;






            bankstackpane.getChildren().addAll(datenumlabel9 , datecharlabel9 , amountnumlabel9 , amountcharlabel9 , personlabel9) ;






            datenumlabel9.setStyle("-fx-translate-x: 40px; -fx-translate-y: -130px");
            datecharlabel9.setStyle("-fx-translate-x: 0px; -fx-translate-y: -72px");
            amountnumlabel9.setStyle("-fx-translate-x: -210px; -fx-translate-y: -12px");
            amountcharlabel9.setStyle("-fx-translate-x: -390px; -fx-translate-y: 140px");
            personlabel9.setStyle("-fx-translate-x: 0px; -fx-translate-y: 30px");





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });

        finishbutton3.setOnMousePressed(e -> {



            bankstackpane.getChildren().removeAll(datenumlabel9 , datecharlabel9 , amountnumlabel9 , amountcharlabel9 , personlabel9) ;




            datenum3 = chequedatenum.getText().toString() ;
            datechar3 = chequedatechar.getText().toString() ;
            amountnum3 = chequeamount.getText().toString() ;
            amountchar3 = chequeamountchar.getText().toString() ;
            person3 = chequeperson.getText().toString() ;




            datenumlabel9 = new Label() ;
            datecharlabel9 = new Label() ;
            amountnumlabel9 = new Label() ;
            amountcharlabel9 = new Label() ;
            personlabel9 = new Label() ;




            datenumlabel9.setText(datenum3) ;
            datecharlabel9.setText(datechar3) ;
            amountnumlabel9.setText(amountnum3) ;
            amountcharlabel9.setText(amountchar3) ;
            personlabel9.setText(person3) ;






            bankstackpane.getChildren().addAll(datenumlabel9 , datecharlabel9 , amountnumlabel9 , amountcharlabel9 , personlabel9) ;






            datenumlabel9.setStyle("-fx-translate-x: 40px; -fx-translate-y: -130px");
            datecharlabel9.setStyle("-fx-translate-x: 0px; -fx-translate-y: -72px");
            amountnumlabel9.setStyle("-fx-translate-x: -210px; -fx-translate-y: -12px");
            amountcharlabel9.setStyle("-fx-translate-x: -450px; -fx-translate-y: 90px");
            personlabel9.setStyle("-fx-translate-x: 0px; -fx-translate-y: 30px");




            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);








        });



        // FINISH FOUR


        finishbutton4.setOnAction(e -> {





            datenum4 = chequedatenum.getText().toString() ;
            datechar4 = chequedatechar.getText().toString() ;
            amountnum4 = chequeamount.getText().toString() ;
            amountchar4 = chequeamountchar.getText().toString() ;
            person4 = chequeperson.getText().toString() ;




            datenumlabel11 = new Label() ;
            datecharlabel11 = new Label() ;
            amountnumlabel11 = new Label() ;
            amountcharlabel11 = new Label() ;
            personlabel11 = new Label() ;




            datenumlabel11.setText(datenum4) ;
            datecharlabel11.setText(datechar4) ;
            amountnumlabel11.setText(amountnum4) ;
            amountcharlabel11.setText(amountchar4) ;
            personlabel11.setText(person4) ;






            bankstackpane.getChildren().addAll(datenumlabel11 , datecharlabel11 , amountnumlabel11 , amountcharlabel11 , personlabel11) ;






            datenumlabel11.getStyleClass().add("datenumlabel1") ;
            datecharlabel11.getStyleClass().add("datecharlabel1") ;
            amountnumlabel11.getStyleClass().add("amountnumlabel1") ;
            amountcharlabel11.getStyleClass().add("amountcharlabel1") ;
            personlabel11.getStyleClass().add("personlabel1") ;





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });


        finishbutton4.setOnMousePressed(e -> {



            bankstackpane.getChildren().removeAll(datenumlabel11 , datecharlabel11 , amountnumlabel11 , amountcharlabel11 , personlabel11) ;





            datenum4 = chequedatenum.getText().toString() ;
            datechar4 = chequedatechar.getText().toString() ;
            amountnum4 = chequeamount.getText().toString() ;
            amountchar4 = chequeamountchar.getText().toString() ;
            person4 = chequeperson.getText().toString() ;




            datenumlabel11 = new Label() ;
            datecharlabel11 = new Label() ;
            amountnumlabel11 = new Label() ;
            amountcharlabel11 = new Label() ;
            personlabel11 = new Label() ;




            datenumlabel11.setText(datenum4) ;
            datecharlabel11.setText(datechar4) ;
            amountnumlabel11.setText(amountnum4) ;
            amountcharlabel11.setText(amountchar4) ;
            personlabel11.setText(person4) ;






            bankstackpane.getChildren().addAll(datenumlabel11 , datecharlabel11 , amountnumlabel11 , amountcharlabel11 , personlabel11) ;






            datenumlabel11.getStyleClass().add("datenumlabel1") ;
            datecharlabel11.getStyleClass().add("datecharlabel1") ;
            amountnumlabel11.getStyleClass().add("amountnumlabel1") ;
            amountcharlabel11.getStyleClass().add("amountcharlabel1") ;
            personlabel11.getStyleClass().add("personlabel1") ;





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);









        });










        // FINISH FIVE


        finishbutton5.setOnAction(e -> {





            datenum5 = chequedatenum.getText().toString() ;
            datechar5 = chequedatechar.getText().toString() ;
            amountnum5 = chequeamount.getText().toString() ;
            amountchar5 = chequeamountchar.getText().toString() ;
            person5 = chequeperson.getText().toString() ;




            datenumlabel13 = new Label() ;
            datecharlabel13 = new Label() ;
            amountnumlabel13 = new Label() ;
            amountcharlabel13 = new Label() ;
            personlabel13 = new Label() ;




            datenumlabel13.setText(datenum5) ;
            datecharlabel13.setText(datechar5) ;
            amountnumlabel13.setText(amountnum5) ;
            amountcharlabel13.setText(amountchar5) ;
            personlabel13.setText(person5) ;






            bankstackpane.getChildren().addAll(datenumlabel13 , datecharlabel13 , amountnumlabel13 , amountcharlabel13 , personlabel13) ;






            datenumlabel13.getStyleClass().add("datenumlabel1") ;
            datecharlabel13.getStyleClass().add("datecharlabel1") ;
            amountnumlabel13.getStyleClass().add("amountnumlabel1") ;
            amountcharlabel13.getStyleClass().add("amountcharlabel1") ;
            personlabel13.getStyleClass().add("personlabel1") ;





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });



        finishbutton5.setOnMousePressed(e -> {


            datenum5 = chequedatenum.getText().toString() ;
            datechar5 = chequedatechar.getText().toString() ;
            amountnum5 = chequeamount.getText().toString() ;
            amountchar5 = chequeamountchar.getText().toString() ;
            person5 = chequeperson.getText().toString() ;



            datenumlabel14 = new Label() ;
            datecharlabel14 = new Label() ;
            amountnumlabel14 = new Label() ;
            amountcharlabel14 = new Label() ;
            personlabel14 = new Label() ;




            datenumlabel13.setText(datenum5) ;
            datecharlabel13.setText(datechar5) ;
            amountnumlabel13.setText(amountnum5) ;
            amountcharlabel13.setText(amountchar5) ;
            personlabel13.setText(person5) ;





            bankstackpane.getChildren().removeAll(datenumlabel13 , datecharlabel13 , amountnumlabel13 , amountcharlabel13 , personlabel13) ;
            bankstackpane.getChildren().addAll(datenumlabel14 , datecharlabel14 , amountnumlabel14 , amountcharlabel14 , personlabel14) ;





            datenumlabel14.getStyleClass().add("datenumlabel2") ;
            datecharlabel14.getStyleClass().add("datecharlabel2") ;
            amountnumlabel14.getStyleClass().add("amountnumlabel2") ;
            amountcharlabel14.getStyleClass().add("amountcharlabel2") ;
            personlabel14.getStyleClass().add("personlabel2") ;






        });




        // FINISH SIX


        finishbutton6.setOnAction(e -> {





            datenum6 = chequedatenum.getText().toString() ;
            datechar6 = chequedatechar.getText().toString() ;
            amountnum6 = chequeamount.getText().toString() ;
            amountchar6 = chequeamountchar.getText().toString() ;
            person6 = chequeperson.getText().toString() ;




            datenumlabel15 = new Label() ;
            datecharlabel15 = new Label() ;
            amountnumlabel15 = new Label() ;
            amountcharlabel15 = new Label() ;
            personlabel15 = new Label() ;




            datenumlabel15.setText(datenum6) ;
            datecharlabel15.setText(datechar6) ;
            amountnumlabel15.setText(amountnum6) ;
            amountcharlabel15.setText(amountchar6) ;
            personlabel15.setText(person6) ;






            bankstackpane.getChildren().addAll(datenumlabel15 , datecharlabel15 , amountnumlabel15 , amountcharlabel15 , personlabel15) ;






            datenumlabel15.getStyleClass().add("datenumlabel1") ;
            datecharlabel15.getStyleClass().add("datecharlabel1") ;
            amountnumlabel15.getStyleClass().add("amountnumlabel1") ;
            amountcharlabel15.getStyleClass().add("amountcharlabel1") ;
            personlabel15.getStyleClass().add("personlabel1") ;





            chequedatenum.setText(null);
            chequedatechar.setText(null);
            chequeamount.setText(null);
            chequeamountchar.setText(null);
            chequeperson.setText(null);





        });





        finishbutton6.setOnMousePressed(e -> {


            datenum6 = chequedatenum.getText().toString() ;
            datechar6 = chequedatechar.getText().toString() ;
            amountnum6 = chequeamount.getText().toString() ;
            amountchar6 = chequeamountchar.getText().toString() ;
            person6 = chequeperson.getText().toString() ;



            datenumlabel16 = new Label() ;
            datecharlabel16 = new Label() ;
            amountnumlabel16 = new Label() ;
            amountcharlabel16 = new Label() ;
            personlabel16 = new Label() ;




            datenumlabel15.setText(datenum6) ;
            datecharlabel15.setText(datechar6) ;
            amountnumlabel15.setText(amountnum6) ;
            amountcharlabel15.setText(amountchar6) ;
            personlabel15.setText(person6) ;





            bankstackpane.getChildren().removeAll(datenumlabel15 , datecharlabel15 , amountnumlabel15 , amountcharlabel15 , personlabel15) ;
            bankstackpane.getChildren().addAll(datenumlabel16 , datecharlabel16 , amountnumlabel16 , amountcharlabel16 , personlabel16) ;





            datenumlabel16.getStyleClass().add("datenumlabel2") ;
            datecharlabel16.getStyleClass().add("datecharlabel2") ;
            amountnumlabel16.getStyleClass().add("amountnumlabel2") ;
            amountcharlabel16.getStyleClass().add("amountcharlabel2") ;
            personlabel16.getStyleClass().add("personlabel2") ;






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




        homebutton.setOnAction(e -> {


            MainApp mainApp = new MainApp() ;

            mainApp.start(MainStage);



        });


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