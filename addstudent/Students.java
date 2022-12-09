package com.masai.addstudent;

import java.util.*;

public class Students {

    private String name;
    private int rollNo;
    private String mobileNo;
    private ArrayList<String> subject=new ArrayList<>();
    Students(){

    }
    Students(String name,int rollNo,String mobileNo,ArrayList subject ){
        this.name=name;
        this.rollNo=rollNo;
        this.mobileNo=mobileNo;
        this.subject=subject;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


