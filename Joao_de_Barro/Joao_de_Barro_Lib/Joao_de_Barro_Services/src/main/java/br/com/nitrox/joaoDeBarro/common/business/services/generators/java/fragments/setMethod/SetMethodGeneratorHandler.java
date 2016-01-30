package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod;

import java.io.Writer;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JavaAttributeVelocityGenerator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public class SetMethodGeneratorHandler extends AbstractJoaoDeBarroLogger
		implements JavaAttributeTypes {
	private JavaAttributeVelocityGenerator commonSetMethodGenerator;
	private JavaAttributeVelocityGenerator floatWrapperSetMethodGenerator;
	private JavaAttributeVelocityGenerator integerWrapperSetMethodGenerator;
	private JavaAttributeVelocityGenerator booleanSetMethodGenerator;
	
	public SetMethodGeneratorHandler() {
		commonSetMethodGenerator = new CommonSetMethodGenerator();
		floatWrapperSetMethodGenerator = new FloatWrapperSetMethodGenerator();
		integerWrapperSetMethodGenerator = new IntegerWrapperSetMethodGenerator();
		booleanSetMethodGenerator = new BooleanSetMethodGenerator();
	}
	
	
	public void setWriter( Writer writer ) {
		commonSetMethodGenerator.setWriter( writer );
		floatWrapperSetMethodGenerator.setWriter( writer );
		integerWrapperSetMethodGenerator.setWriter( writer );
	}
	
	
	public void generate( JavaAttribute javaAttribute ) 
			throws ResourceNotFoundException {
		JavaAttributeVelocityGenerator generator = null;
		
		if ( javaAttribute != null ) {
			switch ( javaAttribute.getType() ) {
			case JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER:
				generator = floatWrapperSetMethodGenerator; 
				break;
				
			case JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER:
				generator = integerWrapperSetMethodGenerator; 
				break;
				
			case JAVA_ATTRIBUTE_TYPE_BOOLEAN:
			case JAVA_ATTRIBUTE_TYPE_BOOLEAN_WRAPPER:
				generator = booleanSetMethodGenerator; 
				break;
				
			default:
				generator = commonSetMethodGenerator;
				break;
			}
			
			generator.setJavaAttribute( javaAttribute );
			generator.generate();
		}
	}
	
}
