package model.impl;

import java.io.IOException;

import model.Branch;
import model.Directory;
import model.Project;
import model.SVNLocations;
import exceptions.BuildFailureException;
import exceptions.CantRemoveException;
import exceptions.CantSVNChecoutException;
import exceptions.CantSVNUpdateException;

public class DefaultProject implements Project {

	private String name;
	private Branch currentBranch;
	private SVNLocations svnLocations;
	private Directory directory;

	public void svnupdate() throws CantSVNUpdateException {
		try {
			Runtime.getRuntime().exec(
					new String[] { "cd " + directory.getBase(),
							"svn co " + getSVNLocationCurrent() + " " + directory.getName() });
		} catch (IOException e) {
			throw new CantSVNUpdateException(this, e.getMessage());
		}

	}

	public void svncheckout() throws CantSVNChecoutException {
		// TODO Auto-generated method stub

	}

	public void build() throws BuildFailureException {
		try {
			Runtime.getRuntime().exec(
					new String[] { "cd " + getDirectory(), "mvn install" });
		} catch (IOException e) {
			throw new BuildFailureException(this, e.getMessage());
		}
	}

	public void buildWithoutTest() throws BuildFailureException {
		try {
			Runtime.getRuntime().exec(
					new String[] { "cd " + getDirectory(), "mvninstall" });
		} catch (IOException e) {
			throw new BuildFailureException(this, e.getMessage());
		}
	}

	public void cleanbuild() throws BuildFailureException {
		try {
			Runtime.getRuntime()
					.exec(new String[] { "cd " + getDirectory(),
							"mvn clean install" });
		} catch (IOException e) {
			throw new BuildFailureException(this, e.getMessage());
		}
	}

	public void cleanbuildWithoutTest() throws BuildFailureException {
		try {
			Runtime.getRuntime().exec(
					new String[] { "cd " + getDirectory(), "mvncleaninstall" });
		} catch (IOException e) {
			throw new BuildFailureException(this, e.getMessage());
		}
	}

	public String getSVNLocationCurrent() {
		return svnLocations.getCurrent();
	}

	public String getSVNLocationParent() {
		return svnLocations.getParent();
	}

	public String getDirectory() {
		return directory.getAbsolutePath();
	}

	public String getBranch() {
		return currentBranch.getBranchName();
	}

	public void remove() throws CantRemoveException {
		try {
			Runtime.getRuntime().exec("rm -r " + getDirectory());
		} catch (IOException e) {
			throw new CantRemoveException(this, e.getMessage());
		}
	}

	public String getName() {
		return name;
	}

}
