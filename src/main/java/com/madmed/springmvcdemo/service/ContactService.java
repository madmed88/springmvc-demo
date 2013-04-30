package com.madmed.springmvcdemo.service;

import java.util.List;

import com.madmed.springmvcdemo.form.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id); 

}
