package com.example.systemproject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class View extends Application {
    private Client client = new Client();
    LoadingReport loadingReport = new LoadingReport();
    CarInfo car1 = new CarInfo();
    CarInfo car2 = new CarInfo();
    CarInfo car3 = new CarInfo();
    CarInfo car4 = new CarInfo();
    int client_delete_ID;
    int loading_delete_number;
    String car_delete_VIN;
    int client_edit_ID;
    int loading_edit_number;
    String car_edit_VIN;
    ArrayList<Client> allClients = new ArrayList<Client>();
    ArrayList<LoadingReport> allLoading = new ArrayList<LoadingReport>();
    ArrayList<CarInfo> allCars = new ArrayList<CarInfo>();

    //text files of "insert" page
    TextField clientId_tf = new TextField();
    TextField client_name_tf = new TextField();
    TextField company_name_tf = new TextField();
    TextField tel_tf = new TextField();
    TextField email_tf = new TextField();
    TextField bookingNumber_tf = new TextField();
    TextField bookingDate_tf = new TextField();
    TextField originCountry_tf = new TextField();
    TextField shippingLine_tf = new TextField();
    TextField terminal_tf = new TextField();
    TextField destinationCountry_tf = new TextField();
    TextField containerNumber_tf = new TextField();
    TextField sealNumber_tf = new TextField();
    TextField containerSize_tf = new TextField();
    TextField containerWeight_tf = new TextField();
    TextField shipNumber_tf = new TextField();
    TextField vesselName_tf = new TextField();
    TextField loadingDate_tf = new TextField();
    TextField numberOfCars_tf = new TextField();
    TextField car_information1_tf = new TextField();
    TextField vin_number1_tf = new TextField();
    TextField car_model1_tf = new TextField();
    TextField car_color1_tf = new TextField();
    TextField car_year1_tf = new TextField();
    TextField car_weight1_tf = new TextField();
    TextField car_price1_tf = new TextField();
    TextField car_information2_tf = new TextField();
    TextField vin_number2_tf = new TextField();
    TextField car_model2_tf = new TextField();
    TextField car_color2_tf = new TextField();
    TextField car_year2_tf = new TextField();
    TextField car_weight2_tf = new TextField();
    TextField car_price2_tf = new TextField();
    TextField car_information3_tf = new TextField();
    TextField vin_number3_tf = new TextField();
    TextField car_model3_tf = new TextField();
    TextField car_color3_tf = new TextField();
    TextField car_year3_tf = new TextField();
    TextField car_weight3_tf = new TextField();
    TextField car_price3_tf = new TextField();
    TextField car_information4_tf = new TextField();
    TextField vin_number4_tf = new TextField();
    TextField car_model4_tf = new TextField();
    TextField car_color4_tf = new TextField();
    TextField car_year4_tf = new TextField();
    TextField car_weight4_tf = new TextField();
    TextField car_price4_tf = new TextField();
    Button next = new Button("Next");
    Button submit = new Button("Submit");
    //Buttons of Search page
    Button clientsBT= new Button("List of Clients");
    Button loadingBT= new Button("List of Loading Records");
    Button carsBT= new Button("List of Cars");
    Button back = new Button("Back");

    //Text files and Buttons of Delete Page
    TextField client_delete_tf = new TextField();
    TextField loading_delete_tf = new TextField();
    TextField car_delete_tf = new TextField();
    Button deleteClient = new Button("Delete");
    Button deleteLoading = new Button("Delete");
    Button deleteCar = new Button("Delete");


    //Text files and Buttons of Edit Page
    TextField client_edit_tf = new TextField();
    TextField loading_edit_tf = new TextField();
    TextField car_edit_tf = new TextField();
    MenuButton client_menu = new MenuButton("Client fields");
    MenuItem MenuItem_client_id = new MenuItem("client_id");
    MenuItem MenuItem_client_name = new MenuItem("client_name");
    MenuItem MenuItem_company_name = new MenuItem("company_name");
    MenuItem MenuItem_tel = new MenuItem("tel");
    MenuItem MenuItem_email = new MenuItem("email");
    MenuItem MenuItem_null1 = new MenuItem("null");
    MenuButton loading_menu = new MenuButton("Loading fields");
    MenuItem MenuItem_bookingNumber = new MenuItem("bookingNumber");
    MenuItem MenuItem_clientId = new MenuItem("clientId");
    MenuItem MenuItem_bookingDate = new MenuItem("bookingDate");
    MenuItem MenuItem_originCountry = new MenuItem("originCountry");
    MenuItem MenuItem_shippingLine = new MenuItem("shippingLine");
    MenuItem MenuItem_terminal = new MenuItem("terminal");
    MenuItem MenuItem_destinationCountry = new MenuItem("destinationCountry");
    MenuItem MenuItem_containerNumber = new MenuItem("containerNumber");
    MenuItem MenuItem_sealNumber = new MenuItem("sealNumber");
    MenuItem MenuItem_containerSize = new MenuItem("containerSize");
    MenuItem MenuItem_containerWeight = new MenuItem("containerWeight");
    MenuItem MenuItem_shipNumber = new MenuItem("shipNumber");
    MenuItem MenuItem_vesselName = new MenuItem("vesselName");
    MenuItem MenuItem_loadingDate = new MenuItem("loadingDate");
    MenuItem MenuItem_numberOfCars = new MenuItem("numberOfCars");
    MenuItem MenuItem_vin_number1 = new MenuItem("vin_number1");
    MenuItem MenuItem_vin_number2 = new MenuItem("vin_number2");
    MenuItem MenuItem_vin_number3 = new MenuItem("vin_number3");
    MenuItem MenuItem_vin_number4 = new MenuItem("vin_number4");
    MenuItem MenuItem_null2 = new MenuItem("null");
    MenuButton car_menu = new MenuButton("Car fields");
    MenuItem MenuItem_car_information = new MenuItem("car_information");
    MenuItem MenuItem_vin_number = new MenuItem("vin_number");
    MenuItem MenuItem_car_model = new MenuItem("car_model");
    MenuItem MenuItem_car_color = new MenuItem("car_color");
    MenuItem MenuItem_car_year = new MenuItem("car_year");
    MenuItem MenuItem_car_weight = new MenuItem("car_weight");
    MenuItem MenuItem_car_price = new MenuItem("car_price");
    MenuItem MenuItem_null3 = new MenuItem("null");

       public void creatMenuItem(){
           client_menu.getItems().add(MenuItem_client_id);
           client_menu.getItems().add(MenuItem_client_name);
           client_menu.getItems().add(MenuItem_company_name);
           client_menu.getItems().add(MenuItem_tel);
           client_menu.getItems().add(MenuItem_email);
           client_menu.getItems().add(MenuItem_null1);
           loading_menu.getItems().add(MenuItem_bookingNumber);
           loading_menu.getItems().add(MenuItem_clientId);
           loading_menu.getItems().add(MenuItem_bookingDate);
           loading_menu.getItems().add(MenuItem_originCountry);
           loading_menu.getItems().add(MenuItem_shippingLine);
           loading_menu.getItems().add(MenuItem_terminal);
           loading_menu.getItems().add(MenuItem_destinationCountry);
           loading_menu.getItems().add(MenuItem_containerNumber);
           loading_menu.getItems().add(MenuItem_sealNumber);
           loading_menu.getItems().add(MenuItem_containerSize);
           loading_menu.getItems().add(MenuItem_containerWeight);
           loading_menu.getItems().add(MenuItem_shipNumber);
           loading_menu.getItems().add(MenuItem_vesselName);
           loading_menu.getItems().add(MenuItem_loadingDate);
           loading_menu.getItems().add(MenuItem_numberOfCars);
           loading_menu.getItems().add(MenuItem_vin_number1);
           loading_menu.getItems().add(MenuItem_vin_number2);
           loading_menu.getItems().add(MenuItem_vin_number3);
           loading_menu.getItems().add(MenuItem_vin_number4);
           loading_menu.getItems().add(MenuItem_null2);
           car_menu.getItems().add(MenuItem_car_information);
           car_menu.getItems().add(MenuItem_vin_number);
           car_menu.getItems().add(MenuItem_car_model);
           car_menu.getItems().add(MenuItem_car_color);
           car_menu.getItems().add(MenuItem_car_year);
           car_menu.getItems().add(MenuItem_car_weight);
           car_menu.getItems().add(MenuItem_car_price);
           car_menu.getItems().add(MenuItem_null3);
       }

       // these text fields save desired attributes to edit
    TextField client_set_tf = new TextField();
    TextField loading_set_tf = new TextField();
    TextField car_set_tf = new TextField();

    public void set_attribute_edit(){
        //Client
        //Action of MenuItem_client_id Button
        MenuItem_client_id.setOnAction(d->{
            client_set_tf.setText(MenuItem_client_id.getText());
        });
        //Action of MenuItem_client_name Button
        MenuItem_client_name.setOnAction(d->{
            client_set_tf.setText(MenuItem_client_name.getText());
        });
        //Action of MenuItem_company_name Button
        MenuItem_company_name.setOnAction(d->{
            client_set_tf.setText(MenuItem_company_name.getText());
        });
        //Action of MenuItem_tel Button
        MenuItem_tel.setOnAction(d->{
            client_set_tf.setText(MenuItem_tel.getText());
        });
        //Action of MenuItem_email Button
        MenuItem_email.setOnAction(d->{
            client_set_tf.setText(MenuItem_email.getText());
        });
        //Action of MenuItem_null1 Button
        MenuItem_null1.setOnAction(d->{
            client_set_tf.setText("");
        });
        //Action of MenuItem_bookingNumber Button
        MenuItem_bookingNumber.setOnAction(d->{
            loading_set_tf.setText(MenuItem_bookingNumber.getText());
        });
        //Action of MenuItem_clientId Button
        MenuItem_clientId.setOnAction(d->{
            loading_set_tf.setText(MenuItem_clientId.getText());
        });
        //loading
        //Action of MenuItem_bookingDate Button
        MenuItem_bookingDate.setOnAction(d->{
            loading_set_tf.setText(MenuItem_bookingDate.getText());
        });
        //Action of MenuItem_originCountry Button
        MenuItem_originCountry.setOnAction(d->{
            loading_set_tf.setText(MenuItem_originCountry.getText());
        });
        //Action of MenuItem_shippingLine Button
        MenuItem_shippingLine.setOnAction(d->{
            loading_set_tf.setText(MenuItem_shippingLine.getText());
        });
        //Action of MenuItem_terminal Button
        MenuItem_terminal.setOnAction(d->{
            loading_set_tf.setText(MenuItem_terminal.getText());
        });
        //Action of MenuItem_destinationCountry Button
        MenuItem_destinationCountry.setOnAction(d->{
            loading_set_tf.setText(MenuItem_destinationCountry.getText());
        });
        //Action of MenuItem_containerNumber Button
        MenuItem_containerNumber.setOnAction(d->{
            loading_set_tf.setText(MenuItem_containerNumber.getText());
        });
        //Action of MenuItem_sealNumber Button
        MenuItem_sealNumber.setOnAction(d->{
            loading_set_tf.setText(MenuItem_sealNumber.getText());
        });
        //Action of MenuItem_containerSize Button
        MenuItem_containerSize.setOnAction(d->{
            loading_set_tf.setText(MenuItem_containerSize.getText());
        });
        //Action of MenuItem_containerWeight Button
        MenuItem_containerWeight.setOnAction(d->{
            loading_set_tf.setText(MenuItem_containerWeight.getText());
        });
        //Action of MenuItem_shipNumber Button
        MenuItem_shipNumber.setOnAction(d->{
            loading_set_tf.setText(MenuItem_shipNumber.getText());
        });
        //Action of MenuItem_vesselName Button
        MenuItem_vesselName.setOnAction(d->{
            loading_set_tf.setText(MenuItem_vesselName.getText());
        });
        //Action of MenuItem_loadingDate Button
        MenuItem_loadingDate.setOnAction(d->{
            loading_set_tf.setText(MenuItem_loadingDate.getText());
        });
        //Action of MenuItem_numberOfCars Button
        MenuItem_numberOfCars.setOnAction(d->{
            loading_set_tf.setText(MenuItem_numberOfCars.getText());
        });
        //Action of MenuItem_vin_number1 Button
        MenuItem_vin_number1.setOnAction(d->{
            loading_set_tf.setText(MenuItem_vin_number1.getText());
        });
        //Action of MenuItem_vin_number2 Button
        MenuItem_vin_number2.setOnAction(d->{
            loading_set_tf.setText(MenuItem_vin_number2.getText());
        });
        //Action of MenuItem_vin_number3 Button
        MenuItem_vin_number3.setOnAction(d->{
            loading_set_tf.setText(MenuItem_vin_number3.getText());
        });
        //Action of MenuItem_vin_number4 Button
        MenuItem_vin_number4.setOnAction(d->{
            loading_set_tf.setText(MenuItem_vin_number4.getText());
        });
        //Action of MenuItem_null2 Button
        MenuItem_null2.setOnAction(d->{
            loading_set_tf.setText("");
        });

        //Car
        //Action of MenuItem_car_information Button
        MenuItem_car_information.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_information.getText());
        });
        //Action of MenuItem_vin_number Button
        MenuItem_vin_number.setOnAction(d->{
            car_set_tf.setText(MenuItem_vin_number.getText());
        });
        //Action of MenuItem_car_model Button
        MenuItem_car_model.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_model.getText());
        });
        //Action of MenuItem_car_color Button
        MenuItem_car_color.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_color.getText());
        });
        //Action of MenuItem_car_year Button
        MenuItem_car_year.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_year.getText());
        });
        //Action of MenuItem_car_weight Button
        MenuItem_car_weight.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_weight.getText());
        });
        //Action of MenuItem_car_price Button
        MenuItem_car_price.setOnAction(d->{
            car_set_tf.setText(MenuItem_car_price.getText());
        });
        //Action of MenuItem_null3 Button
        MenuItem_null3.setOnAction(d->{
            car_set_tf.setText("");
        });
    }

    // these text fields are for the new values to edit
    TextField client_field_tf = new TextField();
    TextField loading_field_tf = new TextField();
    TextField car_field_tf = new TextField();

    Button editClient = new Button("Edit");
    Button editLoading = new Button("Edit");
    Button editCar = new Button("Edit");


    public View() {
        Controller controller = new Controller(this);
        // set up the submit button to call handleSubmitButton method in the controller
        submit.setOnAction(event -> controller.handleSubmitButton());

        // handlers of actions of search buttons
        clientsBT.setOnAction(event -> controller.handleclientsBT());
        loadingBT.setOnAction(event -> controller.handleloadingBT());
        carsBT.setOnAction(event -> controller.handlecarsBT());

        // handlers of actions of delete buttons
        deleteClient.setOnAction(event -> controller.handledeleteClient());
        deleteLoading.setOnAction(event -> controller.handledeleteLoading());
        deleteCar.setOnAction(event -> controller.handledeleteCar());

        // 1-addinh items to menubutton, 2-set the items values to text fields, 3-handlers of actions of delete buttons
        creatMenuItem();
        set_attribute_edit();
        editClient.setOnAction(event -> controller.handleeditClient());
        editLoading.setOnAction(event -> controller.handleeditLOading());
        editCar.setOnAction(event -> controller.handleeditCar());
    }


    @Override
    public void start(Stage stage) throws IOException {

        //Buttons of main page
        Button insertBT= new Button("Insert a new record");
        Button searchBT= new Button("Search");
        Button deleteBT= new Button("Delete");
        Button editBT= new Button("Edit");

        //images of menu in right side of main page
        Image img1 = new Image("https://cdn3.iconfinder.com/data/icons/software-office-tools/33/create-512.png");
        ImageView view1 = new ImageView(img1);
        view1.setFitWidth(100); view1.setFitHeight(100);
        view1.setPreserveRatio(true);
        Image img4 = new Image("https://static.vecteezy.com/system/resources/previews/004/856/862/original/search-illustration-on-a-transparent-background-premium-quality-symbols-line-flat-color-icon-for-concept-and-graphic-design-vector.jpg");
        ImageView view4 = new ImageView(img4);
        view4.setFitWidth(100); view4.setFitHeight(100);
        view4.setPreserveRatio(true);
        Image img6 = new Image("https://cdn-icons-png.flaticon.com/512/3405/3405244.png");
        ImageView view6 = new ImageView(img6);
        view6.setFitWidth(100); view6.setFitHeight(100);
        view6.setPreserveRatio(true);
        Image img8 = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpAyw7TK8OpqoWdMpCRbRa-X2xmWAsx2AIEw&usqp=CAU");
        ImageView view8 = new ImageView(img8);
        view8.setFitWidth(100); view8.setFitHeight(100);
        view8.setPreserveRatio(true);

        //GridPane for menu in right side of main page
        GridPane gPane = new GridPane();
        gPane.setPadding(new Insets(10,10,10,10));
        gPane.setHgap(10);
        gPane.setVgap(10);
        gPane.setAlignment(Pos.CENTER_RIGHT);

        gPane.add(view1,0,0);
        gPane.add(view4,3,0);
        gPane.add(view6,0,2);
        gPane.add(view8,3,2);

        searchBT.setPrefWidth(100);
        gPane.add(insertBT,0,1);
        gPane.add(searchBT,3,1);
        gPane.add(deleteBT,0,3);
        gPane.add(editBT,3,3);

        //Image of main Page in left side
        Image imgMain = new Image("https://media.istockphoto.com/id/1263987339/photo/logistics-and-transportation-of-international-container-cargo-ship-at-port.jpg?s=612x612&w=0&k=20&c=QIxBjMytE_Be5PTVLzY1SFoQr4EA108pz5T88qNuqPQ=");
        ImageView viewMain = new ImageView(imgMain);
        viewMain.setFitWidth(300); viewMain.setFitHeight(200);
        viewMain.setPreserveRatio(true);

        // GridPane for main page(it includes main image in left side and menu in right side)
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(40);
        pane.setVgap(20);
        pane.add(viewMain,0,0);
        pane.add(gPane,1,0);

        //adding to scene and stage
        Scene scene = new Scene(pane,600, 350);
        stage.setTitle("Shipping Express");
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/3089/3089627.png"));
        stage.setScene(scene);
        stage.show();


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //selecting insertBT
        insertBT.setOnAction(e->{
            //create new stage for Inserting
            Stage stageInsert = new Stage();
            GridPane paneBig = new GridPane();
            GridPane paneInsert = new GridPane();

            //adding "insert" elements to pane
            Label labelclientId = new Label("client Id");
            Label labelclient_name = new Label("Client Name");
            Label labelcompany_name = new Label("Company Name");
            Label labeltel = new Label("Tel");
            Label labelemail = new Label("Email");
            Label labelbookingNumber = new Label("bookingNumber");
            Label labelbookingDate = new Label("bookingDate");
            Label labeloriginCountry = new Label("originCountry");
            Label labelshippingLine = new Label("shippingLine");
            Label labelterminal = new Label("terminal");
            Label labeldestinationCountry = new Label("destinationCountry");
            Label labelcontainerNumber = new Label("containerNumber");
            Label labelsealNumber = new Label("sealNumber");
            Label labelcontainerSize = new Label("containerSize");
            Label labelcontainerWeight = new Label("containerWeight");
            Label labelshipNumber = new Label("shipNumber");
            Label labelvesselName = new Label("vesselName");
            Label labelloadingDate = new Label("loadingDate");
            Label labelnumberOfCars = new Label("numberOfCars");
            Label labelcar_information1 = new Label("car_information1");
            Label labelvin_number1 = new Label("vin_number1");
            Label labelcar_model1 = new Label("car_model1");
            Label labelcar_color1 = new Label("car_color1");
            Label labelcar_year1 = new Label("car_year1");
            Label labelcar_weight1 = new Label("car_weight1");
            Label labelcar_price1 = new Label("car_price1");
            Label labelcar_information2 = new Label("car_information1");
            Label labelvin_number2 = new Label("vin_number1");
            Label labelcar_model2 = new Label("car_model1");
            Label labelcar_color2 = new Label("car_color1");
            Label labelcar_year2 = new Label("car_year1");
            Label labelcar_weight2 = new Label("car_weight1");
            Label labelcar_price2 = new Label("car_price1");
            Label labelcar_information3 = new Label("car_information1");
            Label labelvin_number3 = new Label("vin_number1");
            Label labelcar_model3 = new Label("car_model1");
            Label labelcar_color3 = new Label("car_color1");
            Label labelcar_year3 = new Label("car_year1");
            Label labelcar_weight3 = new Label("car_weight1");
            Label labelcar_price3 = new Label("car_price1");
            Label labelcar_information4 = new Label("car_information1");
            Label labelvin_number4 = new Label("vin_number1");
            Label labelcar_model4 = new Label("car_model1");
            Label labelcar_color4 = new Label("car_color1");
            Label labelcar_year4 = new Label("car_year1");
            Label labelcar_weight4 = new Label("car_weight1");
            Label labelcar_price4 = new Label("car_price1");

            paneInsert.setHgap(10);
            paneInsert.setVgap(10);
            paneInsert.add(labelclientId ,0,0);
            paneInsert.add(clientId_tf,1,0);
            paneInsert.add(labelclient_name ,2,0);
            paneInsert.add(client_name_tf ,3,0);
            paneInsert.add(labelcompany_name ,4,0);
            paneInsert.add(company_name_tf ,5,0);
            paneInsert.add(labeltel ,0,1);
            paneInsert.add(tel_tf ,1,1);
            paneInsert.add(labelemail ,2,1);
            paneInsert.add(email_tf ,3,1);
            paneInsert.add(labelbookingNumber ,4,1);
            paneInsert.add(bookingNumber_tf ,5,1);
            paneInsert.add(labelbookingDate ,0,2);
            paneInsert.add(bookingDate_tf ,1,2);
            paneInsert.add(labeloriginCountry ,2,2);
            paneInsert.add(originCountry_tf ,3,2);
            paneInsert.add(labelshippingLine ,4,2);
            paneInsert.add(shippingLine_tf,5,2);
            paneInsert.add(labelterminal ,0,3);
            paneInsert.add(terminal_tf ,1,3);
            paneInsert.add(labeldestinationCountry ,2,3);
            paneInsert.add(destinationCountry_tf ,3,3);
            paneInsert.add(labelcontainerNumber ,4,3);
            paneInsert.add(containerNumber_tf ,5,3);
            paneInsert.add(labelsealNumber ,0,4);
            paneInsert.add(sealNumber_tf,1,4);
            paneInsert.add(labelcontainerSize ,2,4);
            paneInsert.add(containerSize_tf ,3,4);
            paneInsert.add(labelcontainerWeight ,4,4);
            paneInsert.add(containerWeight_tf ,5,4);
            paneInsert.add(labelshipNumber ,0,5);
            paneInsert.add(shipNumber_tf ,1,5);
            paneInsert.add(labelvesselName ,2,5);
            paneInsert.add(vesselName_tf ,3,5);
            paneInsert.add(labelloadingDate ,4,5);
            paneInsert.add(loadingDate_tf,5,5);
            paneInsert.add(labelnumberOfCars ,2,6);
            paneInsert.add(numberOfCars_tf ,3,6);
            paneInsert.add(next ,4,6);
            next.setOnAction(j->{
            if(Integer.parseInt(numberOfCars_tf.getText())>=1 && Integer.parseInt(numberOfCars_tf.getText())<=4) {
                paneInsert.add(labelcar_information1 , 0, 7);
                paneInsert.add(car_information1_tf, 1, 7);
                paneInsert.add(labelvin_number1 , 2, 7);
                paneInsert.add(vin_number1_tf, 3, 7);
                paneInsert.add(labelcar_model1 , 4, 7);
                paneInsert.add(car_model1_tf, 5, 7);
                paneInsert.add(labelcar_color1 , 0, 8);
                paneInsert.add(car_color1_tf , 1, 8);
                paneInsert.add(labelcar_year1, 2, 8);
                paneInsert.add(car_year1_tf, 3, 8);
                paneInsert.add(labelcar_weight1, 4, 8);
                paneInsert.add(car_weight1_tf, 5, 8);
                paneInsert.add(labelcar_price1, 0, 9);
                paneInsert.add(car_price1_tf, 1, 9);
            }
            if(Integer.parseInt(numberOfCars_tf.getText())>=2 && Integer.parseInt(numberOfCars_tf.getText())<=4) {
                paneInsert.add(labelcar_information2 , 0, 10);
                paneInsert.add(car_information2_tf, 1, 10);
                paneInsert.add(labelvin_number2 , 2, 10);
                paneInsert.add(vin_number2_tf, 3, 10);
                paneInsert.add(labelcar_model2 , 4, 10);
                paneInsert.add(car_model2_tf, 5, 10);
                paneInsert.add(labelcar_color2 , 0, 11);
                paneInsert.add(car_color2_tf , 1, 11);
                paneInsert.add(labelcar_year2, 2, 11);
                paneInsert.add(car_year2_tf, 3, 11);
                paneInsert.add(labelcar_weight2, 4, 11);
                paneInsert.add(car_weight2_tf, 5, 11);
                paneInsert.add(labelcar_price2, 0, 12);
                paneInsert.add(car_price2_tf, 1, 12);
            }
            if(Integer.parseInt(numberOfCars_tf.getText())>=3 && Integer.parseInt(numberOfCars_tf.getText())<=4) {
                paneInsert.add(labelcar_information3 , 0, 13);
                paneInsert.add(car_information3_tf, 1, 13);
                paneInsert.add(labelvin_number3 , 2, 13);
                paneInsert.add(vin_number3_tf, 3, 13);
                paneInsert.add(labelcar_model3 , 4, 13);
                paneInsert.add(car_model3_tf, 5, 13);
                paneInsert.add(labelcar_color3 , 0, 14);
                paneInsert.add(car_color3_tf , 1, 14);
                paneInsert.add(labelcar_year3, 2, 14);
                paneInsert.add(car_year3_tf, 3, 14);
                paneInsert.add(labelcar_weight3, 4, 14);
                paneInsert.add(car_weight3_tf, 5, 14);
                paneInsert.add(labelcar_price3, 0, 15);
                paneInsert.add(car_price3_tf, 1, 15);
            }
            if(Integer.parseInt(numberOfCars_tf.getText())>=4 && Integer.parseInt(numberOfCars_tf.getText())<=4) {
                paneInsert.add(labelcar_information4 , 0, 16);
                paneInsert.add(car_information4_tf, 1, 16);
                paneInsert.add(labelvin_number4 , 2, 16);
                paneInsert.add(vin_number4_tf, 3, 16);
                paneInsert.add(labelcar_model4 , 4, 16);
                paneInsert.add(car_model4_tf, 5, 16);
                paneInsert.add(labelcar_color4 , 0, 17);
                paneInsert.add(car_color4_tf , 1, 17);
                paneInsert.add(labelcar_year4, 2, 17);
                paneInsert.add(car_year4_tf, 3, 17);
                paneInsert.add(labelcar_weight4, 4, 17);
                paneInsert.add(car_weight4_tf, 5, 17);
                paneInsert.add(labelcar_price4, 0, 18);
                paneInsert.add(car_price4_tf, 1, 18);
            }
            });

            paneInsert.setPadding(new Insets(10,10,10,10));
            paneInsert.setHgap(10);
            paneInsert.setVgap(10);
            paneInsert.setAlignment(Pos.CENTER);
            paneBig.setAlignment(Pos.CENTER);
            paneBig.add(paneInsert,0,0);
            paneBig.add(submit,0,1);

            Scene sceneInsert = new Scene(paneBig,1000, 500);
            stageInsert.setTitle("Insert a new record");
            stageInsert.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/3089/3089627.png"));
            stageInsert.setScene(sceneInsert);
            stageInsert.show();
        });


        //Action of Submit Button is in Controller Class//


//////////////////////////////////////////////////////////////////////////////////////////////////
        //selecting searchBT
        searchBT.setOnAction(e->{
            //cleaning the main pane
            gPane.getChildren().clear();
            Image img2 = new Image("https://png.pngtree.com/png-vector/20220518/ourlarge/pngtree-add-customers-icon-color-flat-png-image_4674922.png");
            ImageView view2 = new ImageView(img2);
            view2.setFitWidth(100); view2.setFitHeight(100);
            view2.setPreserveRatio(true);
            Image img3 = new Image("https://static.vecteezy.com/system/resources/previews/008/276/844/non_2x/intermodal-container-color-icon-shipping-container-on-crane-hook-freight-loading-isolated-illustration-vector.jpg");
            ImageView view3 = new ImageView(img3);
            view3.setFitWidth(100); view3.setFitHeight(100);
            view3.setPreserveRatio(true);
            Image img5 = new Image("data:image/png;base64,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");
            ImageView view5 = new ImageView(img5);
            view5.setFitWidth(100); view5.setFitHeight(100);
            view5.setPreserveRatio(true);

            gPane.setPadding(new Insets(10,10,10,10));
            gPane.setHgap(10);
            gPane.setVgap(10);
            gPane.setAlignment(Pos.CENTER_RIGHT);

            gPane.add(view2,0,0);
            gPane.add(view3,1,0);
            gPane.add(view5,2,0);

            clientsBT.setPrefWidth(100);
            loadingBT.setPrefWidth(100);
            carsBT.setPrefWidth(100);
            back.setPrefWidth(100);

            gPane.add(clientsBT,0,1);
            gPane.add(loadingBT,1,1);
            gPane.add(carsBT,2,1);
            gPane.add(back,0,7);

        });

        //Action of back button
        back.setOnAction(e->{
            //clear the main page
            gPane.getChildren().clear();
            //adding main page elements
            gPane.setAlignment(Pos.CENTER_RIGHT);

            gPane.add(view1,0,0);
            gPane.add(view4,3,0);
            gPane.add(view6,0,2);
            gPane.add(view8,3,2);

            searchBT.setPrefWidth(100);
            gPane.add(insertBT,0,1);
            gPane.add(searchBT,3,1);
            gPane.add(deleteBT,0,3);
            gPane.add(editBT,3,3);

        });

        //Action of Clients button(Create a table for clients) is in create_table_client method

        //Action of Loading Report button(Create a table for loading reports) is in create_table_loading method

        //Action of Cars button(Create a table for Cars) is in create_table_car method

        //Action of back button
        back.setOnAction(e->{
            //clear the main page
            gPane.getChildren().clear();
            //adding main page elements
            gPane.setAlignment(Pos.CENTER_RIGHT);

            gPane.add(view1,0,0);
            gPane.add(view4,3,0);
            gPane.add(view6,0,2);
            gPane.add(view8,3,2);

            searchBT.setPrefWidth(100);
            gPane.add(insertBT,0,1);
            gPane.add(searchBT,3,1);
            gPane.add(deleteBT,0,3);
            gPane.add(editBT,3,3);

        });


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //selecting deleteBT
        deleteBT.setOnAction(e->{
            //cleaning the main pane
            gPane.getChildren().clear();


            gPane.setPadding(new Insets(10,10,10,10));
            gPane.setHgap(10);
            gPane.setVgap(10);
            gPane.setAlignment(Pos.CENTER_RIGHT);

            Label label_client = new Label("Please enter Client ID");
            Label label_loading = new Label("Please enter Booking Number");
           Label label_car = new Label("Please enter Car VIN Number");

            gPane.add(label_client,0,0);
            gPane.add(client_delete_tf,1,0);
            gPane.add(deleteClient,2,0);
            gPane.add(label_loading,0,1);
            gPane.add(loading_delete_tf,1,1);
            gPane.add(deleteLoading,2,1);
            gPane.add(label_car,0,2);
            gPane.add(car_delete_tf,1,2);
            gPane.add(deleteCar,2,2);
            gPane.add(back,0,3);


        });

        //Action of back button
        back.setOnAction(e->{
            //clear the main page
            gPane.getChildren().clear();
            //adding main page elements
            gPane.setAlignment(Pos.CENTER_RIGHT);

            gPane.add(view1,0,0);
            gPane.add(view4,3,0);
            gPane.add(view6,0,2);
            gPane.add(view8,3,2);

            searchBT.setPrefWidth(100);
            gPane.add(insertBT,0,1);
            gPane.add(searchBT,3,1);
            gPane.add(deleteBT,0,3);
            gPane.add(editBT,3,3);
        });

            //Actions of Delete Buttons are in delete_car and delete_client and delete_loading methods


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //selecting editBT
        editBT.setOnAction(e->{
            //cleaning the main pane
            gPane.getChildren().clear();


            gPane.setPadding(new Insets(10,10,10,10));
            gPane.setHgap(10);
            gPane.setVgap(10);
            gPane.setAlignment(Pos.CENTER_RIGHT);

            Label label_client = new Label("Please enter Client ID");
            Label label_loading = new Label("Please enter Booking Number");
            Label label_car = new Label("Please enter Car VIN Number");

            Label label_client_new = new Label("Please enter new value:");
            Label label_loading_new = new Label("Please enter new value:");
            Label label_car_new = new Label("Please enter new value:");

            gPane.add(label_client,0,0);
            gPane.add(client_edit_tf,0,1);
            gPane.add(client_menu,0,2);
            gPane.add(client_set_tf,0,3);
            gPane.add(label_client_new,0,4);
            gPane.add(client_field_tf,0,5);
            gPane.add(editClient,0,6);
            gPane.add(back,0,7);

            gPane.add(label_loading,1,0);
            gPane.add(loading_edit_tf,1,1);
            gPane.add(loading_menu,1,2);
            gPane.add(loading_set_tf,1,3);
            gPane.add(label_loading_new,1,4);
            gPane.add(loading_field_tf,1,5);
            gPane.add(editLoading,1,6);

            gPane.add(label_car,2,0);
            gPane.add(car_edit_tf,2,1);
            gPane.add(car_menu,2,2);
            gPane.add(car_set_tf,2,3);
            gPane.add(label_car_new,2,4);
            gPane.add(car_field_tf,2,5);
            gPane.add(editCar,2,6);


        });

        //Action of back button
        back.setOnAction(e->{
            //clear the main page
            gPane.getChildren().clear();
            //adding main page elements
            gPane.setAlignment(Pos.CENTER_RIGHT);

            gPane.add(view1,0,0);
            gPane.add(view4,3,0);
            gPane.add(view6,0,2);
            gPane.add(view8,3,2);

            searchBT.setPrefWidth(100);
            gPane.add(insertBT,0,1);
            gPane.add(searchBT,3,1);
            gPane.add(deleteBT,0,3);
            gPane.add(editBT,3,3);
        });

        // actions of Client, Loading and Car MenuButtons are in set_attribute_edit method in top

        // actions of Edit buttons are in controller
    }


    //creating a table for clients and show list of clients in table
    public void create_table_client(){
        Stage stageClients = new Stage();

        TableView<Client> table = new TableView<>();

        TableColumn<Client, Integer> clientIDCol = new TableColumn<>("Client ID");
        clientIDCol.setMinWidth(100);
        clientIDCol.setCellValueFactory(new PropertyValueFactory<>("client_id"));

        TableColumn<Client, String> clientNameCol = new TableColumn<>("Client Name");
        clientNameCol.setMinWidth(100);
        clientNameCol.setCellValueFactory(new PropertyValueFactory<>("client_name"));

        TableColumn<Client, String> companyNameCol = new TableColumn<>("Company Name");
        companyNameCol.setMinWidth(100);
        companyNameCol.setCellValueFactory(new PropertyValueFactory<>("company_name"));

        TableColumn<Client, String> telCol = new TableColumn<>("Tell");
        telCol.setMinWidth(100);
        telCol.setCellValueFactory(new PropertyValueFactory<>("tel"));

        TableColumn<Client, String> emailCol = new TableColumn<>("Email");
        emailCol.setMinWidth(100);
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));


        table.getColumns().addAll(clientIDCol, clientNameCol,companyNameCol,telCol,emailCol);

        ObservableList<Client> data = FXCollections.observableArrayList(allClients);
        table.setItems(data);

        // Create text field for filtering
        FilteredList<Client> filteredData = new FilteredList<>(data);
        table.setItems(filteredData);

        // Create a text field to enter the filter value
        TextField filterField = new TextField();

        // Add a listener to the text field to update the filter predicate when the text changes
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(client1 -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();
                int intFilter=0;
                try{
                    intFilter = Integer.parseInt(newValue);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                if (client1.getClient_id()==intFilter) {
                    return true; // Filter matches first name.
                }  else if (client1.getClient_name().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (client1.getCompany_name().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (client1.getTel().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (client1.getEmail().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                return false; // Does not match.
            });
        });




        BorderPane clientPane = new BorderPane();
        StackPane root = new StackPane();
        root.getChildren().add(table);
        clientPane.setTop(filterField);
        clientPane.setCenter(root);

        Scene sceneClients = new Scene(clientPane, 600, 400);
        stageClients.setTitle("Clients");
        stageClients.setScene(sceneClients);
        stageClients.show();
    }

    //creating a table for loadings and show list of loadings in table
    public void create_table_loading(){
        Stage stageLoading = new Stage();

        TableView<LoadingReport> table = new TableView<>();

        TableColumn<LoadingReport, Integer> bookingNumberCol = new TableColumn<>("booking Number");
        bookingNumberCol.setMinWidth(100);
        bookingNumberCol.setCellValueFactory(new PropertyValueFactory<>("bookingNumber"));

        TableColumn<LoadingReport, Integer> clientIdCol = new TableColumn<>("client Id");
        clientIdCol.setMinWidth(100);
        clientIdCol.setCellValueFactory(new PropertyValueFactory<>("clientId"));

        TableColumn<LoadingReport, String> bookingDateCol = new TableColumn<>("booking Date");
        bookingDateCol.setMinWidth(100);
        bookingDateCol.setCellValueFactory(new PropertyValueFactory<>("bookingDate"));

        TableColumn<LoadingReport, String> originCountryCol = new TableColumn<>("origin Country");
        originCountryCol.setMinWidth(100);
        originCountryCol.setCellValueFactory(new PropertyValueFactory<>("originCountry"));

        TableColumn<LoadingReport, String> shippingLineCol = new TableColumn<>("shipping Line");
        shippingLineCol.setMinWidth(100);
        shippingLineCol.setCellValueFactory(new PropertyValueFactory<>("shippingLine"));

        TableColumn<LoadingReport, String> terminalCol = new TableColumn<>("terminal");
        terminalCol.setMinWidth(100);
        terminalCol.setCellValueFactory(new PropertyValueFactory<>("terminal"));

        TableColumn<LoadingReport, String> destinationCountryCol = new TableColumn<>("destination Country");
        destinationCountryCol.setMinWidth(100);
        destinationCountryCol.setCellValueFactory(new PropertyValueFactory<>("destinationCountry"));

        TableColumn<LoadingReport, Integer> containerNumberCol = new TableColumn<>("container Number");
        containerNumberCol.setMinWidth(100);
        containerNumberCol.setCellValueFactory(new PropertyValueFactory<>("containerNumber"));

        TableColumn<LoadingReport, String> sealNumberCol = new TableColumn<>("seal Number");
        sealNumberCol.setMinWidth(100);
        sealNumberCol.setCellValueFactory(new PropertyValueFactory<>("sealNumber"));

        TableColumn<LoadingReport, Integer> containerSizeCol = new TableColumn<>("container Size");
        containerSizeCol.setMinWidth(100);
        containerSizeCol.setCellValueFactory(new PropertyValueFactory<>("containerSize"));

        TableColumn<LoadingReport, Integer> containerWeightCol = new TableColumn<>("container Weight");
        containerWeightCol.setMinWidth(100);
        containerWeightCol.setCellValueFactory(new PropertyValueFactory<>("containerWeight"));

        TableColumn<LoadingReport, String> shipNumberCol = new TableColumn<>("ship Number");
        shipNumberCol.setMinWidth(100);
        shipNumberCol.setCellValueFactory(new PropertyValueFactory<>("shipNumber"));

        TableColumn<LoadingReport, String> vesselNameCol = new TableColumn<>("vessel Name");
        vesselNameCol.setMinWidth(100);
        vesselNameCol.setCellValueFactory(new PropertyValueFactory<>("vesselName"));

        TableColumn<LoadingReport, String> loadingDateCol = new TableColumn<>("loading Date");
        loadingDateCol.setMinWidth(100);
        loadingDateCol.setCellValueFactory(new PropertyValueFactory<>("loadingDate"));

        TableColumn<LoadingReport, Integer> numberOfCarsCol = new TableColumn<>("number Of Cars");
        numberOfCarsCol.setMinWidth(100);
        numberOfCarsCol.setCellValueFactory(new PropertyValueFactory<>("numberOfCars"));

        TableColumn<LoadingReport, String> vin_number1Col = new TableColumn<>("vin_number1");
        vin_number1Col.setMinWidth(100);
        vin_number1Col.setCellValueFactory(new PropertyValueFactory<>("vin_number1"));

        TableColumn<LoadingReport, String> vin_number2Col = new TableColumn<>("vin_number2");
        vin_number2Col.setMinWidth(100);
        vin_number2Col.setCellValueFactory(new PropertyValueFactory<>("vin_number2"));

        TableColumn<LoadingReport, String> vin_number3Col = new TableColumn<>("vin_number3");
        vin_number3Col.setMinWidth(100);
        vin_number3Col.setCellValueFactory(new PropertyValueFactory<>("vin_number3"));

        TableColumn<LoadingReport, String> vin_number4Col = new TableColumn<>("vin_number4");
        vin_number4Col.setMinWidth(100);
        vin_number4Col.setCellValueFactory(new PropertyValueFactory<>("vin_number4"));


        table.getColumns().addAll(bookingNumberCol, clientIdCol,bookingDateCol,originCountryCol,shippingLineCol,
                terminalCol,destinationCountryCol,containerNumberCol,sealNumberCol,containerSizeCol,
                containerWeightCol,shipNumberCol,vesselNameCol,loadingDateCol,numberOfCarsCol,vin_number1Col,
                vin_number2Col,vin_number3Col,vin_number4Col);

        ObservableList<LoadingReport> data = FXCollections.observableArrayList(allLoading);
        table.setItems(data);

        // Create text field for filtering
        FilteredList<LoadingReport> filteredData = new FilteredList<>(data);
        table.setItems(filteredData);

// Create a text field to enter the filter value
        TextField filterField = new TextField();

// Add a listener to the text field to update the filter predicate when the text changes
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(loadingReport1 -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();
                int intFilter=0;
                try{
                    intFilter = Integer.parseInt(newValue);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                if (loadingReport1.getBookingNumber()==intFilter) {
                    return true; // Filter matches first name.
                }else if (loadingReport1.getClientId()==intFilter) {
                    return true; // Filter matches first name.
                }else if (loadingReport1.getBookingDate().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getOriginCountry().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getShippingLine().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getTerminal().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getDestinationCountry().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getContainerNumber()==intFilter) {
                    return true; // Filter matches first name.
                } else if (loadingReport1.getSealNumber().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }else if (loadingReport1.getContainerSize()==intFilter) {
                    return true; // Filter matches first name.
                }else if (loadingReport1.getContainerWeight()==intFilter) {
                    return true; // Filter matches first name.
                }else if (loadingReport1.getShipNumber().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getVesselName().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getLoadingDate().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }else if (loadingReport1.getNumberOfCars()==intFilter) {
                    return true; // Filter matches first name.
                }else if (loadingReport1.getVin_number1().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getVin_number2().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (loadingReport1.getVin_number3().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }else if (loadingReport1.getVin_number4().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                return false; // Does not match.
            });
        });

        BorderPane loadingPane = new BorderPane();
        StackPane root = new StackPane();
        root.getChildren().add(table);
        loadingPane.setTop(filterField);
        loadingPane.setCenter(root);

        Scene sceneClients = new Scene(loadingPane, 600, 400);
        stageLoading.setTitle("Loading Report");
        stageLoading.setScene(sceneClients);
        stageLoading.show();
    }

    //creating a table for cars and show list of cars in table
    public void create_table_car(){
        Stage stageCars = new Stage();

        TableView<CarInfo> table = new TableView<>();

        TableColumn<CarInfo, String> car_informationCol = new TableColumn<>("car information");
        car_informationCol.setMinWidth(100);
        car_informationCol.setCellValueFactory(new PropertyValueFactory<>("car_information"));

        TableColumn<CarInfo, String> vin_numberCol = new TableColumn<>("vin number");
        vin_numberCol.setMinWidth(100);
        vin_numberCol.setCellValueFactory(new PropertyValueFactory<>("vin_number"));

        TableColumn<CarInfo, String> car_modelCol = new TableColumn<>("car model");
        car_modelCol.setMinWidth(100);
        car_modelCol.setCellValueFactory(new PropertyValueFactory<>("car_model"));

        TableColumn<CarInfo, String> car_colorCol = new TableColumn<>("car color");
        car_colorCol.setMinWidth(100);
        car_colorCol.setCellValueFactory(new PropertyValueFactory<>("car_color"));

        TableColumn<CarInfo, Integer> car_yearCol = new TableColumn<>("car year");
        car_yearCol.setMinWidth(100);
        car_yearCol.setCellValueFactory(new PropertyValueFactory<>("car_year"));

        TableColumn<CarInfo, Double> car_weightCol = new TableColumn<>("car weight");
        car_weightCol.setMinWidth(100);
        car_weightCol.setCellValueFactory(new PropertyValueFactory<>("car_weight"));

        TableColumn<CarInfo, Integer> car_priceCol = new TableColumn<>("car price");
        car_priceCol.setMinWidth(100);
        car_priceCol.setCellValueFactory(new PropertyValueFactory<>("car_price"));


        table.getColumns().addAll(car_informationCol, vin_numberCol,car_modelCol,car_colorCol,car_yearCol,
                car_weightCol,car_priceCol);

        ObservableList<CarInfo> data = FXCollections.observableArrayList(allCars);
        table.setItems(data);

        // Create text field for filtering
        FilteredList<CarInfo> filteredData = new FilteredList<>(data);
        table.setItems(filteredData);

// Create a text field to enter the filter value
        TextField filterField = new TextField();

// Add a listener to the text field to update the filter predicate when the text changes
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(car -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();
                int intFilter=0;
                double doubleFilter=0;
                try{
                    intFilter = Integer.parseInt(newValue);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                try{
                    doubleFilter = Double.parseDouble(newValue);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                if (car.getCar_information().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (car.getVin_number().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (car.getCar_model().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (car.getCar_color().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                } else if (car.getCar_year()==intFilter) {
                    return true; // Filter matches first name.
                } else if (car.getCar_weight()==doubleFilter) {
                    return true; // Filter matches first name.
                }else if (car.getCar_price()==intFilter) {
                    return true; // Filter matches first name.
                }
                return false; // Does not match.
            });
        });

        BorderPane carPane = new BorderPane();
        StackPane root = new StackPane();
        root.getChildren().add(table);
        carPane.setTop(filterField);
        carPane.setCenter(root);

        Scene sceneClients = new Scene(carPane, 600, 400);
        stageCars.setTitle("Cars Information");
        stageCars.setScene(sceneClients);
        stageCars.show();
    }

    public int delete_client(){
        try{
            client_delete_ID = Integer.parseInt(client_delete_tf.getText());
        }
        catch (NumberFormatException ex){
            client_delete_tf.setStyle("-fx-border-color: red;");
        }
        return client_delete_ID;
    }

    public int delete_loading(){
        try{
            loading_delete_number = Integer.parseInt(loading_delete_tf.getText());
        }
        catch (NumberFormatException ex){
            loading_delete_tf.setStyle("-fx-border-color: red;");
        }
        return loading_delete_number;
    }

    public String delete_car(){
        car_delete_VIN = car_delete_tf.getText();
        if(car_delete_VIN.isEmpty()){
            car_delete_tf.setStyle("-fx-border-color: red;");
        }
        return car_delete_VIN;
    }





    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LoadingReport getLoadingReport() {
        return loadingReport;
    }

    public void setLoadingReport(LoadingReport loadingReport) {
        this.loadingReport = loadingReport;
    }

    public CarInfo getCar1() {
        return car1;
    }

    public void setCar1(CarInfo car1) {
        this.car1 = car1;
    }

    public CarInfo getCar2() {
        return car2;
    }

    public void setCar2(CarInfo car2) {
        this.car2 = car2;
    }

    public CarInfo getCar3() {
        return car3;
    }

    public void setCar3(CarInfo car3) {
        this.car3 = car3;
    }

    public CarInfo getCar4() {
        return car4;
    }

    public void setCar4(CarInfo car4) {
        this.car4 = car4;
    }

    public int getClient_delete_ID() {
        return client_delete_ID;
    }

    public void setClient_delete_ID(int client_delete_ID) {
        this.client_delete_ID = client_delete_ID;
    }

    public int getLoading_delete_number() {
        return loading_delete_number;
    }

    public void setLoading_delete_number(int loading_delete_number) {
        this.loading_delete_number = loading_delete_number;
    }

    public String getCar_delete_VIN() {
        return car_delete_VIN;
    }

    public void setCar_delete_VIN(String car_delete_VIN) {
        this.car_delete_VIN = car_delete_VIN;
    }

    public int getClient_edit_ID() {
        return client_edit_ID;
    }

    public void setClient_edit_ID(int client_edit_ID) {
        this.client_edit_ID = client_edit_ID;
    }

    public int getLoading_edit_number() {
        return loading_edit_number;
    }

    public void setLoading_edit_number(int loading_edit_number) {
        this.loading_edit_number = loading_edit_number;
    }

    public String getCar_edit_VIN() {
        return car_edit_VIN;
    }

    public void setCar_edit_VIN(String car_edit_VIN) {
        this.car_edit_VIN = car_edit_VIN;
    }

    public ArrayList<Client> getAllClients() {
        return allClients;
    }

    public void setAllClients(ArrayList<Client> allClients) {
        this.allClients = allClients;
    }

    public ArrayList<LoadingReport> getAllLoading() {
        return allLoading;
    }

    public void setAllLoading(ArrayList<LoadingReport> allLoading) {
        this.allLoading = allLoading;
    }

    public ArrayList<CarInfo> getAllCars() {
        return allCars;
    }

    public void setAllCars(ArrayList<CarInfo> allCars) {
        this.allCars = allCars;
    }


}

