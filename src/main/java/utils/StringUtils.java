package utils;

import java.io.File;

public class StringUtils {

	public static String concatenateWithSlash(String... args) {
		if(args==null || args.length==0){
			throw new IllegalArgumentException("args has to be atleast 1");
		}
		String concatenatedReturn="";
		for (int i = 0; i < args.length; i++) {
			concatenatedReturn+=addSlashIfNotLastCharacter(args[i]);
		}
		return concatenatedReturn;
	}
	
	public static String addSlashIfNotLastCharacter(String str){
		if(str==null){
			throw new IllegalArgumentException();
		}
		String lastCharAsString = str.substring(str.length()-1);
		if(lastCharAsString.equals("/") || lastCharAsString.equals(File.separator)){
			return str;
		}
		else return str+"/";
	}

	
	
}
