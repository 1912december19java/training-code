package com.revature.stringsproblems;

//canonical JUnit Assert import
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvaluationServiceTest {
	
	private static EvaluationService evaluationService;
	
	@Test
	public void acronymReturnsPng() {
		String output = EvaluationService.acronym("Portable Network Graphics");
		assertTrue(output.equals("PNG"));
	}
	
	@Test
	public void acronymHandlesCapitalization() {
		String output =  EvaluationService.acronym("portable network graphics");
		assertTrue(output.equals("PNG"));
	}
	
	@Test
	public void scrabbleScoreTalliesCabbage() {
		int output = EvaluationService.getScrabbleScore("Cabbage");
		assertEquals(output, 14);
	}
	
	@Test
	public void stringLengthCountsHello() {
		int output = evaluationService.cheekyStringLength("Hello");
		assertTrue(output == 5);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void breakingStringThrowsException() {
		int output = evaluationService.cheekyStringLength("breakingstring");
	}
	
	@Before
	public void setUp() {
		evaluationService = new EvaluationService();
	}
	
	@After
	public void tearDown() {
		evaluationService = null;
	}	
	
}
