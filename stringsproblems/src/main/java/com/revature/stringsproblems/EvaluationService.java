package com.revature.stringsproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvaluationService {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		System.out.println(acronym("      Portable    Network  Graphics"));
		System.out.println(getScrabbleScore("Cabbage"));
		System.out.println(cleanPhoneNumber("1 (634) 554 - 4928"));
	}
	
	/**
	 * 1. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public static String acronym(String phrase) {
		String[] splitPhrase = phrase.trim().split(" ");
		
		StringBuilder out = new StringBuilder();
		
		for(String stringPiece : splitPhrase) {
			if (stringPiece.length() > 0) {
				out.append(stringPiece.substring(0, 1));
			}
		}
		
		return out.toString();
	}

	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public static int getScrabbleScore(String string) {
		int score = 0;
		
		String[] myWord = string.toUpperCase().split("");
		
		for(int i=0;i<myWord.length;i++) {
			String myLetter = myWord[i];
			if(myLetter.matches("[AEIOULNRST]")) {
				score += 1;
			}
			if(myLetter.matches("[DG]")) {
				score += 2;
			}
			if(myLetter.matches("[BCMP]")) {
				score += 3;
			}
			//we'll stop here
		}
		
		for(char letter : string.toUpperCase().toCharArray()) {
			switch (letter) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'L':
			case 'N':
			case 'R':
			case 'S':
			case 'T':
				score += 1;
				break;
				
			case 'D':
			case 'G':
				score += 2;
				break;

			case 'B':
			case 'C':
			case 'M':
			case 'P':
				score += 3;
				break;
				
			default:
				break;
			}
		}
		
		return score;
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public static String cleanPhoneNumber(String string) {
		
		String cleanString = "";
		
		for(int i=0;i<string.length();i++) {
			int temp = string.charAt(i);
			//this condition returns false for all non numbers
			if(temp > 47 & temp < 58) {
				cleanString += string.charAt(i);
			}
		}
		
		if(cleanString.charAt(0) == '1') {
			cleanString = cleanString.substring(1);
		}
		
		return cleanString;
	}
	
	/**
	 * 4. String length workaround
	 * 
	 * This problem is a little different.  Write a method that
	 * returns the length of a String without ever calling 
	 * str.length().
	 * 
	 * Your solution may be messy.
	 */
	public int cheekyStringLength(String str) {
		
		if (str.equals("breakingstring")) {
			throw new UnsupportedOperationException();
		}
		
		return str.getBytes().length;
	}

}