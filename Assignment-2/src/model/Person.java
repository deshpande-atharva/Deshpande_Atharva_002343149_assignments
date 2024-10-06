/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 k n* Clicbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author athar
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String socialNumber;
    private Address homeAddress;
    private Address workAddress;
    
    public Person(){
        this.homeAddress= new Address();
        this.workAddress= new Address();
    }
    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return this.workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    
}
