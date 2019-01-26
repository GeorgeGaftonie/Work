package project.testController.actions;

import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Reading;

public class ViewProjectAction extends MenuItem {

	public ViewProjectAction() {
		super("5", "View Projects");
	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		for (Reading reading : database.getReadings())

		{
			System.out.println(reading);
		}
	}

}