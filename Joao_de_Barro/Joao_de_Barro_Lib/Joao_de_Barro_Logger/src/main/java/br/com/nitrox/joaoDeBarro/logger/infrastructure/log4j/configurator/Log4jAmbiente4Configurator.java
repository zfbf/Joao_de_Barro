package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;




public final class Log4jAmbiente4Configurator extends Log4jPropertiesFileConfigurator {
	private static Log4jAmbiente4Configurator instance;
	
	private Log4jAmbiente4Configurator() {
		super( "resources/properties/log4j/log4j_joao_de_barro_ambiente4.properties" );
		checkLogDirectory();
	}
	
	
	public static Log4jAmbiente4Configurator getInstance() {
		if ( instance == null ) {
			instance = new Log4jAmbiente4Configurator();
		}
		
		return instance;
	}
	
}
