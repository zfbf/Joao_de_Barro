package br.com.nitrox.joaoDeBarro.infrastructure.util;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;
import br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j.AbstractJoaoDeBarroTestLogger;

public class NameStyleFormatterTest extends AbstractJoaoDeBarroTestLogger {
	
	public NameStyleFormatterTest() {
		Log4jConfiguratorServiceLocator.getInstance().
				getLog4jConfigurator().execute();
	}
	
	
	public void testToAttributeStyle() {
		String methodName = "testToAttributeStyle";
		debugInicioDoMetodo( methodName );
		
		String name = "test_to_attribute_style";
		String targetName = "testToAttributeStyle";
		String result = NameStyleFormatter.toAttributeStyle( name );
		
		debug( methodName, "result", result );
		assertTrue( result.equals( targetName ));
	}
	
	
	public void testToClassStyle() {
		String methodName = "testToClassStyle";
		debugInicioDoMetodo( methodName );
		
		String name = "name_style_formatter_test";
		String targetName = "NameStyleFormatterTest";
		String result = NameStyleFormatter.toClassStyle( name );
		
		debug( methodName, "result", result );
		assertTrue( result.equals( targetName ));
	}
	
}
