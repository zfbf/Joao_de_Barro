package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;



public interface Log4jConfigurator {
	
	void execute();
	String getPropertyValue( String key );
	String toString();
	
}
