package com.example.systemproject;

public class LoadingReport {
    private int bookingNumber;
    private int clientId;
    private String bookingDate;
    private String originCountry;
    private String shippingLine;
    private String terminal;
    private String destinationCountry;
    private int containerNumber;
    private String sealNumber;
    private int containerSize;
    private int containerWeight;
    private String shipNumber;
    private String vesselName;
    private String loadingDate;
    private int numberOfCars;
    private String vin_number1;
    private String vin_number2;
    private String vin_number3;
    private String vin_number4;

    public LoadingReport() {
    }

    public LoadingReport(int bookingNumber, int clientId, String bookingDate, String originCountry, String shippingLine,
                         String terminal, String destinationCountry, int containerNumber, String sealNumber,
                         int containerSize, int containerWeight, String shipNumber, String vesselName,
                         String loadingDate, int numberOfCars, String vin_number1, String vin_number2,
                         String vin_number3, String vin_number4) {
        this.bookingNumber = bookingNumber;
        this.clientId = clientId;
        this.bookingDate = bookingDate;
        this.originCountry = originCountry;
        this.shippingLine = shippingLine;
        this.terminal = terminal;
        this.destinationCountry = destinationCountry;
        this.containerNumber = containerNumber;
        this.sealNumber = sealNumber;
        this.containerSize = containerSize;
        this.containerWeight = containerWeight;
        this.shipNumber = shipNumber;
        this.vesselName = vesselName;
        this.loadingDate = loadingDate;
        this.numberOfCars = numberOfCars;
        this.vin_number1 = vin_number1;
        this.vin_number2 = vin_number2;
        this.vin_number3 = vin_number3;
        this.vin_number4 = vin_number4;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getShippingLine() {
        return shippingLine;
    }

    public void setShippingLine(String shippingLine) {
        this.shippingLine = shippingLine;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public int getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(int containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public int getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(int containerSize) {
        this.containerSize = containerSize;
    }

    public int getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight(int containerWeight) {
        this.containerWeight = containerWeight;
    }

    public String getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(String shipNumber) {
        this.shipNumber = shipNumber;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(String loadingDate) {
        this.loadingDate = loadingDate;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public String getVin_number1() {
        return vin_number1;
    }

    public void setVin_number1(String vin_number1) {
        this.vin_number1 = vin_number1;
    }

    public String getVin_number2() {
        return vin_number2;
    }

    public void setVin_number2(String vin_number2) {
        this.vin_number2 = vin_number2;
    }

    public String getVin_number3() {
        return vin_number3;
    }

    public void setVin_number3(String vin_number3) {
        this.vin_number3 = vin_number3;
    }

    public String getVin_number4() {
        return vin_number4;
    }

    public void setVin_number4(String vin_number4) {
        this.vin_number4 = vin_number4;
    }
}
