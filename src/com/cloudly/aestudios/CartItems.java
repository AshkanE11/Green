package com.cloudly.aestudios;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CartItems {




    public Label ItemName , ItemPrice ;
    public TextField ItemCount ;
    public Object rightbutton , leftbutton ;





    public CartItems(){}


    public CartItems(Label ItemName , Label ItemPrice , TextField ItemCount) {



        this.ItemName = ItemName ;
        this.ItemPrice = ItemPrice ;
        this.ItemCount = ItemCount ;





    }





    // ItemName


    public void setItemName(Label ItemName) {

        this.ItemName = ItemName;

    }




    public Label getItemName() {

        return ItemName;

    }



    // ItemPrice



    public void setItemPrice(Label ItemPrice) {

        this.ItemPrice = ItemPrice;

    }




    public Label getItemPrice() {

        return ItemPrice;

    }



    // ItemCount


    public void setItemCount(TextField ItemCount) {

        this.ItemCount = ItemCount;

    }




    public TextField getItemCount() {

        return ItemCount;

    }





}
