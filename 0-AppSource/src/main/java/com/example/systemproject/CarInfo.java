package com.example.systemproject;

public class CarInfo {
    private String car_information;
    private String vin_number;
    private String car_model;
    private String car_color;
    private int car_year;
    private double car_weight;
    private int car_price;

    public CarInfo() {
    }
    public CarInfo(String car_information, String vin_number, String car_model, String car_color, int car_year, double car_weight, int car_price) {
        this.car_information = car_information;
        this.vin_number = vin_number;
        this.car_model = car_model;
        this.car_color = car_color;
        this.car_year = car_year;
        this.car_weight = car_weight;
        this.car_price = car_price;
    }

    public String getCar_information() {
        return car_information;
    }

    public void setCar_information(String car_information) {
        this.car_information = car_information;
    }

    public String getVin_number() {
        return vin_number;
    }

    public void setVin_number(String vin_number) {
        this.vin_number = vin_number;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public int getCar_year() {
        return car_year;
    }

    public void setCar_year(int car_year) {
        this.car_year = car_year;
    }

    public double getCar_weight() {
        return car_weight;
    }

    public void setCar_weight(double car_weight) {
        this.car_weight = car_weight;
    }

    public int getCar_price() {
        return car_price;
    }

    public void setCar_price(int car_price) {
        this.car_price = car_price;
    }
}
