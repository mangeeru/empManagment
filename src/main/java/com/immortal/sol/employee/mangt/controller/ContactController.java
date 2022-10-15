package com.immortal.sol.employee.mangt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immortal.sol.employee.mangt.entity.ContactDetails;
import com.immortal.sol.employee.mangt.exception.NoRecordFoundException;
import com.immortal.sol.employee.mangt.service.ContactServiceInt;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/contact")
@Api(value = "contact Resource REST Endpoint", description = "Shows the contact info")
public class ContactController {
	
	@Autowired
	private ContactServiceInt contactService;
	
	@PostMapping("/add")
	public ResponseEntity<ContactDetails> addContact(@RequestBody ContactDetails contactDetails){
		final ContactDetails details = contactService.saveContact(contactDetails);
		return ResponseEntity.ok(details);
	}
	
	@GetMapping("/fetch/all")
	public ResponseEntity<List<ContactDetails>> getContacts(){
		return ResponseEntity.ok(contactService.fetchContacts());
	}
	
	@GetMapping("/fetch/{empId}")
	@ApiOperation(
            value = "Get contacts by employee id",
            notes = "Returns contact details for employee specified.",
            response = ContactDetails.class)
	public ResponseEntity<List<ContactDetails>> getContacts(@PathVariable("empId") String empId) throws NoRecordFoundException{
		List<ContactDetails> contacts = contactService.fetchContacts(empId);
		if(contacts.isEmpty()) {
			throw new NoRecordFoundException("contacts not found for employee:"+empId);
		}
		return ResponseEntity.ok(contacts);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ContactDetails> updateContact(@RequestBody ContactDetails contactDetails) throws NoRecordFoundException{
		Optional<ContactDetails> contact = contactService.fetchContact(contactDetails.getSeqId());
		if(contact.isEmpty()) {
			throw new NoRecordFoundException("contacts not found :"+contactDetails.getEmpId());
		}
		final ContactDetails details = contactService.updateContact(contactDetails);
		return ResponseEntity.ok(details);
	}

}
