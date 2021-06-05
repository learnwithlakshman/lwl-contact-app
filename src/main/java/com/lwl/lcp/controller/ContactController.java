package com.lwl.lcp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.lcp.domain.Contact;
import com.lwl.lcp.service.ContactService;


@RestController
@RequestMapping("/api/v1")
public class ContactController {
		
		@Autowired
		private ContactService contactService;
		
		@PostMapping("/add")
		public Contact addContact(@RequestBody Contact contact) {
			return contactService.addContact(contact);
		}
		@GetMapping("/all")
		public List<Contact> getContacts(){
			return contactService.getContacts();
		}
}
