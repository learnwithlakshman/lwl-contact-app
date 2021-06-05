package com.lwl.lcp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lwl.lcp.domain.Contact;

public interface ContactRepo extends MongoRepository<Contact,String> {

}
