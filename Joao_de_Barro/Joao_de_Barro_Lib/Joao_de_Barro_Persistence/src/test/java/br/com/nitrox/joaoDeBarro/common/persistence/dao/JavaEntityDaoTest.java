package br.com.nitrox.joaoDeBarro.common.persistence.dao;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class JavaEntityDaoTest extends AbstractJoaoDeBarroTestLogger {
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
		
		String javaEntityName = "data_staging_hpd_help_desk";
		JavaEntity javaEntity = javaEntityDao.getJavaEntity( javaEntityName );
		assertNotNull( javaEntity );
		assertTrue( javaEntity.getJavaEntityName().equals( javaEntityName ));
		debug( methodName, "javaEntity", javaEntity );
	}
	
}
