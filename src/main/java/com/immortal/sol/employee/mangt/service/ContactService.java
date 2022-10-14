package com.immortal.sol.employee.mangt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immortal.sol.employee.mangt.entity.ContactDetails;
import com.immortal.sol.employee.mangt.repository.ContactRepository;

@Service(value = "contactService")
public class ContactService implements ContactServiceInt{
	
	@Autowired
	private ContactRepository repository;

	@Override
	public ContactDetails saveContact(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		return repository.save(contactDetails);
	}

	@Override
	public ContactDetails updateContact(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactDetails> fetchContacts(String empId) {
		
		return repository.findByEmpId(empId);
	}

	@Override
	public Optional<ContactDetails> fetchContact(Long seqId) {
		// TODO Auto-generated method stub
		return repository.findById(seqId);
	}

	@Override
	public List<ContactDetails> fetchContacts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteContact(Long seqId) {
		// TODO Auto-generated method stub
		repository.deleteById(seqId);
	}

	@Override
	public void deleteContacts(String empId) {
		List<ContactDetails> contscts = repository.findByEmpId(empId);
		if(!contscts.isEmpty()) {
			repository.deleteAllInBatch(contscts);
		}
	}

}
