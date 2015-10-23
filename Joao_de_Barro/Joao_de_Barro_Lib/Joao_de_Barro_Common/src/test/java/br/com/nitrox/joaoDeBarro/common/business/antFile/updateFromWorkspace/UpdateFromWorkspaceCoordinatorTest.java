package br.com.nitrox.joaoDeBarro.common.business.antFile.updateFromWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromWorkspace.UpdateFromWorkspaceCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class UpdateFromWorkspaceCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private UpdateFromWorkspaceCoordinator ufwCoordinator;
	private boolean toRun;
	
	
	public UpdateFromWorkspaceCoordinatorTest() {
		Log4jConfiguratorServiceLocator serviceLocator = 
				Log4jConfiguratorServiceLocator.getInstance();
		Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
		configurator.execute();
		toRun = toRun();
	}
	
	
	protected void setUp() throws Exception {
		if ( toRun ) {
			ufwCoordinator = new UpdateFromWorkspaceCoordinator();
		}
	}
	
	
	protected void tearDown() throws Exception {
		if ( toRun ) {
			ufwCoordinator = null;
		}
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		
		if ( toRun ) {
			boolean exceptionHasBeenLaunched = false;
			
			try {
				ufwCoordinator.generate();
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
