package com.project_one.Contact;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a contact service.
 */
public class ContactService {
    private Map<Integer, Contact> contacts = new HashMap<>();  //Map of contacts

    /**
     * Constructor for the contact service class.
     * @param contact contact to be added
     */
    public void addContact (Contact contact){
        if(contact != null && contact.getId() != 0){ //If contact is not null and contact id is not 0
            contacts.put(contact.getId(), contact); //Add contact to map
        }
    }

    /**
     * This method removes a contact from the map.
     * @param contact contact to be removed
     */
    public void removeContact (int id){
            contacts.remove(id); //Remove contact from map
    }

    /**
     * This method updates a contact.
     * @param contact contact to be updated
     */
    public void updateContact (int id, String field, String value){
        Contact contact = contacts.get(id);
        if (contact != null) { //If contact is not null
            switch (field) { //Switch statement for field
                case "firstName": //If field is firstName
                    contact.setFirstName(value); //Set first name
                    break; //Break
                case "lastName": //If field is lastName
                    contact.setLastName(value); //Set last name
                    break; //Break
                case "phone": //If field is phone
                    contact.setPhoneNumber(value); //Set phone number
                    break; //Break
                case "address": //If field is address
                    contact.setAddress(value); //Set address
                    break; //Break
                default: //Default
                    throw new IllegalArgumentException("Invalid field: " + field); //Throw exception
            }
        }
    }

}


    
