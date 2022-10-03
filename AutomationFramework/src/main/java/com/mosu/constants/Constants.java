package com.mosu.constants;

public final class Constants {

	private Constants() {
		
	}

private static final String CONFIGFILEPATH=System.getProperty("user.dir")+"/src/test/resources/config/config.properties";

public static String getConfigFilePath() {
	return CONFIGFILEPATH;
}

}
