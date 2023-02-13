package com.example.systemproject;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    //a method for Action of Submit Button for Inserting a new record
    public void handleSubmitButton() {

        try {
            int clientId = Integer.parseInt(view.clientId_tf.getText());
            view.getClient().setClient_id(clientId);
            view.getClient().setClient_id(clientId);
        } catch (NumberFormatException ex) {
            view.clientId_tf.setStyle("-fx-border-color: red;");
        }

        String clientName = view.client_name_tf.getText();
        view.getClient().setClient_name(clientName);

        if (clientName.isEmpty()) {
            view.client_name_tf.setStyle("-fx-border-color: red;");
        }

        String companyName = view.company_name_tf.getText();
        view.getClient().setCompany_name(companyName);


        String tel = view.tel_tf.getText();
        view.getClient().setTel(tel);


        String email = view.email_tf.getText();
        view.getClient().setEmail(email);
        if (email.isEmpty()) {
            view.email_tf.setStyle("-fx-border-color: red;");
        }

        try {
            int bookingNumber = Integer.parseInt(view.bookingNumber_tf.getText());
            view.getLoadingReport().setBookingNumber(bookingNumber);
        } catch (NumberFormatException ex) {
            view.bookingNumber_tf.setStyle("-fx-border-color: red;");
        }


        String bookingDate = view.bookingDate_tf.getText();
        view.getLoadingReport().setBookingDate(bookingDate);
        if (bookingDate.isEmpty()) {
            view.bookingDate_tf.setStyle("-fx-border-color: red;");
        }


        String originCountry = view.originCountry_tf.getText();
        view.getLoadingReport().setOriginCountry(originCountry);


        String shippingLine = view.shippingLine_tf.getText();
        view.getLoadingReport().setShippingLine(shippingLine);


        String terminal = view.terminal_tf.getText();
        view.getLoadingReport().setTerminal(terminal);


        String destinationCountry = view.destinationCountry_tf.getText();
        view.getLoadingReport().setDestinationCountry(destinationCountry);


        try {
            int containerNumber = Integer.parseInt(view.containerNumber_tf.getText());
            view.getLoadingReport().setContainerNumber(containerNumber);
        } catch (NumberFormatException ex) {
            view.containerNumber_tf.setStyle("-fx-border-color: red;");
        }


        String sealNumber = view.sealNumber_tf.getText();
        view.getLoadingReport().setSealNumber(sealNumber);


        try {
        int containerSize = Integer.parseInt(view.containerSize_tf.getText());
        view.getLoadingReport().setContainerSize(containerSize);
        } catch (NumberFormatException ex) {
            view.containerSize_tf.setStyle("-fx-border-color: red;");
        }


        try {
        int containerWeight = Integer.parseInt(view.containerWeight_tf.getText());
        view.getLoadingReport().setContainerWeight(containerWeight);
        } catch (NumberFormatException ex) {
            view.containerWeight_tf.setStyle("-fx-border-color: red;");
        }


        String shipNumber = view.shipNumber_tf.getText();
        view.getLoadingReport().setShipNumber(shipNumber);


        String vesselName = view.vesselName_tf.getText();
        view.getLoadingReport().setVesselName(vesselName);
        System.out.println(vesselName);


        view.getLoadingReport().setLoadingDate(view.loadingDate_tf.getText());
        if(view.getLoadingReport().getLoadingDate().isEmpty()){
            view.loadingDate_tf.setStyle("-fx-border-color: red;");
        }

        try{
            view.getLoadingReport().setNumberOfCars(Integer.parseInt(view.numberOfCars_tf.getText()));
        }
        catch (NumberFormatException ex){
            view.numberOfCars_tf.setStyle("-fx-border-color: red;");
        }
        System.out.println(view.numberOfCars_tf.getText());


        if(Integer.parseInt(view.numberOfCars_tf.getText())>=1 && Integer.parseInt(view.numberOfCars_tf.getText())<=4) {
            view.getCar1().setCar_information(view.car_information1_tf.getText());
            view.getLoadingReport().setVin_number1(view.car_information1_tf.getText());


            view.car1.setVin_number(view.vin_number1_tf.getText());
            view.loadingReport.setVin_number1(view.vin_number1_tf.getText());
            if (view.getCar1().getVin_number().isEmpty()) {
                view.vin_number1_tf.setStyle("-fx-border-color: red;");
            }

            view.getCar1().setCar_model(view.car_model1_tf.getText());

            view.getCar1().setCar_color(view.car_color1_tf.getText());

            try {
                view.getCar1().setCar_year(Integer.parseInt(view.car_year1_tf.getText()));
            }catch (NumberFormatException ex){
                    view.car_year1_tf.setStyle("-fx-border-color: red;");
                }

            try{
            view.getCar1().setCar_weight(Integer.parseInt(view.car_weight1_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_weight1_tf.setStyle("-fx-border-color: red;");
            }
            try{
            view.getCar1().setCar_price(Integer.parseInt(view.car_price1_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_price1_tf.setStyle("-fx-border-color: red;");
            }
        }

        if(Integer.parseInt(view.numberOfCars_tf.getText())>=2 && Integer.parseInt(view.numberOfCars_tf.getText())<=4) {
            view.getCar2().setCar_information(view.car_information2_tf.getText());
            view.getLoadingReport().setVin_number2(view.car_information2_tf.getText());

            view.getCar2().setVin_number(view.vin_number2_tf.getText());
            view.loadingReport.setVin_number2(view.vin_number1_tf.getText());
            if (view.car2.getVin_number().isEmpty()) {
                view.vin_number2_tf.setStyle("-fx-border-color: red;");
            }

            view.getCar2().setCar_model(view.car_model2_tf.getText());

            view.getCar2().setCar_color(view.car_color2_tf.getText());

            try {
                view.getCar2().setCar_year(Integer.parseInt(view.car_year2_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_year2_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar2().setCar_weight(Integer.parseInt(view.car_weight2_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_weight2_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar2().setCar_price(Integer.parseInt(view.car_price2_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_price2_tf.setStyle("-fx-border-color: red;");
            }
        }


        if(Integer.parseInt(view.numberOfCars_tf.getText())>=3 && Integer.parseInt(view.numberOfCars_tf.getText())<=4) {
            view.getCar3().setCar_information(view.car_information3_tf.getText());
            view.getLoadingReport().setVin_number3(view.car_information3_tf.getText());

            view.getCar3().setVin_number(view.vin_number3_tf.getText());
            view.loadingReport.setVin_number3(view.vin_number1_tf.getText());
            if (view.getCar3().getVin_number().isEmpty()) {
                view.vin_number3_tf.setStyle("-fx-border-color: red;");
            }

            view.getCar3().setCar_model(view.car_model3_tf.getText());

            view.getCar3().setCar_color(view.car_color3_tf.getText());

            try {
                view.getCar3().setCar_year(Integer.parseInt(view.car_year3_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_year3_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar3().setCar_weight(Integer.parseInt(view.car_weight3_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_weight3_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar3().setCar_price(Integer.parseInt(view.car_price3_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_price3_tf.setStyle("-fx-border-color: red;");
            }
        }


        if(Integer.parseInt(view.numberOfCars_tf.getText())>=4 && Integer.parseInt(view.numberOfCars_tf.getText())<=4) {
            view.getCar4().setCar_information(view.car_information4_tf.getText());
            view.getLoadingReport().setVin_number4(view.car_information4_tf.getText());

            view.getCar4().setVin_number(view.vin_number4_tf.getText());
            view.loadingReport.setVin_number4(view.vin_number1_tf.getText());
            if (view.getCar4().getVin_number().isEmpty()) {
                view.vin_number4_tf.setStyle("-fx-border-color: red;");
            }

            view.getCar4().setCar_model(view.car_model4_tf.getText());

            view.getCar4().setCar_color(view.car_color4_tf.getText());

            try {
                view.getCar4().setCar_year(Integer.parseInt(view.car_year4_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_year4_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar4().setCar_weight(Integer.parseInt(view.car_weight4_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_weight4_tf.setStyle("-fx-border-color: red;");
            }
            try{
                view.getCar4().setCar_price(Integer.parseInt(view.car_price4_tf.getText()));
            }catch (NumberFormatException ex){
                view.car_price4_tf.setStyle("-fx-border-color: red;");
            }
        }

            ConnectToDB connectToDB = new ConnectToDB();
            connectToDB.insertRecord(view.getClient(),view.getLoadingReport(),view.getCar1(),view.getCar2(), view.getCar3(),view.getCar4());
        }

    public void handleclientsBT() {
        ConnectToDB connectToDB = new ConnectToDB();
        view.allClients=connectToDB.selectclient();
        view.create_table_client();
    }

    public void handleloadingBT() {
        ConnectToDB connectToDB = new ConnectToDB();
        view.allLoading=connectToDB.selectLoading();
        view.create_table_loading();
    }

    public void handlecarsBT() {
        ConnectToDB connectToDB = new ConnectToDB();
        view.allCars=connectToDB.selectCars();
        view.create_table_car();
    }

    public void handledeleteClient() {
        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.deleteClient(view.delete_client());
    }

    public void handledeleteLoading() {
        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.deleteLoading(view.delete_loading());
    }

    public void handledeleteCar() {
        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.deleteCar(view.delete_car());
    }

    public void handleeditClient() {
        ConnectToDB connectToDB = new ConnectToDB();

        int client_edit_ID=0;
        try{
            client_edit_ID = Integer.parseInt(view.client_edit_tf.getText());
        }
        catch (NumberFormatException ex){
            view.client_edit_tf.setStyle("-fx-border-color: red;");
        }

        connectToDB.editclient(client_edit_ID, view.client_set_tf.getText(), view.client_field_tf.getText());
    }

    public void handleeditLOading() {
        ConnectToDB connectToDB = new ConnectToDB();

        int bookingNumber_edit=0;
        try{
            bookingNumber_edit = Integer.parseInt(view.loading_edit_tf.getText());
        }
        catch (NumberFormatException ex){
            view.loading_edit_tf.setStyle("-fx-border-color: red;");
        }

        connectToDB.editloading(bookingNumber_edit, view.loading_set_tf.getText(), view.loading_field_tf.getText());
    }

    public void handleeditCar() {
        ConnectToDB connectToDB = new ConnectToDB();

        String car_edit_VIN = view.car_edit_tf.getText();
        if(car_edit_VIN.isEmpty()){
            view.car_edit_tf.setStyle("-fx-border-color: red;");
        }

        connectToDB.editcar(car_edit_VIN, view.car_set_tf.getText(), view.car_field_tf.getText());
    }

}
