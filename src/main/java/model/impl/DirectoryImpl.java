package model.impl;

import model.Directory;
import model.DirectoryBase;

public class DirectoryImpl implements Directory{

	private DirectoryBase base;
	private String name;
	
	public DirectoryImpl(DirectoryBase base, String name) {
		super();
		this.base = base;
		this.name = name;
	}

	public String getBase() {
		return base.getAbsolutePath();
	}

	public String getName() {
		return name;
	}

	public String getAbsolutePath() {
		return getBase()+"/"+getName();
	}

}
