package com.NikeeRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NikeeRegistration.Entity.Registration;
import com.NikeeRegistration.Repository.RegistrationRepository;
@Service("registrationService")
public class RegistationServiceImpl implements RegistrationService{
	@Autowired
	private RegistrationRepository rr;

	@Override
	public Registration adduser(Registration register) {
		
		// TODO Auto-generated method stub
		//Registration r=rr.findById(register.getUserName()).orElseThrow();
		
		
		return rr.saveAndFlush(register);
	}

	@Override
	public Registration findById(String UserName) {
		// TODO Auto-generated method stub
		Registration r= rr.findById(UserName).orElseThrow();
		return r;
	}

	@Override
	public List<Registration> findAll() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

}
