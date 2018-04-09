/**
 * 
 */
package start;

import util.PasswordValidator;
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
		
		
		
		PasswordValidator passwordValidator = new PasswordValidator(); 
        // true 
        System.out.println(passwordValidator.validate("Oxus20.2014")); 
        System.out.println(passwordValidator.validate("Oxus.20_14")); 
        System.out.println(passwordValidator.validate("OXUS20@Herat"));  
        System.out.println(passwordValidator.validate("Oxus20@2014"));
        // false
        System.out.println(passwordValidator.validate("Oxus202014"));  
        System.out.println(passwordValidator.validate("Oxus20")); 
        System.out.println(passwordValidator.validate("Oxus@20")); 
        System.out.println(passwordValidator.validate("Oxus20@"));  
	}
}
