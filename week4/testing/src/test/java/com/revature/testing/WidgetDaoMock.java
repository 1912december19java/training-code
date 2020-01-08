package com.revature.testing;

public class WidgetDaoMock implements WidgetDao {

	public Widget get(int id) {
		Widget out = null;
		switch (id) {
		case 1:
			out = new Widget("first");
			break;
		case 2:
			out = new Widget("second");
			break;
		case 3:
			out = new Widget("third");
			break;
		}
		return out;
	}

	public boolean save(Widget w) {
		boolean out = false;
		switch(w.getProperty()) {
		case "failing":
			out = false;
			break;
		case "succeeding":
			out = true;
			break;
		}
		return out;
	}

}
