package com.example.systemproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteDataSource;
 
public class ConnectToDB {

    //inserting
    //********************************************************
    //********************************************************
    public void insertRecord(Client client, LoadingReport loadingReport, CarInfo car1, CarInfo car2, CarInfo car3, CarInfo car4) {


        ///////////////////////////

        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        String queryClient = insertClientQuery(client);
        try ( Connection conn = ds.getConnection(); //creating connection
              Statement stmt = conn.createStatement(); ) { //create a statement, execute the query, save the result in rv
            int rvClient = stmt.executeUpdate( queryClient );
            System.out.println( "executeUpdate() returned " + rvClient );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }

        String queryLoadingReport = insertLoadingReportQuery(loadingReport, client);
        try ( Connection conn = ds.getConnection(); //creating connection
              Statement stmt = conn.createStatement(); ) { //create a statement, execute the query, save the result in rv
            int rvLoadingReport = stmt.executeUpdate( queryLoadingReport );
            System.out.println( "executeUpdate() returned " + rvLoadingReport );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }

        int n= loadingReport.getNumberOfCars();
        if(n>=1) {
            String queryCarInfo = insertCarQuery(car1);
            try (Connection conn = ds.getConnection(); //creating connection
                 Statement stmt = conn.createStatement();) { //create a statement, execute the query, save the result in rv
                int rvqueryCarInfo = stmt.executeUpdate(queryCarInfo);
                System.out.println("executeUpdate() returned " + rvqueryCarInfo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        if(n>=2) {
            String queryCarInfo = insertCarQuery(car2);
            try (Connection conn = ds.getConnection(); //creating connection
                 Statement stmt = conn.createStatement();) { //create a statement, execute the query, save the result in rv
                int rvqueryCarInfo = stmt.executeUpdate(queryCarInfo);
                System.out.println("executeUpdate() returned " + rvqueryCarInfo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        if(n>=3) {
            String queryCarInfo = insertCarQuery(car3);
            try (Connection conn = ds.getConnection(); //creating connection
                 Statement stmt = conn.createStatement();) { //create a statement, execute the query, save the result in rv
                int rvqueryCarInfo = stmt.executeUpdate(queryCarInfo);
                System.out.println("executeUpdate() returned " + rvqueryCarInfo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        if(n>=4) {
            String queryCarInfo = insertCarQuery(car4);
            try (Connection conn = ds.getConnection(); //creating connection
                 Statement stmt = conn.createStatement();) { //create a statement, execute the query, save the result in rv
                int rvqueryCarInfo = stmt.executeUpdate(queryCarInfo);
                System.out.println("executeUpdate() returned " + rvqueryCarInfo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }

        System.out.println( "Created database successfully" );
    }
    //********************************************************
    //creating insertClientQuery function
    public String insertClientQuery(Client client) {
        return "INSERT INTO Client ( client_id, client_name, company_name, tel, email)"
                + " VALUES ( "+client.getClient_id()+", '"+client.getClient_name()+"', '"+client.getCompany_name()+
                "', '"+client.getTel()+"', '"+ client.getEmail()+"' )";
    }

    //creating insertLoadingReportQuery function
    public String insertLoadingReportQuery(LoadingReport loadingReport, Client client) {
        return "INSERT INTO LoadingReport ( bookingNumber, clientId, bookingDate, originCountry, shippingLine," +
                "terminal, destinationCountry, containerNumber, sealNumber, containerSize, containerWeight," +
                "shipNumber, vesselName, loadingDate, numberOfCars, vin_number1, vin_number2, vin_number3, vin_number4)"
                + " VALUES ( "+loadingReport.getBookingNumber()+", "+client.getClient_id()+
                ", '"+loadingReport.getBookingDate()+ "', '"+loadingReport.getOriginCountry()+
                "', '"+ loadingReport.getShippingLine()+"', '"+loadingReport.getTerminal()+
                "', '"+loadingReport.getDestinationCountry()+"', "+loadingReport.getContainerNumber()+
                ", '"+loadingReport.getSealNumber()+"', "+loadingReport.getContainerSize()+
                ", "+loadingReport.getContainerWeight()+", '"+loadingReport.getShipNumber()+
                "', '"+loadingReport.getVesselName()+"', '"+loadingReport.getLoadingDate()+
                "', "+loadingReport.getNumberOfCars()+", '"+loadingReport.getVin_number1()+
                "', '"+loadingReport.getVin_number2()+"', '"+loadingReport.getVin_number3()+
                "', '"+loadingReport.getVin_number4()+"' )";
    }

    //creating insertCarInfoQuery function
    public String insertCarQuery(CarInfo car) {
        return "INSERT INTO CarInfo ( car_information, vin_number, car_model, car_color, car_year, car_weight, car_price)"
                + " VALUES ( '"+car.getCar_information()+"', '"+car.getVin_number()+"', '"+car.getCar_model()+
                "', '"+car.getCar_color()+"', "+car.getCar_year()+", "+car.getCar_weight()+ ", "+ car.getCar_price()+" )";
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //selectClients
    //********************************************************
    //********************************************************
    public ArrayList<Client> selectclient() {

        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        //creating query
        String query = "SELECT * FROM Client";

        ArrayList<Client> allClients = new ArrayList<Client>();

        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            ResultSet rs = stmt.executeQuery(query);
            //getting all clients row by row from ResultSet
            while ( rs.next() ) {
                int client_id = rs.getInt( "client_id" );
                String client_name = rs.getString( "client_name" );
                String company_name = rs.getString( "company_name" );
                String tel = rs.getString( "tel" );
                String email = rs.getString( "email" );

                // save all clients in allClients
                allClients.add(new Client(client_id, client_name, company_name, tel, email));
            }

        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
        return allClients;

    }

    //selectLoadings
    //********************************************************
    //********************************************************
    public ArrayList<LoadingReport> selectLoading() {

        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        //creating query
        String query = "SELECT * FROM LoadingReport";

        ArrayList<LoadingReport> allLoading = new ArrayList<LoadingReport>();

        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            ResultSet rs = stmt.executeQuery(query);
            //getting all loadings row by row from ResultSet
            while ( rs.next() ) {
                int bookingNumber = rs.getInt( "bookingNumber" );
                int clientId = rs.getInt( "clientId" );
                String bookingDate = rs.getString( "bookingDate" );
                String originCountry = rs.getString( "originCountry" );
                String shippingLine = rs.getString( "shippingLine" );
                String terminal = rs.getString( "terminal" );
                String destinationCountry = rs.getString( "destinationCountry" );
                int containerNumber = rs.getInt( "containerNumber" );
                String sealNumber = rs.getString( "sealNumber" );
                int containerSize = rs.getInt( "containerSize" );
                int containerWeight = rs.getInt( "containerWeight" );
                String shipNumber = rs.getString( "shipNumber" );
                String vesselName = rs.getString( "vesselName" );
                String loadingDate = rs.getString( "loadingDate" );
                int numberOfCars = rs.getInt( "numberOfCars" );
                String vin_number1 = rs.getString( "vin_number1" );
                String vin_number2 = rs.getString( "vin_number2" );
                String vin_number3 = rs.getString( "vin_number3" );
                String vin_number4 = rs.getString( "vin_number4" );

                // save all loadings in allLoadings
                allLoading.add(new LoadingReport(bookingNumber, clientId, bookingDate, originCountry, shippingLine,
                        terminal, destinationCountry, containerNumber, sealNumber, containerSize, containerWeight,
                        shipNumber, vesselName, loadingDate, numberOfCars, vin_number1, vin_number2, vin_number3,
                        vin_number4));
            }

        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
        return allLoading;

    }

    //selectCars
    //********************************************************
    //********************************************************
    public ArrayList<CarInfo> selectCars() {

        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        //creating query
        String query = "SELECT * FROM CarInfo";

        ArrayList<CarInfo> allCars = new ArrayList<CarInfo>();

        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            ResultSet rs = stmt.executeQuery(query);
            //getting all cars row by row from ResultSet
            while ( rs.next() ) {

                String car_information = rs.getString( "car_information" );
                String vin_number = rs.getString( "vin_number" );
                String car_model = rs.getString( "car_model" );
                String car_color = rs.getString( "car_color" );
                int car_year = rs.getInt( "car_year" );
                double car_weight = rs.getDouble( "car_weight" );
                int car_price = rs.getInt( "car_price" );

                // save all cars in allCars
                allCars.add(new CarInfo(car_information, vin_number, car_model, car_color, car_year,
                        car_weight, car_price));
            }

        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
        return allCars;

    }

    //DeleteClients
    //********************************************************
    //********************************************************
    public void deleteClient(int client_id) {

        ///////////////////////////
        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        String query = deleteQuery(client_id);
        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            int rv = stmt.executeUpdate( query );
            System.out.println( "executeUpdate() returned " + rv );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
    }
    //********************************************************
    //creating deleteQuery function
    public String deleteQuery(int client_id) {
        return "DELETE FROM Client WHERE client_id = "+client_id;
    }

    //DeleteLoadings
    //********************************************************
    //********************************************************
    public void deleteLoading(int bookingNumber) {

        ///////////////////////////
        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        String query = deleteQuery2(bookingNumber);
        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            int rv = stmt.executeUpdate( query );
            System.out.println( "executeUpdate() returned " + rv );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
    }
    //********************************************************
    //creating deleteQuery function
    public String deleteQuery2(int bookingNumber) {
        return "DELETE FROM LoadingReport WHERE bookingNumber = "+bookingNumber;
    }

    //DeleteCars
    //********************************************************
    //********************************************************
    public void deleteCar(String vin_number) {

        ///////////////////////////
        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////

        String query = deleteQuery3(vin_number);
        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            int rv = stmt.executeUpdate( query );
            System.out.println( "executeUpdate() returned " + rv );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
    }
    //********************************************************
    //creating deleteQuery function
    public String deleteQuery3(String vin_number) {
        return "DELETE FROM CarInfo WHERE vin_number = '"+vin_number+"'";
    }

    //UpdateClient
    //********************************************************
    //********************************************************
    public void editclient(int client_id_Edit, String attributeEdit, String valueEdit) {


        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////
       String query = editQuery(client_id_Edit, attributeEdit, valueEdit);
        try ( Connection conn = ds.getConnection();
    Statement stmt = conn.createStatement(); ) {
        int rv = stmt.executeUpdate( query );
        System.out.println( "executeUpdate() returned " + rv );
    } catch ( SQLException e ) {
        e.printStackTrace();
        System.exit( 0 );
    }
        System.out.println( "done successfully" );
}

    //********************************************************
    //creating editQuery function
    public String editQuery(int client_id_Edit, String attributeEdit, String valueEdit) {
        return "UPDATE Client SET "+attributeEdit+" = '"+valueEdit+"' WHERE client_id = "+client_id_Edit;
    }

    //Updateloading
    //********************************************************
    //********************************************************
    public void editloading(int bookingNumber_Edit, String attributeEdit, String valueEdit) {


        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////
        String query = editQuery1(bookingNumber_Edit, attributeEdit, valueEdit);
        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            int rv = stmt.executeUpdate( query );
            System.out.println( "executeUpdate() returned " + rv );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
    }

    //********************************************************
    //creating editQuery1 function
    public String editQuery1(int bookingNumber_Edit, String attributeEdit, String valueEdit) {

        int valueEdit_int=0;
        if(attributeEdit.equals("bookingNumber") || attributeEdit.equals("clientId") ||
                attributeEdit.equals("containerNumber") || attributeEdit.equals("containerSize")
                || attributeEdit.equals("containerWeight") || attributeEdit.equals("numberOfCars")){
            valueEdit_int=Integer.parseInt(valueEdit);
            return "UPDATE LoadingReport SET "+attributeEdit+" = "+valueEdit_int+" WHERE bookingNumber = "+bookingNumber_Edit;
        }
        else {
            return "UPDATE LoadingReport SET " + attributeEdit + " = '" + valueEdit + "' WHERE bookingNumber = " + bookingNumber_Edit;
        }
    }

    //Updatecar
    //********************************************************
    //********************************************************
    public void editcar(String car_edit_VIN, String attributeEdit, String valueEdit) {


        //connecting to sqlite
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:CarLoading.db");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println( "Opened database successfully" );
        ///////////////////////////
        String query = editQuery2(car_edit_VIN, attributeEdit, valueEdit);
        try ( Connection conn = ds.getConnection();
              Statement stmt = conn.createStatement(); ) {
            int rv = stmt.executeUpdate( query );
            System.out.println( "executeUpdate() returned " + rv );
        } catch ( SQLException e ) {
            e.printStackTrace();
            System.exit( 0 );
        }
        System.out.println( "done successfully" );
    }

    //********************************************************
    //creating editQuery2 function
    public String editQuery2(String car_edit_VIN, String attributeEdit, String valueEdit) {

        int valueEdit_int=0;
        double valueEdit_double=0;

        if(attributeEdit.equals("car_year") || attributeEdit.equals("car_price")){
            valueEdit_int=Integer.parseInt(valueEdit);
            return "UPDATE CarInfo SET "+attributeEdit+" = "+valueEdit_int+" WHERE vin_number = '"+car_edit_VIN+"'";
        }
        else if(attributeEdit.equals("car_weight")) {
            valueEdit_double=Double.parseDouble(valueEdit);
            return "UPDATE CarInfo SET "+attributeEdit+" = "+valueEdit_double+" WHERE vin_number = '"+car_edit_VIN+"'";
        }
        else {
            return "UPDATE CarInfo SET " + attributeEdit + " = '" + valueEdit + "' WHERE vin_number = '" + car_edit_VIN +"'";
        }
    }
}
