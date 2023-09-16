package com.project_one.Contact;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class represents a contact in the address book.
 */
    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @ToString
public class Contact {

    int id; // id of the contact
    String firstName; // first name of the contact
    String lastName; // last name of the contact
    String phoneNumber; // phone number of the contact
    String address; // address of the contact
    

    /**
     * Constructor for the contact class.
     * @param id id of the contact
     * @param firstName first name of the contact
     * @param lastName last name of the contact
     * @param address address of the contact
     */

    public Contact(int id, String firstName, String lastName, String phoneNumber, String address) {
        this.id = id; //Id of the contact
        this.firstName = firstName; //First name of the contact
        this.lastName = lastName; //Last name of the contact
        this.phoneNumber = phoneNumber; //Phone number of the contact
        this.address = address; //Address of the contact
    } 
    
}
