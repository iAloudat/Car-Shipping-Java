package com.example.systemproject;

public class Client {
    /** Variables to store Client information */
    private int client_id;
    private String client_name;
    private String company_name;
    private String tel;
    private String email;

    /** Constructors to create a new instance of the class */
    // Default constructor with no arguments
    public Client() {
    }

    // Constructor with arguments to initialize fields
    public Client(int client_id, String client_name, String company_name, String tel, String email) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.company_name = company_name;
        this.tel = tel;
        this.email = email;
    }

    /** Getter and setter methods for each Variable */
    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
