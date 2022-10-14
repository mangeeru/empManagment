package com.immortal.sol.employee.mangt.service;

import java.util.List;
import java.util.Optional;

import com.immortal.sol.employee.mangt.entity.ContactDetails;

public interface ContactServiceInt {
	
	public ContactDetails saveContact(ContactDetails contactDetails);
	
	public ContactDetails updateContact(ContactDetails contactDetails);
	
	public List<ContactDetails> fetchContacts(String empId);
	
	public Optional<ContactDetails> fetchContact(Long seqId);
	
	public List<ContactDetails> fetchContacts();
	
	public void deleteContact(Long seqId);
	
	public void deleteContacts(String empId);

}
