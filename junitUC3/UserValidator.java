package junitUC3;

import java.util.regex.Pattern;

public class UserValidator {

	 private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	    private static final String EMAIL_PATTERN="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

	    public boolean validateFirstName(String fname) {
	        Pattern pattern= Pattern.compile(FIRST_NAME_PATTERN);
	        return pattern.matcher(fname).matches();
	    }


	    public boolean validateLastName(String lname) {
	        Pattern pattern= Pattern.compile(LAST_NAME_PATTERN);
	        return pattern.matcher(lname).matches();
	    }

	    public boolean validateEmail(String email) {
	        Pattern pattern= Pattern.compile(EMAIL_PATTERN);
	        return pattern.matcher(email).matches();
}
}