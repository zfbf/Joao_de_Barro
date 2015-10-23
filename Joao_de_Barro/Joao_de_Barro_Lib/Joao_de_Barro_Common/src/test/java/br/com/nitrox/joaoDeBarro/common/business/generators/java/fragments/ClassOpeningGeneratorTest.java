package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class ClassOpeningGeneratorTest extends AbstractJoaoDeBarroTestLogger {
	private ClassOpeningGenerator classOpeningGenerator;
	
	public ClassOpeningGeneratorTest() {
		Log4jConfiguratorServiceLocator.getInstance().getLog4jConfigurator().
				execute();	
	}
	
	
	protected void setUp() throws Exception {
		Properties p = new Properties();
		p.setProperty( "directive.foreach.counter.name", "velocityCount" );
		p.setProperty( "directive.foreach.counter.initial.value", "0" );
		p.setProperty( "file.resource.loader.path", Ambiente.getInstance().getWorkDir() );
		
		Velocity.init( p );
		VelocityContext velocityContext = new VelocityContext();
		
		Writer writer = new BufferedWriter( new OutputStreamWriter( 
				System.out ));
		
		classOpeningGenerator = new ClassOpeningGenerator( velocityContext, 
				writer, getJavaEntityRef1() );
	}
	
	
	protected void tearDown() throws Exception {
		classOpeningGenerator = null;
	}
	
	
	public void testGetTemplateName() {
		String methodName = "testGetTemplateName";
		debugInicioDoMetodo( methodName );
		
		String templateName = classOpeningGenerator.getTemplateName();
		assertNotNull( templateName );
		assertTrue( templateName.equals( "class_opening.vm" ));
	}
	
	
	public void testGenerate() {
		String methodName = "testGenerate";
		debugInicioDoMetodo( methodName );
		boolean exceptionHasBeenLaunched = false;
		
		try {
			classOpeningGenerator.setSufix( "Dto" );
			classOpeningGenerator.generate();
			classOpeningGenerator.flush();
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
