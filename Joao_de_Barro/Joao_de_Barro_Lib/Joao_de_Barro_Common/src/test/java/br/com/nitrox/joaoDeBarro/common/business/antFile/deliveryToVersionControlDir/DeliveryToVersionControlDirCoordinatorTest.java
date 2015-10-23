package br.com.nitrox.joaoDeBarro.common.business.antFile.deliveryToVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToVersionControlDir.DeliveryToVersionControlDirCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class DeliveryToVersionControlDirCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private DeliveryToVersionControlDirCoordinator dtvcdCoordinator;
	private boolean toRun;
	
	
	public DeliveryToVersionControlDirCoordinatorTest() {
		Log4jConfiguratorServiceLocator serviceLocator = 
				Log4jConfiguratorServiceLocator.getInstance();
		Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
		configurator.execute();
		toRun = toRun();
	}
	
	
	protected void setUp() throws Exception {
		if ( toRun ) {
			dtvcdCoordinator = new DeliveryToVersionControlDirCoordinator();
		}
	}
	
	
	protected void tearDown() throws Exception {
		if ( toRun ) {
			dtvcdCoordinator = null;
		}
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		
		if ( toRun ) {
			boolean exceptionHasBeenLaunched = false;
			
			try {
				dtvcdCoordinator.generate();
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
