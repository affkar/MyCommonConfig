package exceptions;

import model.Project;

public class CantSVNUpdateException extends Exception {

	public CantSVNUpdateException(Project defaultProject, String message) {
		super("Can't update "+ defaultProject.getName() +"from svn location"+ defaultProject.getSVNLocationCurrent() +" due to "+message);
	}

}
