package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WidgetServiceTest {
	
	static WidgetService widgetService;
	
	@Test
	public void testNothingAssertTrue() {
		assertTrue(true);
	}
	
	@Before
	public void setUp() {
		widgetService = new WidgetService(new WidgetDaoMock());
	}
	
	@Test
	public void getFirstThreeWidgets() {
		List<Widget> firstThree = widgetService.getAllWidgets(3);
		assertTrue(
				firstThree.get(1).equals(new Widget("first")) &&
				firstThree.get(2).equals(new Widget("second")) &&
				firstThree.get(3).equals(new Widget("third"))
				);
	}
	
	@Test
	public void saveTwoWidgets() {
		List<Widget> widgets = new ArrayList<Widget>();
		widgets.add(new Widget("succeeding"));
		widgets.add(new Widget("succeeding"));
		List<Boolean> twoWidgetResult = widgetService.saveAllWidgets(
				widgets
				);
		assertTrue(
				twoWidgetResult.get(0) && twoWidgetResult.get(1)
				);
	}
	
	@Test
	public void addTwoWidgets() {
		Widget sumWidget = widgetService.widgetAddition(
				new Widget("partone"), new Widget("parttwo"));
		assertTrue(sumWidget.equals(new Widget("partoneparttwo")));
	}
	
	@Test
	public void addFourWidgets() {
		Widget sumWidget = widgetService.widgetAddition(
				new Widget("1"), new Widget("2"),
				new Widget("3"), new Widget("4")
				);
		assertTrue(sumWidget.equals(new Widget("1234")));
	}
	
	@After
	public void tearDown() {
		widgetService = null;
	}

}
