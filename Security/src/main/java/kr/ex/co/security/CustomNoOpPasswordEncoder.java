/**
 * 
 */
package kr.ex.co.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author jxt30
 *
 */
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

	private static final Logger logger = LoggerFactory.getLogger(CustomNoOpPasswordEncoder.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.security.crypto.password.PasswordEncoder#encode(java.lang.CharSequence)
	 */
	@Override
	public String encode(CharSequence rawPassword) {

		logger.warn("before encode :"+ rawPassword);
		return rawPassword.toString();
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.crypto.password.PasswordEncoder#matches(java.lang.CharSequence, java.lang.String)
	 */
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		logger.warn("matches: "+ rawPassword + ":" + encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}

}
