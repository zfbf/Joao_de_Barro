package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;




public final class Log4jAmbiente1Configurator extends Log4jPropertiesFileConfigurator {
	private static Log4jAmbiente1Configurator instance;
	
	private Log4jAmbiente1Configurator() {
		super( "resources/properties/log4j/log4j_joao_de_barro_ambiente1.properties" );
		checkLogDirectory();
	}
	
	
	public static Log4jAmbiente1Configurator getInstance() {
		if ( instance == null ) {
			instance = new Log4jAmbiente1Configurator();
		}
		
		return instance;
	}
	
}
