package com.lwl.lcp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lwl.lcp.domain.Contact;
import com.lwl.lcp.repo.ContactRepo;

@SpringBootTest
public class ContactServiceTest {

	@Autowired
	private ContactService contactService;
	@Autowired
	private ContactRepo contactRepo;

	@BeforeEach
	public void beforeEach() {
		contactRepo.deleteAll();
	}

	@Test
	public void addContact() {
		Contact contact = Contact.builder().name("Krish").mobile("9876543210").build();
		Contact scontact = contactService.addContact(contact);
		assertNotNull(scontact);
		assertTrue(scontact.getName().equals(contact.getName()) && !scontact.getId().isEmpty());
	}
	
	@Test
	public void getContacts() {
		Contact contact1 = Contact.builder().name("Krish").mobile("9876543210").build();
		contactService.addContact(contact1);
		Contact contact2 = Contact.builder().name("Manoj").mobile("9876543211").build();
		contactService.addContact(contact2);
		List<Contact> list = contactRepo.findAll();
		assertEquals(2, list.size());
	}
}
