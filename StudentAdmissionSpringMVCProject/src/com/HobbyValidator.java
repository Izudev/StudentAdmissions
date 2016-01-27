package com;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	@Override
	public void initialize(IsValidHobby arg0) {
		
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		
		if(studentHobby==null){
			
			return false;
		}  else if(studentHobby.matches("Music|Football|Socer")){
			
			return true;
			
		}else{
		
		return false;
		}
	}

	}
