package com.cloudly.aestudios ;


import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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





public class FactorScene extends Application {



    public SearchResults searchresultat = new SearchResults() ;



    private static double xOffset = 0;
    private static double yOffset = 0;
    public String additemname , additemprice;
    public String dollarsign = "$" ;
    public Label itemshow , priceshow ;
    public TextField countshow ;




    public TableView searchresults = new TableView() ;
    public TableView cartitems = new TableView() ;
    public TableView customertable = new TableView() ;



    int itemcounter , factorcounter , customercounter ;



    @Override
    public void start(Stage MainStage) {



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

        Label general1label = new Label("Matter") ;
        Image icon1 = new Image("com//cloudly//aestudios//Files//Background//general1icon.png") ;
        ImageView general1icon = new ImageView(icon1) ;
        general1icon.setFitWidth(100);
        general1icon.setFitHeight(100);

        HBox general1 = new HBox(general1icon , general1label) ;


        // GENERAL2 HERE !!!

        Label general2label = new Label("Factor") ;
        Image icon2 = new Image("com//cloudly//aestudios//Files//Background//general2icon.png") ;
        ImageView general2icon = new ImageView(icon2) ;
        general2icon.setFitWidth(100);
        general2icon.setFitHeight(100);

        HBox general2 = new HBox(general2label , general2icon) ;



        // GENERAL3 HERE !!!

        Label general3label = new Label("Clients") ;
        Image icon3 = new Image("com//cloudly//aestudios//Files//Background//general3icon.png") ;
        ImageView general3icon = new ImageView(icon3) ;
        general3icon.setFitWidth(100);
        general3icon.setFitHeight(100);

        HBox general3 = new HBox(general3label , general3icon) ;










        StackPane factorstackpane = new StackPane() ;
        factorstackpane.getChildren().addAll(mainbackgrounddisplay , mainlogodisplay , menubutton , exitbutton , minimizebutton , general1 , general2 , general3) ;



        menubutton.getStyleClass().add("menubutton") ;
        exitbutton.getStyleClass().add("exitbutton") ;
        minimizebutton.getStyleClass().add("minimizebutton") ;
        mainbackgrounddisplay.getStyleClass().add("mainbackgrounddisplay") ;
        mainlogodisplay.getStyleClass().add("mainlogodisplay") ;
        general1.getStyleClass().add("general1") ;
        general2.getStyleClass().add("general2") ;
        general3.getStyleClass().add("general3") ;
        general1label.getStyleClass().add("general1label") ;
        general2label.getStyleClass().add("general2label") ;
        general3label.getStyleClass().add("general3label") ;
        general1icon.getStyleClass().add("general1icon") ;
        general2icon.getStyleClass().add("general2icon") ;
        general3icon.getStyleClass().add("general3icon") ;


        Scene factorscene = new Scene(factorstackpane , 1200 , 700) ;
        factorscene.getStylesheets().add(getClass().getResource("FactorScene.css").toExternalForm()) ;

        MainStage.setScene(factorscene);
        MainStage.setTitle("Green");







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
                factorstackpane.getChildren().remove(MenuRoot);
            }
        });



        menubutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                factorstackpane.getChildren().add(MenuRoot);
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



        factorstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = MainStage.getX() - event.getScreenX();
                yOffset = MainStage.getY() - event.getScreenY();
            }
        });

        factorstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
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


            moreScene.start(MainStage) ;




        });





        // SEARCHRESULTS TABLE COLUMNS AND PREFRENCES FOR FACTOR MAKING !!!!!!!!!!!*************!!!!!!!!!!!!!!!!!!!******************!!!!!!!!!!*********



        TableColumn<String , SearchResults> namecolumn = new TableColumn<>() ;
        TableColumn<String , SearchResults> pricecolumn = new TableColumn<>() ;
        TableColumn<String , SearchResults> buttoncolumn1 = new TableColumn<>() ;
        TableColumn<String , SearchResults> buttoncolumn2 = new TableColumn<>() ;
        TableColumn<String , SearchResults> buttoncolumn5 = new TableColumn<>() ;
        TableColumn<String , SearchResults> buttoncolumn3 = new TableColumn<>() ;
        TableColumn<String , SearchResults> buttoncolumn4 = new TableColumn<>() ;
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("ItemName"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<>("ItemPrice"));
        buttoncolumn1.setCellValueFactory(new PropertyValueFactory<>("MinisCountButton"));
        buttoncolumn2.setCellValueFactory(new PropertyValueFactory<>("NumInfoLabel1"));
        buttoncolumn5.setCellValueFactory(new PropertyValueFactory<>("NumInfoLabel2"));
        buttoncolumn3.setCellValueFactory(new PropertyValueFactory<>("PlusCountButton"));
        buttoncolumn4.setCellValueFactory(new PropertyValueFactory<>("AddCartButton"));
        namecolumn.setMinWidth(150);
        pricecolumn.setMinWidth(100);
        buttoncolumn1.setMaxWidth(50);
        buttoncolumn2.setMaxWidth(50);
        buttoncolumn3.setMaxWidth(50);
        buttoncolumn4.setMaxWidth(50);




        searchresults.getColumns().addAll(namecolumn , pricecolumn , buttoncolumn1 , buttoncolumn2 , buttoncolumn3 , buttoncolumn4 , buttoncolumn5) ;
        searchresults.setPlaceholder(new Label("No Items Added"));






        // CARTITEMS TABLE COLUMNS AND PREFRENCES FOR FACTOR MAKING !!!!!!!!!!!*************!!!!!!!!!!!!!!!!!!!******************!!!!!!!!!!*********




        TableColumn<String , CartItems> ItemRowColumn = new TableColumn<>() ;
        TableColumn<String , CartItems> PriceRowColumn = new TableColumn<>() ;
        TableColumn<String , CartItems> CountRowColumn = new TableColumn<>() ;




        ItemRowColumn.setCellValueFactory(new PropertyValueFactory<>("ItemName"));
        PriceRowColumn.setCellValueFactory(new PropertyValueFactory<>("ItemPrice"));
        CountRowColumn.setCellValueFactory(new PropertyValueFactory<>("ItemCount"));

        ItemRowColumn.setMinWidth(100);
        PriceRowColumn.setMinWidth(100);
        CountRowColumn.setMinWidth(100);


        cartitems.setPlaceholder(new Label("No Items Added To Cart !!!"));
        cartitems.getColumns().addAll(ItemRowColumn , PriceRowColumn , CountRowColumn) ;











        // CUSTOMERTABLE TABLE COLUMNS AND PREFRENCES FOR FACTOR MAKING !!!!!!!!!!!*************!!!!!!!!!!!!!!!!!!!******************!!!!!!!!!!*********





        TableColumn<String , SearchResults> customercolumn1 = new TableColumn<>("First") ;
        TableColumn<String , SearchResults> customercolumn2 = new TableColumn<>("Last") ;
        TableColumn<String , SearchResults> customercolumn3 = new TableColumn<>("Phone") ;
        TableColumn<String , SearchResults> customercolumn4 = new TableColumn<>("Adress") ;
        customercolumn1.setCellValueFactory(new PropertyValueFactory<>("First"));
        customercolumn2.setCellValueFactory(new PropertyValueFactory<>("Last"));
        customercolumn3.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        customercolumn4.setCellValueFactory(new PropertyValueFactory<>("Adress"));
        customercolumn1.setMinWidth(100);
        customercolumn2.setMinWidth(100);
        customercolumn3.setMinWidth(150);
        customercolumn4.setMinWidth(300);



        customertable.getColumns().addAll(customercolumn1 , customercolumn2 , customercolumn3 , customercolumn4) ;
        customertable.setPlaceholder(new Label("No Customers"));


































        // SCENES FOR FACTOR MAKING AND STUFFS!!!!!@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@############################################
        // MINI ONE
        // MINI ONE



        general1.setOnMouseClicked(new EventHandler<MouseEvent>() {

            private double xOffset = 0;
            private double yOffset = 0;



            @Override
            public void handle(MouseEvent event) {



                Image minibackground = new Image("com//cloudly//aestudios//Files//Background//minisbackground.png") ;
                Image mininav = new Image("com//cloudly//aestudios//Files//Background//ministopnavigation.png") ;
                Image exticon = new Image("com//cloudly//aestudios//Files//Background//exiticonminis.png") ;
                Image mnimzeicon = new Image("com//cloudly//aestudios//Files//Background//minisminimizeicon.png") ;
                Image loveicon = new Image("com//cloudly//aestudios//Files//Background//additemicon1.png") ;
                ImageView minibackgrounddisplay = new ImageView(minibackground) ;
                Button exitbuttonmini = new Button() ;
                Button minimizebuttonmini = new Button() ;
                exitbuttonmini.setGraphic(new ImageView(exticon));
                minimizebuttonmini.setGraphic(new ImageView(mnimzeicon));
                minibackgrounddisplay.setFitWidth(600);
                minibackgrounddisplay.setFitHeight(600);
                ImageView mininavdisplay = new ImageView(mininav) ;
                mininavdisplay.setFitWidth(600);
                mininavdisplay.setFitHeight(60);
                Label topiclabel = new Label("add item") ;
                Label txtlabel1 = new Label("Name: ") ;
                Label txtlabel2 = new Label("Price: ") ;
                TextField productname = new TextField() ;
                TextField productprice = new TextField() ;
                productname.setPromptText("Name");
                productprice.setPromptText("Price");
                Button confirmbutton = new Button("Confirm") ;
                ImageView loveshow = new ImageView(loveicon) ;
                loveshow.setFitWidth(200);
                loveshow.setFitHeight(200);
                Label errLbl = new Label("Complete the Form !!!") ;





                StackPane additemstackpane = new StackPane() ;
                additemstackpane.getChildren().addAll(minibackgrounddisplay , mininavdisplay , exitbuttonmini , minimizebuttonmini , topiclabel , productname , productprice , txtlabel1 , txtlabel2 , confirmbutton , loveshow) ;




                minibackgrounddisplay.getStyleClass().add("minibackgrounddisplay") ;
                mininavdisplay.getStyleClass().add("mininavdisplay") ;
                exitbuttonmini.getStyleClass().add("exitbuttonmini") ;
                minimizebuttonmini.getStyleClass().add("minimizebuttonmini") ;
                topiclabel.getStyleClass().add("topiclabel") ;
                productname.getStyleClass().add("productname") ;
                productprice.getStyleClass().add("productprice") ;
                txtlabel1.getStyleClass().add("txtlabel1") ;
                txtlabel2.getStyleClass().add("txtlabel2") ;
                confirmbutton.getStyleClass().add("confirmbutton") ;
                loveshow.getStyleClass().add("loveshow") ;
                errLbl.getStyleClass().add("errLbl") ;





                Scene additemscene = new Scene(additemstackpane , 600 , 600) ;
                additemscene.getStylesheets().add(getClass().getResource("FactorScene.css").toExternalForm()) ;


                Stage additemstage = new Stage() ;
                additemstage.setScene(additemscene);
                additemstage.setTitle("New Item");
                additemstage.initStyle(StageStyle.UNDECORATED);
                additemstage.show();




                
                // ADD ITEM EVENT HANDELERS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!**************************************************




                    confirmbutton.setOnAction(e -> {


                        additemname = productname.getText().toString();
                        additemprice = dollarsign + productprice.getText().toString();


                        searchresults.getItems().addAll(new SearchResults(additemname, additemprice));


                        itemcounter++;


                        additemstage.close();


                    });














                // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



                exitbuttonmini.setOnAction(e -> { additemstage.close(); });
                minimizebuttonmini.setOnAction(e -> additemstage.setIconified(true));








                // MAKES DRAGGING BRO !!!!!!!!!!!



                additemstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        xOffset = additemstage.getX() - event.getScreenX();
                        yOffset = additemstage.getY() - event.getScreenY();
                    }
                });

                additemstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        additemstage.setX(event.getScreenX() + xOffset);
                        additemstage.setY(event.getScreenY() + yOffset);
                    }
                });




            }
        });













        // SCENES FOR FACTOR MAKING AND STUFFS!!!!!@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@############################################
        // MINI TWO
        //MINI TWO



        general2.setOnMousePressed(new EventHandler<MouseEvent>() {

            private double xOffset = 0;
            private double yOffset = 0;

            @Override
            public void handle(MouseEvent event) {





                Image minibackground = new Image("com//cloudly//aestudios//Files//Background//minisbackground.png") ;
                Image mininav = new Image("com//cloudly//aestudios//Files//Background//ministopnavigation.png") ;
                ImageView backgroundshow = new ImageView(minibackground) ;
                ImageView navbarshow = new ImageView(mininav) ;
                backgroundshow.setFitWidth(600);
                backgroundshow.setFitHeight(600);
                navbarshow.setFitWidth(600);
                navbarshow.setFitHeight(60);
                Image exticon = new Image("com//cloudly//aestudios//Files//Background//exiticonminis.png") ;
                Image mnimzeicon = new Image("com//cloudly//aestudios//Files//Background//minisminimizeicon.png") ;
                Button exitbutton = new Button() ;
                Button minimizebutton = new Button() ;
                exitbutton.setGraphic(new ImageView(exticon));
                minimizebutton.setGraphic(new ImageView(mnimzeicon));
                Label topiclabel = new Label("Make Factor") ;
                TextField searchbar = new TextField() ;
                searchbar.setPromptText("Search");
                Button printbutton = new Button() ;
                Button confirmbutton2 = new Button("Confirm") ;
                Image printicon = new Image("com//cloudly//aestudios//Files//Background//printer.png") ;
                printbutton.setGraphic(new ImageView(printicon));




























                StackPane makefactorstackpane = new StackPane() ;
                makefactorstackpane.getChildren().addAll(backgroundshow , navbarshow , exitbutton , minimizebutton , topiclabel , searchbar , cartitems , printbutton , confirmbutton2) ;




                backgroundshow.getStyleClass().add("minibackgrounddisplay") ;
                navbarshow.getStyleClass().add("mininavdisplay") ;
                exitbutton.getStyleClass().add("exitbuttonmini") ;
                minimizebutton.getStyleClass().add("minimizebuttonmini") ;
                topiclabel.getStyleClass().add("topiclabel2") ;
                searchbar.getStyleClass().add("searchbar") ;
                confirmbutton2.getStyleClass().add("confirmbutton2") ;
                searchresults.getStyleClass().add("searchresults") ;
                cartitems.getStyleClass().add("cartitems") ;
                printbutton.getStyleClass().add("printbutton") ;



                Scene makefactorscene = new Scene(makefactorstackpane , 600 , 600) ;
                makefactorscene.getStylesheets().add(getClass().getResource("FactorScene.css").toExternalForm()) ;


                Stage makefactorstage = new Stage() ;
                makefactorstage.setScene(makefactorscene);
                makefactorstage.initStyle(StageStyle.UNDECORATED);
                makefactorstage.setTitle("Make Factor");
                makefactorstage.show();























                // PRINT HANDELER HEREEEEEEEEEEEEEEE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!




                        printbutton.setOnAction(e -> {

                            

                            PrinterJob printerJob = PrinterJob.createPrinterJob();
                            if(printerJob.showPrintDialog(MainStage.getOwner()) && printerJob.printPage(cartitems))




                            printerJob.endJob();




                        });



                        confirmbutton2.setOnAction(e -> {


                            ObservableList<String> fakeOb = FXCollections.observableArrayList() ;
                            cartitems.setItems(fakeOb);
                            makefactorstage.close();
                            factorcounter ++ ;


                        });


                        cartitems.getStyleClass().add("cartitems") ;



















                // SEARCHBAR DESIGN

                searchbar.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {


                        searchbar.setStyle("-fx-background-radius: 0px 0px 0px 0px") ;
                        makefactorstackpane.getChildren().add(searchresults) ;


                    }
                });

                backgroundshow.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {


                        makefactorstackpane.getChildren().remove(searchresults);
                        searchbar.setStyle("-fx-background-radius: 5px 5px 5px 5px") ;


                    }
                });







                // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



                exitbutton.setOnAction(e -> { makefactorstage.close(); });
                minimizebutton.setOnAction(e -> makefactorstage.setIconified(true));










                // MAKES DRAGGING BRO !!!!!!!!!!!



                makefactorstackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        xOffset = makefactorstage.getX() - event.getScreenX();
                        yOffset = makefactorstage.getY() - event.getScreenY();
                    }
                });

                makefactorstackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        makefactorstage.setX(event.getScreenX() + xOffset);
                        makefactorstage.setY(event.getScreenY() + yOffset);
                    }
                });






            }
        });











        // SCENES FOR FACTOR MAKING AND STUFFS!!!!!@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@############################################
        // MINI THREE
        //MINI THREE





        general3.setOnMousePressed(new EventHandler<MouseEvent>() {

            private double xOffset = 0 ;
            private double yOffset = 0 ;
            String fname , lname , phone , adress ;

            @Override
            public void handle(MouseEvent event) {




                Image minibackground = new Image("com//cloudly//aestudios//Files//Background//minisbackground.png") ;
                Image mininav = new Image("com//cloudly//aestudios//Files//Background//ministopnavigation.png") ;
                ImageView backgroundshow = new ImageView(minibackground) ;
                ImageView navbarshow = new ImageView(mininav) ;
                backgroundshow.setFitWidth(800);
                backgroundshow.setFitHeight(600);
                navbarshow.setFitWidth(800);
                navbarshow.setFitHeight(60);
                Image exticon = new Image("com//cloudly//aestudios//Files//Background//exiticonminis.png") ;
                Image mnimzeicon = new Image("com//cloudly//aestudios//Files//Background//minisminimizeicon.png") ;
                Button exitbutton = new Button() ;
                Button minimizebutton = new Button() ;
                exitbutton.setGraphic(new ImageView(exticon));
                minimizebutton.setGraphic(new ImageView(mnimzeicon));
                Label topiclabel = new Label("Clients Form") ;
                Label infolabel = new Label("New Customer") ;
                Label deslabel1 = new Label("FirstName:") ;
                Label deslabel2 = new Label("LastName:") ;
                Label deslabel3 = new Label("Phone:") ;
                Label deslabel4 = new Label("Adress:") ;
                TextField customerfname = new TextField() ;
                TextField customerlname = new TextField() ;
                TextField customerphone = new TextField() ;
                TextField customeradress = new TextField() ;
                Button donebutton = new Button("Confirm") ;
                customerfname.setPromptText("FirstName");
                customerlname.setPromptText("LastName");
                customerphone.setPromptText("Phone");
                customeradress.setPromptText("Adress");







                StackPane ministackpane = new StackPane() ;
                ministackpane.getChildren().addAll(backgroundshow , navbarshow , exitbutton , minimizebutton , topiclabel , infolabel , customerfname , customerlname , customerphone , customeradress , donebutton , deslabel1 , deslabel2 , deslabel3 , deslabel4 , customertable) ;



                backgroundshow.getStyleClass().add("minibackgrounddisplay2") ;
                navbarshow.getStyleClass().add("mininavdisplay2") ;
                exitbutton.getStyleClass().add("exitbuttonmini2") ;
                minimizebutton.getStyleClass().add("minimizebuttonmini2") ;
                topiclabel.getStyleClass().add("topiclabel2") ;
                infolabel.getStyleClass().add("infolabel") ;
                customerfname.getStyleClass().add("customerfname") ;
                customerlname.getStyleClass().add("customerlname") ;
                customerphone.getStyleClass().add("customerphone") ;
                customeradress.getStyleClass().add("customeradress") ;
                donebutton.getStyleClass().add("donebutton") ;
                deslabel1.getStyleClass().add("deslabel1") ;
                deslabel2.getStyleClass().add("deslabel2") ;
                deslabel3.getStyleClass().add("deslabel3") ;
                deslabel4.getStyleClass().add("deslabel4") ;
                customertable.getStyleClass().add("customertable") ;




                Scene myscene = new Scene(ministackpane , 800 , 600) ;
                myscene.getStylesheets().add(getClass().getResource("FactorScene.css").toExternalForm()) ;


                Stage ministage = new Stage() ;
                ministage.setScene(myscene);
                ministage.initStyle(StageStyle.UNDECORATED);
                ministage.setTitle("Customers");
                ministage.show();









                // EVENT  HANDELERS HEREEEEEEEEEEEEEEEEEE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11




                donebutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {





                        fname = customerfname.getText().toString() ;
                        lname = customerlname.getText().toString() ;
                        phone = customerphone.getText().toString() ;
                        adress = customeradress.getText().toString() ;




                        customertable.getItems().add(new CustomerTable(fname , lname , phone , adress)) ;



                        customerfname.setText(null);
                        customerlname.setText(null);
                        customerphone.setText(null);
                        customeradress.setText(null);

                        customercounter ++ ;

                    }
                });





                // EXIT &&& MINIMIZE BUTTONS HANDELER !!!!!!!!!!!



                exitbutton.setOnAction(e -> { ministage.close(); });
                minimizebutton.setOnAction(e -> ministage.setIconified(true));










                // MAKES DRAGGING BRO !!!!!!!!!!!



                ministackpane.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        xOffset = ministage.getX() - event.getScreenX();
                        yOffset = ministage.getY() - event.getScreenY();
                    }
                });

                ministackpane.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        ministage.setX(event.getScreenX() + xOffset);
                        ministage.setY(event.getScreenY() + yOffset);
                    }
                });







            }
        });





    }




























    public class SearchResults {



        public String ItemName = null ;
        public String ItemPrice = null ;
        public Button AddCartButton , PlusCountButton , MinisCountButton;
        public Label NumInfoLabel1 ;


        public int addone = 1 ;

        public SearchResults() {}


        public SearchResults(String ItemName, String ItemPrice) {

            this.ItemName = ItemName;
            this.ItemPrice = ItemPrice;
            this.AddCartButton = new Button() ;
            this.PlusCountButton = new Button() ;
            this.MinisCountButton = new Button() ;
            this.NumInfoLabel1 = new Label("" + addone) ;





            // TABLEVIEW BUTTONS STYLING &&& STYLE CLASSES

            AddCartButton.getStyleClass().add("AddCartButton") ;
            PlusCountButton.getStyleClass().add("PlusCountButton") ;
            MinisCountButton.getStyleClass().add("MinisCountButton") ;
            NumInfoLabel1.getStyleClass().add("NumInfoLabel1") ;


            Image addicon = new Image("com//cloudly/aestudios//Files//Background//additem.png") ;
            Image rightarrow = new Image("com//cloudly//aestudios//Files//Background//rightarrow.png") ;
            Image leftarrow = new Image("com//cloudly//aestudios//Files//Background//leftarrow.png") ;


            ImageView addview = new ImageView(addicon) ;
            ImageView rightview = new ImageView(rightarrow) ;
            ImageView leftview = new ImageView(leftarrow) ;


            addview.setFitWidth(15);
            addview.setFitHeight(15);
            rightview.setFitWidth(15);
            rightview.setFitHeight(15);
            leftview.setFitWidth(15);
            leftview.setFitHeight(15);

            AddCartButton.setGraphic(addview);
            PlusCountButton.setGraphic(rightview);
            MinisCountButton.setGraphic(leftview);







            // TABLEVIEW BUTTONS EVENT HANDELERS ********************************************************************************************




            PlusCountButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {


                    addone = addone + 1 ;
                    NumInfoLabel1.setText("" + addone);




                }
            });




            MinisCountButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    addone = addone - 1 ;


                    NumInfoLabel1.setText("" + addone);




                }
            });





            AddCartButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {


                    SearchResults searchResults = new SearchResults() ;


                    SearchResults selectedItem = (SearchResults) searchresults.getSelectionModel().getSelectedItem();
                    SearchResults selectedPrice = (SearchResults) searchresults.getSelectionModel().getSelectedItem();








                    itemshow = new Label() ;
                    priceshow = new Label() ;
                    countshow = new TextField() ;




                    itemshow.setText(selectedItem.getItemName()) ;
                    priceshow.setText(selectedPrice.getItemPrice()) ;
                    countshow.setText("" + addone) ;


                    // add selected item to target table
                    cartitems.getItems().addAll(new CartItems(itemshow , priceshow , countshow)) ;


                    countshow.getStyleClass().add("countshow") ;




                    addone = 1 ;

                    NumInfoLabel1.setText("" + addone);





                        }
                    });





















        }




        // ITEMNAME COLUMN ITEMS ADDING !!!!!!!!!


        public void setItemName(String ItemName) {

            this.ItemName = ItemName;

        }




        public String getItemName() {

            return ItemName;

        }



        // ITEMPRICE COLUMN ITEMS ADDING !!!!!!!!!



        public void setItemPrice(String ItemPrice) {

            this.ItemPrice = ItemPrice;

        }


        public String getItemPrice() {

            return ItemPrice;

        }




        // AddCartButton COLUMN ITEMS ADDING !!!!!!!!!



        public void setAddCartButton(Button AddCartButton) {

            this.AddCartButton = AddCartButton ;

        }

        public Button getAddCartButton() {

            return AddCartButton ;

        }


        // PlusCountButton COLUMN ITEMS ADDING !!!!!!!!!



        public void setPlusCountButton(Button PlusCountButton) {

            this.PlusCountButton = PlusCountButton ;

        }

        public Button getPlusCountButton() {

            return PlusCountButton ;

        }



        //  MinisCountButton COLUMN ITEMS ADDING !!!!!!!!!



        public void setMinisCountButton(Button MinisCountButton) {

            this.MinisCountButton = MinisCountButton ;

        }

        public Button getMinisCountButton() {

            return MinisCountButton ;

        }



        // NumInfoLabel1 COLUMN ITEMS ADDING !!!!!!!!!



        public void setNumInfoLabel1(Label NumInfoLabel1) {

            this.NumInfoLabel1 = NumInfoLabel1 ;

        }

        public Label getNumInfoLabel1() {

            return NumInfoLabel1 ;

        }









    }


}

