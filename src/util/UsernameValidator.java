/**
 * 
 */
package util;

import java.util.regex.Pattern;

/**
 * @description:
 * @author: Admin
 * @time: 4:46:02 PM
 * @date: Apr 9, 2018
 */
public class UsernameValidator {
	private Pattern pattern;
	private static final String USERNAME_PATTERN = "^[a-z0-9._-]{3,15}$";

	public UsernameValidator() {
		pattern = Pattern.compile(USERNAME_PATTERN);
	}

	public boolean validate(final String username) {
		return pattern.matcher(username).matches();
	}
}
