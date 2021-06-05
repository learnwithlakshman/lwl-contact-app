package com.lwl.lcp.service;

import java.util.List;

import com.lwl.lcp.domain.Contact;

public interface ContactService {

	public Contact addContact(Contact contact);

	public List<Contact> getContacts();
}
