package exceptions;

import model.Project;

public class CantSVNChecoutException extends Exception {

	public CantSVNChecoutException(Project defaultProject, String message) {
		super("Can't checkout "+ defaultProject.getName() +" from svn location "+ defaultProject.getSVNLocationCurrent() +" due to "+message);
	}

}
