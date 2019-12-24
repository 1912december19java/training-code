package com.revature.adventure.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.adventure.exceptions.InvalidOptionException;

/**
 * Represents a room in a Choose-Your-Own-Adventure.
 * 
 * Holds the text description of the room and available options
 * a user can take.
 * @author Revature
 */
public class Room {
	
	/**
	 * A set of uppercase Strings that contains all available options in this room.
	 */
	private Set<String> options;
	/**
	 * The text prompt associated with entering the room.
	 */
	private String prompt;
	
	public Room(Set<String> options, String prompt) {
		super();
		this.setOptions(options);
		this.prompt = prompt;
	}
	
	public String choose(String option) {
		if(isValidOption(option)) {
			return option;
		} else {
			throw new InvalidOptionException();
		}
	}
	
	public boolean isValidOption(String option) {
		return options.contains(option.toUpperCase());
	}

	public Set<String> getOptions() {
		return options;
	}

	/**
	 * Converts a list of options to all uppercase and sets them on the room.
	 * @param options
	 */
	public void setOptions(Set<String> options) {
		Set<String> uppercaseOptions = new HashSet<String>();
		for(String s : options) {
			uppercaseOptions.add(s.toUpperCase());
		}
		this.options = uppercaseOptions;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	@Override
	public String toString() {
		return "Room [options=" + options + ", prompt=" + prompt + "]";
	}

}
