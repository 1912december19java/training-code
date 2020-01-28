package com.revature.infra.beans;

public class Cabin extends Residence {
	
	private Well well;
	
	public Well getWell() {
		return well;
	}

	public void setWell(Well well) {
		this.well = well;
	}

	public void checkStatus() {
		System.out.println("Here's the state of things in " + this.getName());
		if(this.well == null) {
			System.out.println("No well is associated with this Cabin");
		} else if(this.well.hasResource()) {
			System.out.println("This house is receiving " + this.well.getResource());
		} else {
			System.out.println("A well exists but doesn't contain water");
		}
	}

}
