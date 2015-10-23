package br.com.nitrox.joaoDeBarro.common.business.antFile.createWorkspaceDirectories;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.createWorkspaceDirectories.CreateWorkspaceDirectoriesCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class CreateWorkspaceDirectoriesCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private CreateWorkspaceDirectoriesCoordinator cwdCoordinator;
	private boolean toRun;
	
	
	public CreateWorkspaceDirectoriesCoordinatorTest() {
		Log4jConfiguratorServiceLocator serviceLocator = 
				Log4jConfiguratorServiceLocator.getInstance();
		Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
		configurator.execute();
		toRun = toRun();
	}
	
	
	protected void setUp() throws Exception {
		if ( toRun ) {
			cwdCoordinator = new CreateWorkspaceDirectoriesCoordinator();
		}
	}
	
	
	protected void tearDown() throws Exception {
		if ( toRun ) {
			cwdCoordinator = null;
		}
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		
		if ( toRun ) {
			boolean exceptionHasBeenLaunched = false;
			
			try {
				cwdCoordinator.generate();
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
