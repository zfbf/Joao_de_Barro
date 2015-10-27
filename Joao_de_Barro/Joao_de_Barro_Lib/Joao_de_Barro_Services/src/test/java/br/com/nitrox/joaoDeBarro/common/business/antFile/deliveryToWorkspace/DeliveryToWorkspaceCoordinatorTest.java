package br.com.nitrox.joaoDeBarro.common.business.antFile.deliveryToWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToWorkspace.DeliveryToWorkspaceCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class DeliveryToWorkspaceCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private DeliveryToWorkspaceCoordinator dtwCoordinator;
	private boolean toRun;
	
	
	public DeliveryToWorkspaceCoordinatorTest() {
		Log4jConfiguratorServiceLocator serviceLocator = 
				Log4jConfiguratorServiceLocator.getInstance();
		Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
		configurator.execute();
		toRun = toRun();
	}
	
	
	protected void setUp() throws Exception {
		if ( toRun ) {
			dtwCoordinator = new DeliveryToWorkspaceCoordinator();
		}
	}
	
	
	protected void tearDown() throws Exception {
		if ( toRun ) {
			dtwCoordinator = null;
		}
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		
		if ( toRun ) {
			boolean exceptionHasBeenLaunched = false;
			
			try {
				dtwCoordinator.generate();
			} catch ( Exception e ) {
				exceptionHasBeenLaunched = true;
				e.printStackTrace();
			}
			
			assertFalse( exceptionHasBeenLaunched );
		} else {
			warnNotEllectedToRun( methodName );
		}
	}
}
