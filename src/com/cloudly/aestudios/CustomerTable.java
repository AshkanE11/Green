package com.cloudly.aestudios;

public class CustomerTable {


        public String fname , lname , phone , adress ;



        public CustomerTable(){}


        public CustomerTable(String fname , String lname , String phone , String adress) {



            this.fname = fname ;
            this.lname = lname ;
            this.phone = phone ;
            this.adress = adress ;



        }






        // FirstName ...


        public void setFirst(String fname) {

            this.fname = fname;

        }




        public String getFirst() {

            return fname;

        }



       // LastName ...


    public void setLast(String lname) {

        this.lname = lname;

    }




    public String getLast() {

        return lname;

    }



    // PhoneNumber ...


    public void setPhone(String phone) {

        this.phone = phone;

    }




    public String getPhone() {

        return phone;

    }



    // Adresses ...


    public void setAdress(String adress) {

        this.adress = adress;

    }




    public String getAdress() {

        return adress;

    }


    }


