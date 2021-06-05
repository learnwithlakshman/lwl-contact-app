package com.lwl.lcp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.lwl.lcp.domain.Contact;
import com.lwl.lcp.repo.ContactRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public Contact addContact(Contact contact) {
		Assert.notNull(contact, "Contact object can't b null");
		Contact savedContact = contactRepo.save(contact);
		log.info("Contact is added with id :{}", savedContact != null ? savedContact.getId() : null);
		return savedContact;
	}

	@Override
	public List<Contact> getContacts() {
		List<Contact> contacts = contactRepo.findAll();
		log.info("Total contacts found for user:{}", contacts.size());
		return contacts;
	}

}
