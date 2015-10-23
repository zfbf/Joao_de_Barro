package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import junit.framework.TestCase;

public class Log4jConfiguratorServiceLocatorTest extends TestCase {
	private Log4jConfiguratorServiceLocator log4jConfiguratorSL;
	
	protected void setUp() throws Exception {
		log4jConfiguratorSL = Log4jConfiguratorServiceLocator.getInstance();
	}
	
	
	protected void tearDown() throws Exception {
		log4jConfiguratorSL = null;
	}
	
	
	public void testGetLog4jConfigurator() {
		Log4jConfigurator log4jConfigurator = log4jConfiguratorSL.getLog4jConfigurator();
		assertNotNull( log4jConfigurator );
		
		if ( log4jConfigurator != null ) {
			log4jConfigurator.execute();
			System.out.println( log4jConfigurator );	
		}
	}
	
}
