package br.com.nitrox.joaoDeBarro.business.model.factories;

import junit.framework.TestCase;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;

public class JavaAttributeFactoryTest extends TestCase
		implements JavaAttributeTypes {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testBuild() {
		String name = "";
		String columnName = "";
		int javaAttributeType = JAVA_ATTRIBUTE_TYPE_INT;
		String databaseType = "";
		boolean allowNull = false;
		boolean isIdentity = false;
		boolean isPk = false;
		String testValue = "";
		JavaAttribute javaAttribute = JavaAttributeFactory.build(
				name, columnName, javaAttributeType, databaseType, 
				allowNull, isIdentity, isPk, testValue );
		assertNotNull( javaAttribute );
	}
	
}
