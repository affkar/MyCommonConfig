package exceptions;

import model.Project;

public class CantRemoveException extends Exception {

	public CantRemoveException(Project defaultProject, String message) {
		super("Can't remove "+ defaultProject.getDirectory()+ " due to "+message);
	}

}
