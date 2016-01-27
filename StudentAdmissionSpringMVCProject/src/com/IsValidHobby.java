package com;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//public class IsValidHobby {
	@Documented
	@Constraint(validatedBy= HobbyValidator.class)
	@Target({ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface IsValidHobby{
		
		
		String message() default "Please provide a valid Hobby;"+
		"accepted hobbies are- Music, Fpptball, Cricket and Hockey (choose anyone)";
		Class<?>[] group()default{};
		Class<? extends Payload>[ ] payload()default{};
	

}
