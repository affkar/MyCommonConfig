package exceptions;

import model.Project;

public class BuildFailureException extends Exception {

	public BuildFailureException(Project defaultProject, String message) {
		super("Can't build "+ defaultProject.getName() + " due to "+message);
	}

}
