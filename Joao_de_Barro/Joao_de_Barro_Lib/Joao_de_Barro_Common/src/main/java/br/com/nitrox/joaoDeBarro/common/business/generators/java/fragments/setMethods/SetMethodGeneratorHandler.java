package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.setMethods;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.JavaAttributeVelocityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public class SetMethodGeneratorHandler extends AbstractJoaoDeBarroLogger
		implements JavaAttributeTypes {
	private JavaAttributeVelocityGenerator commonSetMethodGenerator;
	private JavaAttributeVelocityGenerator floatWrapperSetMethodGenerator;
	private JavaAttributeVelocityGenerator integerWrapperSetMethodGenerator;
	
	public SetMethodGeneratorHandler( VelocityContext velocityContext, 
			Writer writer ) {
		commonSetMethodGenerator = new CommonSetMethodGenerator(
				velocityContext, 
				writer );
		
		floatWrapperSetMethodGenerator = new FloatWrapperSetMethodGenerator(
				velocityContext, 
				writer );
		
		integerWrapperSetMethodGenerator = new IntegerWrapperSetMethodGenerator(
				velocityContext, 
				writer );
	}
	
	
	public void generate( JavaAttribute javaAttribute ) 
			throws ResourceNotFoundException {
		JavaAttributeVelocityGenerator generator = null;
		
		if ( javaAttribute != null ) {
			switch ( javaAttribute.getJavaAttributeType() ) {
			case JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER:
				generator = floatWrapperSetMethodGenerator; 
				break;
				
			case JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER:
				generator = integerWrapperSetMethodGenerator; 
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
