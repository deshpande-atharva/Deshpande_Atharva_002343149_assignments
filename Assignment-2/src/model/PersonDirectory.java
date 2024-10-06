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
        personList= new ArrayList<>(); //changeed from newArrayList<Person>();
    }
    //adds a new person
    public Person addPerson(Person person) {
        Person newPerson= new Person();
        personList.add(newPerson);
        return newPerson;
    }   
    
    public Boolean updatePerson(Person updatedPerson){
        for (int i = 0; i < personList.size(); i++) {
            Person existingPerson = personList.get(i);
            // Check if the unique identifier matches
            if (existingPerson.getSocialNumber().equals(updatedPerson.getSocialNumber())) {
                // Update existing person's fields
                existingPerson.setFirstname(updatedPerson.getFirstname());
                existingPerson.setLastname(updatedPerson.getLastname());
                existingPerson.setAge(updatedPerson.getAge());
                existingPerson.setSocialNumber(updatedPerson.getSocialNumber());
                existingPerson.getHomeAddress().setStreetAddress(updatedPerson.getHomeAddress().getStreetAddress());
                existingPerson.getHomeAddress().setUnitName(updatedPerson.getHomeAddress().getUnitName());
                existingPerson.getHomeAddress().setPhoneNumber(updatedPerson.getHomeAddress().getPhoneNumber());
                existingPerson.getHomeAddress().setCity(updatedPerson.getHomeAddress().getCity());
                existingPerson.getHomeAddress().setState(updatedPerson.getHomeAddress().getState());
                return true; // Indicate that the update was successful
            }
        }
        return false;// Indicate that the person was not found for updating
    }
    
    //removes a person
    public void removePerson(Person person) {
        if (personList.contains(person)) {
        personList.remove(person);
        }
        else {
        System.out.println("Person not found.");
        }
    }
    //return the whole list to display in table
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person findPerson(String searchData) {
        for (Person person : personList) {
            if (person.getFirstname().equals(searchData)|| person.getLastname().equals(searchData)||person.getHomeAddress().getStreetAddress().equals(searchData)) {
                return person;
            }
        }
        return null;
    }
  
}
