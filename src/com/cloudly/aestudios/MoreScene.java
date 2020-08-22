
package com.cloudly.aestudios ;



import javafx.animation.FadeTransition;
import javafx.application.Application;
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
import javafx.util.Duration;


public class MoreScene extends Application {



    private static double xOffset = 0;
    private static double yOffset = 0;




    @Override
    public void start(Stage MainStage) {





        Label deslbl1 = new Label("My First Java Application ...") ;
        Label deslbl2 = new Label("Developed with LOVE by ...") ;
        Label deslbl3  = new Label("GitHub:   AshkanE11") ;
        Label deslbl4 = new Label("Developer Contact:") ;
        Label deslbl5 = new Label("ashkanebtekari@gmail.com") ;
        Label deslbl6 = new Label("+1 3609481143") ;
        Label deslbl7 = new Label("Ashkan Ebtekari") ;
        Image icecream = new Image("com//cloudly//aestudios//Files//Background//popsicle.png") ;
        ImageView icecreamshow = new ImageView(icecream) ;
        icecreamshow.setFitWidth(400);
        icecreamshow.setFitHeight(400);
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










        StackPane morestackpane = new StackPane() ;
        morestackpane.getChildren().addAll(mainbackgrounddisplay , menubutton , exitbutton , minimizebutton , mainlogodisplay , deslbl1 , deslbl2 , deslbl3 , deslbl4 , deslbl5 , deslbl6 , deslbl7 , icecreamshow) ;








        menubutton.getStyleClass().add("menubutton") ;
        exitbutton.getStyleClass().add("exitbutton") ;
        minimizebutton.getStyleClass().add("minimizebutton") ;
        mainbackgrounddisplay.getStyleClass().add("mainbackgrounddisplay") ;
        mainlogodisplay.getStyleClass().add("mainlogodisplay") ;
        deslbl1.getStyleClass().add("deslbl1") ;
        deslbl2.getStyleClass().add("deslbl2") ;
        deslbl3.getStyleClass().add("deslbl3") ;
        deslbl4.getStyleClass().add("deslbl4") ;
        deslbl5.getStyleClass().add("deslbl5") ;
        deslbl6.getStyleClass().add("deslbl6") ;
        deslbl7.getStyleClass().add("deslbl7") ;
        icecreamshow.getStyleClass().add("icecreamshow") ;





        Scene morescene = new Scene(morestackpane , 1200 , 700) ;
        morescene.getStylesheets().add(getClass().getResource("MoreScene.css").toExternalForm()) ;





        MainStage.setScene(morescene);
        MainStage.show();











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
                morestackpane.getChildren().remove(MenuRoot);
            }
        });



        menubutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                morestackpane.getChildren().add(MenuRoot);
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



        morestackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = MainStage.getX() - event.getScreenX();
                yOffset = MainStage.getY() - event.getScreenY();
            }
        });

        morestackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                MainStage.setX(event.getScreenX() + xOffset);
                MainStage.setY(event.getScreenY() + yOffset);
            }
        });









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






        // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



        exitbutton.setOnAction(e -> { MainStage.close(); });
        minimizebutton.setOnAction(e -> MainStage.setIconified(true));











    }











}