package com.jeremyakatsa.polishingskills.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jeremyakatsa.polishingskills.models.User;
import com.jeremyakatsa.polishingskills.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
	@Autowired
	private UserRepository uRepo;
	@Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
	@Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if(this.uRepo.findByEmail(user.getEmail()) != null) {
        	errors.rejectValue("email", "Unique", "already taken");
        }
        
        if (!user.getPassword().equals(user.getPasswordConfirmation())) {
            errors.rejectValue("passwordConfirmation", "Unique", "Must Match Original Password");
        }  
        
      
    }
	

}
