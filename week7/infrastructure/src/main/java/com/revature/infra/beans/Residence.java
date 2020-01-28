package com.revature.infra.beans;

/**
 * A residence that requires resources to function
 * @author Revature
 *
 */
public abstract class Residence {

	/**
	 * The name of the residence
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
