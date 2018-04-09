/**
 * 
 */
package start;

import util.UsernameValidator;

/**
 * @description:
 * @author: Admin
 * @time: 4:43:45 PM
 * @date: Apr 9, 2018
 */
public class main {
	public static void main(String[] args) {
		UsernameValidator validator = new UsernameValidator();
		// true
		System.out.println(validator.validate("absherzad"));
		System.out.println(validator.validate("ab.sherzad"));
		System.out.println(validator.validate("ab-sherzad"));
		System.out.println(validator.validate("ab_sherzad"));
		System.out.println(validator.validate("oxus20"));
		System.out.println(validator.validate("ars"));
		// false
		System.out.println(validator.validate("Absherzad"));
		System.out.println(validator.validate("ab sherzad"));
		System.out.println(validator.validate("ab"));
		System.out.println(validator.validate("abdulrahmansherzad"));
	}
}
