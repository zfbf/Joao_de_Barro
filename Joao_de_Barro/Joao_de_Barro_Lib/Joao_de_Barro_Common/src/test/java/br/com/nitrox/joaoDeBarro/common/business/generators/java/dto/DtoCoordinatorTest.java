package br.com.nitrox.joaoDeBarro.common.business.generators.java.dto;

import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class DtoCoordinatorTest extends AbstractJoaoDeBarroTestLogger {
	private DtoCoordinator coordinator;
	
	public DtoCoordinatorTest() {
		Log4jConfiguratorServiceLocator.getInstance().getLog4jConfigurator().
				execute();
	}
	
	
	protected void setUp() throws Exception {
		coordinator = new DtoCoordinator( getJavaEntityRef1() );
	}
	
	
	protected void tearDown() throws Exception {
		coordinator = null;
	}
	
	
	public void testGetJavaEntity() {
		String methodName = "testGetJavaEntity";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		
		try {
			JavaEntity javaEntity = coordinator.getJavaEntity();
			assertNotNull( javaEntity );
			debug( methodName, "javaEntity", javaEntity );
		} catch ( Exception e ) {
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
