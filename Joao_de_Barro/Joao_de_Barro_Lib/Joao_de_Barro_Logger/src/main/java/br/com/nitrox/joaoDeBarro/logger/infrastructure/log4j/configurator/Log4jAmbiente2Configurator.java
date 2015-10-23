package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;




public final class Log4jAmbiente2Configurator extends Log4jPropertiesFileConfigurator {
	private static Log4jAmbiente2Configurator instance;
	
	private Log4jAmbiente2Configurator() {
		super( "resources/properties/log4j/log4j_joao_de_barro_ambiente2.properties" );
		checkLogDirectory();
	}
	
	
	public static Log4jAmbiente2Configurator getInstance() {
		if ( instance == null ) {
			instance = new Log4jAmbiente2Configurator();
		}
		
		return instance;
	}
	
}
