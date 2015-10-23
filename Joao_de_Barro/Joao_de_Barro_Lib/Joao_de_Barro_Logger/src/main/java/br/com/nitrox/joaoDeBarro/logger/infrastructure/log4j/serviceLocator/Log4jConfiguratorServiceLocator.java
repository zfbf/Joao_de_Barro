package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambientes;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jAmbiente1Configurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jAmbiente2Configurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jAmbiente3Configurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jAmbiente4Configurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jDefaultConfigurator;

public final class Log4jConfiguratorServiceLocator implements Ambientes {
	private static Log4jConfiguratorServiceLocator instance;
	
	private Log4jConfiguratorServiceLocator() {
		super();
	}
	
	
	public static Log4jConfiguratorServiceLocator getInstance() {
		if ( instance == null ) {
			instance = new Log4jConfiguratorServiceLocator();
		}
		
		return instance;
	}
	
	
	public Log4jConfigurator getLog4jConfigurator() {
		Log4jConfigurator configurator = null;
		Ambiente ambiente = Ambiente.getInstance();
		int ambienteCode = ambiente.getAmbienteCode();
		
		switch ( ambienteCode ) {
		case AMBIENTE_CODE_1:
			configurator = Log4jAmbiente1Configurator.getInstance();
			break;
			
		case AMBIENTE_CODE_2:
			configurator = Log4jAmbiente2Configurator.getInstance();
			break;
			
		case AMBIENTE_CODE_3:
			configurator = Log4jAmbiente3Configurator.getInstance();
			break;
			
		case AMBIENTE_CODE_4:
			configurator = Log4jAmbiente4Configurator.getInstance();
			break;
			
		default:
			configurator = Log4jDefaultConfigurator.getInstance();
			break;
		}
		
		return configurator;
	}
	
}
