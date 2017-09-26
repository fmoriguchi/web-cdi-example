/**
 * 
 */
package com.fmoriguchi.test;

import javax.inject.Named;

/**
 * @author japa
 *
 */
@Named
public class TestMessage implements Message {

	public String message() {
		return "Hello CDI!";
	}
}
