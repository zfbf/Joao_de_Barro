package br.com.nitrox.joaoDeBarro.common.business.antFile.updateFromVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromVersionControlDir.UpdateFromVersionControlDirCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class UpdateFromVersionControlDirCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private UpdateFromVersionControlDirCoordinator ufvcdCoordinator;
	private boolean toRun;
	
	
	public UpdateFromVersionControlDirCoordinatorTest() {
		Log4jConfiguratorServiceLocator serviceLocator = 
				Log4jConfiguratorServiceLocator.getInstance();
		Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
		configurator.execute();
		toRun = toRun();
	}
	
	
	protected void setUp() throws Exception {
		if ( toRun ) {
			ufvcdCoordinator = new UpdateFromVersionControlDirCoordinator();
		}
	}
	
	
	protected void tearDown() throws Exception {
		if ( toRun ) {
			ufvcdCoordinator = null;
		}
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		
		if ( toRun ) {
			boolean exceptionHasBeenLaunched = false;
			
			try {
				ufvcdCoordinator.generate();
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
