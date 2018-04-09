/**
 * 
 */
package util;

import java.util.regex.Pattern;

/**
 * @description:
 * @author: Admin
 * @time: 5:26:12 PM
 * @date: Apr 9, 2018
 */
public class PasswordValidator {
	private Pattern pattern;
	private static final String PASSWORD_PATTERN = "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})";

	public PasswordValidator() {
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}

	public boolean validate(final String password) {
		return pattern.matcher(password).matches();
	}
}
