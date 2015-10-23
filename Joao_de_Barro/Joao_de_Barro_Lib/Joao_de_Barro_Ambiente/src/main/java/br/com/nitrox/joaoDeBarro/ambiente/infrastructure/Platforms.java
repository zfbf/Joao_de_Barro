package br.com.nitrox.joaoDeBarro.ambiente.infrastructure;

public interface Platforms {
	
	int PLATFORM_WINDOWS_BAT = 1;
	int PLATFORM_WINDOWS_TWS = 2;
	int PLATFORM_TOMCAT = 3;
	int PLATFORM_WAS = 4;
	
	String PLATFORM_WINDOWS_BAT_NAME = "WINDOWS_BAT";
	String PLATFORM_WINDOWS_TWS_NAME = "WINDOWS_TWS";
	String PLATFORM_TOMCAT_NAME = "TOMCAT";
	String PLATFORM_WAS_NAME = "WAS";
	
	int[] PLATFORM_CODES = new int[] {
			PLATFORM_WINDOWS_BAT,
			PLATFORM_WINDOWS_TWS,
			PLATFORM_TOMCAT,
			PLATFORM_WAS
	};
	
	String[] PLATFORM_NAMES = new String[] {
			PLATFORM_WINDOWS_BAT_NAME,
			PLATFORM_WINDOWS_TWS_NAME,
			PLATFORM_TOMCAT_NAME,
			PLATFORM_WAS_NAME
	};
	
}
