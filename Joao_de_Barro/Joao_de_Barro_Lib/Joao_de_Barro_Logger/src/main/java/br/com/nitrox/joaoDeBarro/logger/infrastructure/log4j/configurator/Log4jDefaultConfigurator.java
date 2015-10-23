package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;



public final class Log4jDefaultConfigurator extends AbstractLog4jDefaultConfigurator {
	private static Log4jDefaultConfigurator instance;
	
	private Log4jDefaultConfigurator() {
		super();
	}
	
	
	public static Log4jDefaultConfigurator getInstance() {
		if ( instance == null ) {
			instance = new Log4jDefaultConfigurator();
		}
		
		return instance;
	}
	
	
	protected void configureLogger() throws IOException {
		BasicConfigurator.configure();
	}
	
	
	public String getPropertyValue( String key ) {
		return null;
	}
	
}
