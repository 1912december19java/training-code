package com.revature.testing;

public interface WidgetDao {
	
	/**
	 * Gwets a widget by id
	 * @param id
	 * @return
	 */
	Widget get(int id);
	
	/**
	 * Returns true or false based on successful saving
	 * @param w
	 * @return
	 */
	boolean save(Widget w);
	
}
