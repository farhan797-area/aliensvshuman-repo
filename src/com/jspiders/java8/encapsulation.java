package com.jspiders.java8;

class user{
    private int Userid;
    private String name;
    private int age;
    private  String email;
    private long phone;
    private char gender;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getId() {
        return Userid;
    }

    public void setId(int id) {
        this.Userid = id;
    }
    @Override
    public int hashCode() {
        return this.Userid;
    }
    @Override
    public String toString() {
        return "Name" +this.name + "Age" + this.age;
    }
    @Override
    public boolean equals(Object obj) {
        user ref = (user) obj;
        if (ref.Userid==this.Userid){
            return true;
        }
        return false;
    }
    class User extends Object{
        private int Userid;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        System.out.println("Program stats...");



    }
}
