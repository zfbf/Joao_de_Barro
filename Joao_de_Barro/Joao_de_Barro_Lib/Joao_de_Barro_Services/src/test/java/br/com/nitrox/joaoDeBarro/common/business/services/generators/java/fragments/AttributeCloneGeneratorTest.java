package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityConstants;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class AttributeCloneGeneratorTest extends AbstractJoaoDeBarroTestLogger
		implements JoaoDeBarroVelocityConstants, JavaEntityConstants {
	private AttributeCloneGenerator attributeCloneGenerator;
	
	public AttributeCloneGeneratorTest() {
		Log4jConfiguratorServiceLocator.getInstance().getLog4jConfigurator().
				execute();	
	}
	
	
	protected void setUp() throws Exception {
		attributeCloneGenerator = new AttributeCloneGenerator( getJavaEntityRef1() );
	}
	
	
	protected void tearDown() throws Exception {
		attributeCloneGenerator = null;
	}
	
	
	public void testGetTemplateCode() {
		String methodName = "testGetTemplateName";
		debugInicioDoMetodo( methodName );
		
		int templateCode = attributeCloneGenerator.getTemplateCode();
		assertEquals( templateCode, TEMPLATE_ATTRIBUTE_CLONE );
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		
		try {
			attributeCloneGenerator.generate();
			attributeCloneGenerator.flush();
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
