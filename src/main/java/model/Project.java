package model;

import exceptions.BuildFailureException;
import exceptions.CantRemoveException;
import exceptions.CantSVNChecoutException;
import exceptions.CantSVNUpdateException;

public interface Project {

	void svnupdate() throws CantSVNUpdateException;

	void svncheckout() throws CantSVNChecoutException;

	void build() throws BuildFailureException;

	void buildWithoutTest() throws BuildFailureException;

	void cleanbuild() throws BuildFailureException;

	void cleanbuildWithoutTest() throws BuildFailureException;

	String getSVNLocationCurrent();

	String getSVNLocationParent();

	String getDirectory();

	String getBranch();

	void remove() throws CantRemoveException;

	String getName();

}
