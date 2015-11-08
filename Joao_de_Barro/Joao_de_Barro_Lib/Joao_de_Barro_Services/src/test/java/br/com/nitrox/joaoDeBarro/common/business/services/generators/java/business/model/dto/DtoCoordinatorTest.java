package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.business.model.dto;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.business.model.dto.DtoCoordinator;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityConstants;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class DtoCoordinatorTest extends AbstractJoaoDeBarroTestLogger
		implements JavaEntityConstants {
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
	
	
	public void testSave() {
		String methodName = "testSave";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		
		try {
			coordinator.resetBuffer();
			coordinator.generate();
			String content = coordinator.getWriter().toString();
			coordinator.save( content );
		} catch ( Exception e ) {
			error( methodName, e );
			exceptionHasBeenLaunched = true;
		}
		
		assertFalse( exceptionHasBeenLaunched );
	}
	
	
	private JavaEntity getJavaEntityRef1() {
		JavaEntity javaEntity = null;
		int javaEntityCode = JAVA_ENTITY_DATA_STAGING_HPD_HELP_DESK;
		JavaEntityDao javaEntityDao = new JavaEntityJavaCodeDao();
		javaEntity = javaEntityDao.getJavaEntity( javaEntityCode );
		return javaEntity;
	}
	
}
