package com.madmed.springmvcdemo.dao;

import java.util.List;

import com.madmed.springmvcdemo.form.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
