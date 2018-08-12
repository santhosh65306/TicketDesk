package com.example.siva1.ticket;

/**
 * Created by siva1 on 12/02/2018.
 */

public class User {
    int id;
    String name;
    String mobile;
    String mailid;
    Double lat;
    Double lng;

    public User(int id, String name, String mobile, String mailid, Double lat, Double lng) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.mailid = mailid;
        this.lat = lat;
        this.lng = lng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
