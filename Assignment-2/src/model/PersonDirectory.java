/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author athar
 */
public class PersonDirectory {
    //create an array list of type person.
    ArrayList<Person> personList;
    
    //constructor
    public PersonDirectory(){
        personList= new ArrayList<Person>();
    }
    
    //adds a new person
    public Person addPerson(Person person) {
        Person newPerson= new Person();
        personList.add(newPerson);
        return newPerson;
    }
    
    //removes a person
    public void removePerson(int index) {
        if (index >= 0 && index < personList.size()) {
            personList.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }
    //return the whole list to display in table
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person findPersonByFirstName(String firstName) {
        for (Person person : personList) {
            if (person.getFirstname().equals(firstName)) {
                return person;
            }
        }
        return null;
    }
    public Person findPersonByLastName(String lastName) {
        for (Person person : personList) {
            if (person.getLastname().equals(lastName)) {
                return person;
            }
        }
        return null;
    }
     public Person findPersonByStreetAddress(String streetAddress) {
        for (Person person : personList) {
            // Check both home and work address
            if (person.getHomeAddress() != null && person.getHomeAddress().getStreetAddress().equals(streetAddress)) {
                return person; // Return person if home address matches
            } else if (person.getWorkAddress() != null && person.getWorkAddress().getStreetAddress().equals(streetAddress)) {
                return person; // Return person if work address matches
            }
        }
        return null;
    }
    
    
    
}
