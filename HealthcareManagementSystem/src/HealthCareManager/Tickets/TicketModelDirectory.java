/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Tickets;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karthik
 */
public class TicketModelDirectory {
    
    private String final_ticket_Id = "REQUEST001";
    ArrayList<Tickets> tickets_List = new ArrayList<>();

    public String getFinal_ticket_Id() {
        return final_ticket_Id;
    }

    public void setFinal_ticket_Id(String final_ticket_Id) {
        this.final_ticket_Id = final_ticket_Id;
    }
            
    public ArrayList<Tickets> getTickets_List() {
        return tickets_List;
    }

    public void setTickets_List(ArrayList<Tickets> tickets_List) {
        this.tickets_List = tickets_List;
    }
    
    public TicketModelDirectory() {
    }

    public void addRequest(Tickets request) {
        tickets_List.add(request);
    }
    
}
