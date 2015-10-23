package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;

import java.io.IOException;



public abstract class AbstractLog4jDefaultConfigurator implements Log4jConfigurator {
	
	public void execute() {
		try {
			configureLogger();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	protected abstract void configureLogger() throws IOException;
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append( this.getClass().getName() );
		String filePropertyName = "log4j.appender.DailyRollingLogFile.File";
		String filePropertyValue = getPropertyValue( filePropertyName );
		sb.append( "\nProperty " ).append( filePropertyName );
		sb.append( ": " ).append( filePropertyValue );
		return sb.toString();
	}
	
}
