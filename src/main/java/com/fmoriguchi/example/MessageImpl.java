package com.fmoriguchi.example;

import javax.inject.Named;

/**
 * @author fmoriguchi
 *
 */
@Named
public class MessageImpl implements Message {

	public String message() {
		return "Hello CDI !";
	}
}
