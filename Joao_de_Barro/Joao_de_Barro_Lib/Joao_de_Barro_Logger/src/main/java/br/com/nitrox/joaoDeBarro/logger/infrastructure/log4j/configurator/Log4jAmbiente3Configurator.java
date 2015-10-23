package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;




public final class Log4jAmbiente3Configurator extends Log4jPropertiesFileConfigurator {
	private static Log4jAmbiente3Configurator instance;
	
	private Log4jAmbiente3Configurator() {
		super( "resources/properties/log4j/log4j_joao_de_barro_ambiente3.properties" );
		checkLogDirectory();
	}
	
	
	public static Log4jAmbiente3Configurator getInstance() {
		if ( instance == null ) {
			instance = new Log4jAmbiente3Configurator();
		}
		
		return instance;
	}
	
}
