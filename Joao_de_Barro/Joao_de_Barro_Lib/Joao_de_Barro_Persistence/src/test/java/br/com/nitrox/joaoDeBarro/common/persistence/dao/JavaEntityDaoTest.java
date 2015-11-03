package br.com.nitrox.joaoDeBarro.common.persistence.dao;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityConstants;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class JavaEntityDaoTest extends AbstractJoaoDeBarroTestLogger
		implements JavaEntityConstants {
	private JavaEntityDao javaEntityDao;
	
	public JavaEntityDaoTest() {
		Log4jConfiguratorServiceLocator.getInstance().
				getLog4jConfigurator().execute();
	}
	
	
	protected void setUp() throws Exception {
		javaEntityDao = new JavaEntityJavaCodeDao();
	}
	
	
	protected void tearDown() throws Exception {
		javaEntityDao = null;
	}
	
	
	public void testGetJavaEntity() {
		String methodName = "testGetJavaEntity";
		debugInicioDoMetodo( methodName );
		
		int javaEntityCode = JAVA_ENTITY_DATA_STAGING_HPD_HELP_DESK;
		JavaEntity javaEntity = javaEntityDao.getJavaEntity( javaEntityCode );
		assertNotNull( javaEntity );
		assertTrue( javaEntity.getName().equals( JAVA_ENTITY_NAME_DATA_STAGING_HPD_HELP_DESK ));
		debug( methodName, "javaEntity", javaEntity );
	}
	
	
	public void testGetJavaEntities() {
		String methodName = "testGetJavaEntities";
		debugInicioDoMetodo( methodName );
		
		int[] javaEntitiesCode = JAVA_ENTITY_CODE_ARRAY;
		int tam = javaEntitiesCode.length;
		JavaEntity[] javaEntities = javaEntityDao.getJavaEntities();
		assertNotNull( javaEntities );
		assertEquals( tam,  javaEntities.length );
		
		for ( int i = 0; i < tam; i++ ) {
			debug( methodName, "javaEntity[" + i + "].getName()", javaEntities[i].getName() );
		}
	}
	
}
