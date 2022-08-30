package com.example.firstservice;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer(){
        this("", null,"",0);
    }
    public Customer(String ID ,String n ,String s ,int a){
        this.ID = ID;
        this.name = n;
        if(s.equals("Male") || s.equals("male") ) {
            this.sex = true;
        } else if (s.equals("Female") || s.equals("female")) {
            this.sex = false;
        }
        if (a<0){
            a = 0;
            this.age = a;
        }

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
