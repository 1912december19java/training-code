package com.revature.testing;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class we're going to test.  Its typical to test
 * service methods.
 * @author Revature
 *
 */
public class WidgetService {
	
	private WidgetDao widgetDao;
	
	public WidgetService(WidgetDao widgetDao) {
		this.widgetDao = widgetDao;
	}
	
	public WidgetDao getWidgetDao() {
		return widgetDao;
	}

	public void setWidgetDao(WidgetDao widgetDao) {
		this.widgetDao = widgetDao;
	}

	public List<Widget> getAllWidgets(int maxId) {
		List<Widget> widgets = new ArrayList<Widget>();
		for(int i=0;i<=maxId;i++) {
			widgets.add(widgetDao.get(i));
		}
		return widgets;
	}
	
	public List<Boolean> saveAllWidgets(List<Widget> widgets) {
		List<Boolean> results = new ArrayList<Boolean>();
		for(Widget w : widgets) {
			results.add(widgetDao.save(w));
		}
		return results;
	}
	
	/**
	 * Creates a new widget with the concatenated properties of
	 * passed in widgets. Passed in widgets use varargs, so we
	 * can pass in as many widgets as we like.
	 * @return
	 */
	public Widget widgetAddition(Widget... widgets) {
		StringBuilder sumProperties = new StringBuilder();
		for(Widget w : widgets) {
			sumProperties.append(w.getProperty());
		}
		return new Widget(sumProperties.toString());
	}

}
