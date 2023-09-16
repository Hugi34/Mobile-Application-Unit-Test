package com.project_one.Test;

public class ContactServiceTest {
        private ContactService contactService= new ContactService(); //Contact service
    
        /**
         * This method tests the contact service.
         */
        @Test
        public void testContactService() {
            Contact contact = new Contact(1234567890, "John", "Doe", "1123456781", "123 Main St"); //New Contact
            
            contactService.addContact(contact); //Add contact
            
            contactService.updateContact(1234567890, "firstName", "Jane"); //Update contact field
            
            contactService.removeContact(1234567890); //Delete contact
        }
    
    }

