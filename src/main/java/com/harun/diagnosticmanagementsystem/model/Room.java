/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harun.diagnosticmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sakib
 */
@Entity
public class Room implements java.io.Serializable{
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int roomid;
    @Column
    String roomnumber;
    @Column
    String roomtype;
    @Column
    double roomcost;
    @Column
    String status;

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public double getRoomcost() {
        return roomcost;
    }

    public void setRoomcost(double roomcost) {
        this.roomcost = roomcost;
    }

    

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
            
    
}
