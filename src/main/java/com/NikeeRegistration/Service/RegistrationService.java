package com.NikeeRegistration.Service;

import com.NikeeRegistration.Entity.Registration;

public interface RegistrationService {

	
	public Registration adduser(Registration register);
	public Registration findById(String UserName); 
}
