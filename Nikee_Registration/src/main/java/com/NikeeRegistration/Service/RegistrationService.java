package com.NikeeRegistration.Service;

import java.util.List;

import com.NikeeRegistration.Entity.Registration;

public interface RegistrationService {

	 
	public Registration adduser(Registration register);
	public Registration findById(String UserName); 
	List<Registration> findAll();    
}
