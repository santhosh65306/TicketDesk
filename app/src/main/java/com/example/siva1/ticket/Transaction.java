package com.example.siva1.ticket;

/**
 * Created by siva1 on 12/02/2018.
 */

public class Transaction {
    int id;
    int userid;
    String moviename;
    String hallname;
    int rating;
    String date;
    int count;

    public Transaction(int id, int userid, String moviename, String hallname, int rating, String date, int count) {
        this.id = id;
        this.userid = userid;
        this.moviename = moviename;
        this.hallname = hallname;
        this.rating = rating;
        this.date = date;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getHallname() {
        return hallname;
    }

    public void setHallname(String hallname) {
        this.hallname = hallname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
