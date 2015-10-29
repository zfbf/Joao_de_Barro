package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class AnsiSql99DaoCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private AnsiSql99DaoCoordinator coordinator;
	
	public AnsiSql99DaoCoordinatorTest() {
		Log4jConfiguratorServiceLocator.getInstance().getLog4jConfigurator().
				execute();
	}
	
	
	protected void setUp() throws Exception {
		coordinator = new AnsiSql99DaoCoordinator( getJavaEntityRef1() );
	}
	
	
	protected void tearDown() throws Exception {
		coordinator = null;
	}
	
	
	public void testGetJavaEntity() {
		String methodName = "testGetJavaEntity";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		JavaEntity javaEntity = null;
		
		try {
			javaEntity = coordinator.getJavaEntity();
			assertNotNull( javaEntity );
		} catch ( Exception e ) {
			debug( methodName, "javaEntity", javaEntity );
			error( methodName, e );
			exceptionHasBeenLaunched = true;
		}
		
		assertFalse( exceptionHasBeenLaunched );
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		
		try {
			coordinator.generate();	
		} catch ( Exception e ) {
			error( methodName, e );
			exceptionHasBeenLaunched = true;
		}
		
		assertFalse( exceptionHasBeenLaunched );
	}
	
	
	private JavaEntity getJavaEntityRef1() {
		JavaEntity javaEntity = null;
		String entityName = "data_staging_hpd_help_desk";
		JavaEntityDao javaEntityDao = new JavaEntityJavaCodeDao();
		javaEntity = javaEntityDao.getJavaEntity( entityName );
		return javaEntity;
	}
	
}
