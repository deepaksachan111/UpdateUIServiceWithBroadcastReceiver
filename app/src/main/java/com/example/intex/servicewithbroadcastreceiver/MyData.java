package com.example.intex.servicewithbroadcastreceiver;

/**
 * Created by intex on 9/24/2016.
 */
public class MyData {

    String Mesage;
    int no ;

    public MyData(String mesage, int no) {
        Mesage = mesage;
        this.no = no;
    }

    public String getMesage() {
        return Mesage;
    }

    public void setMesage(String mesage) {
        Mesage = mesage;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
