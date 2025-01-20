package com.NikeeRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NikeeRegistration.Entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, String>{

}
