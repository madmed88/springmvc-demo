package com.madmed.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;

import com.madmed.springmvcdemo.form.Contact;
import com.madmed.springmvcdemo.service.ContactService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
 
@Controller
public class ContactController {
 
    @Autowired
    private ContactService contactService;
 
    @RequestMapping(value = "/contact", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Contact> list() {
        return new ArrayList<Contact>(contactService.listContact());
    }
    
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@RequestBody Contact contact) {
    	contactService.addContact(contact);
    }
 
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
    	contactService.removeContact(id);
    }
}