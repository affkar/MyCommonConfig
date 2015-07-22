package model.impl;

import utils.StringUtils;
import model.Branch;

public class BranchImpl implements Branch{

	private String svnBase="http://someaddress/svnbase";
	private String branchName;

	public BranchImpl(String branchName) {
		super();
		this.branchName = branchName;
	}

	public BranchImpl(String svnBase, String branchName) {
		super();
		this.svnBase = svnBase;
		this.branchName = branchName;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getSVNAddress() {
		return StringUtils.concatenateWithSlash(svnBase,branchName);
	}

}
