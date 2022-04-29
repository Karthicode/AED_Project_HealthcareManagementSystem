/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Tickets;

import IntegrationSystem.CustomerAccount;

/**
 *
 * @author karthik
 */
public class Tickets {
    
    private String ticket_Id;
    private String ticket_Name;
    private String consumer_phone;
    private String client_postcode;
    private String client_EmailID;
    private String hospital_id;
    private String ticket_Category;
    private String ticket_Time;
    private String ticket_Status;
    private String ticket_description;
    private String timeStamp;
    private String ticket_Type;

    public String getTicket_Type() {
        return ticket_Type;
    }

    public void setTicket_Type(String ticket_Type) {
        this.ticket_Type = ticket_Type;
    }
    
    public String getTicket_Id() {
        return ticket_Id;
    }

    public void setTicket_Id(String ticket_Id) {
        this.ticket_Id = ticket_Id;
    }

    public String getClient_EmailID() {
        return client_EmailID;
    }

    public void setClient_EmailID(String client_EmailID) {
        this.client_EmailID = client_EmailID;
    }

    public String getTicket_Name() {
        return ticket_Name;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setTicket_Name(String ticket_Name) {
        this.ticket_Name = ticket_Name;
    }

    public String getConsumer_phone() {
        return consumer_phone;
    }

    public void setConsumer_phone(String consumer_phone) {
        this.consumer_phone = consumer_phone;
    }

    public String getClient_postcode() {
        return client_postcode;
    }

    public void setClient_postcode(String client_postcode) {
        this.client_postcode = client_postcode;
    }

    public String getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getTicket_Category() {
        return ticket_Category;
    }

    public void setTicket_Category(String ticket_Category) {
        this.ticket_Category = ticket_Category;
    }

    public String getTicket_Time() {
        return ticket_Time;
    }

    public void setTicket_Time(String ticket_Time) {
        this.ticket_Time = ticket_Time;
    }

    public String getTicket_Status() {
        return ticket_Status;
    }

    public void setTicket_Status(String ticket_Status) {
        this.ticket_Status = ticket_Status;
    }

    public String getTicket_description() {
        return ticket_description;
    }

    public void setTicket_description(String ticket_description) {
        this.ticket_description = ticket_description;
    }
    
    
    @Override
    public String toString(){
        return ticket_Id;
    }

    
}
