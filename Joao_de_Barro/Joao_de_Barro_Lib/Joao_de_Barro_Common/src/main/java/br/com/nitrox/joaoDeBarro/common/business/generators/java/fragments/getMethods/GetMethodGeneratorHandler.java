package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.getMethods;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.JavaAttributeVelocityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public class GetMethodGeneratorHandler extends AbstractJoaoDeBarroLogger
		implements JavaAttributeTypes {
	private JavaAttributeVelocityGenerator commonGetMethodGenerator;
	private JavaAttributeVelocityGenerator dateGetMethodGenerator;
	
	public GetMethodGeneratorHandler( VelocityContext velocityContext, 
			Writer writer ) {
		commonGetMethodGenerator = new CommonGetMethodGenerator(
				velocityContext, 
				writer );
		
		dateGetMethodGenerator = new DateGetMethodGenerator(
				velocityContext, 
				writer );
	}
	
	
	public void generate( JavaAttribute javaAttribute ) 
			throws ResourceNotFoundException {
		JavaAttributeVelocityGenerator generator = null;
		
		if ( javaAttribute != null ) {
			switch ( javaAttribute.getJavaAttributeType() ) {
			case JAVA_ATTRIBUTE_TYPE_DATE:
				generator = dateGetMethodGenerator; 
				break;

			default:
				generator = commonGetMethodGenerator;
				break;
			}
			
			generator.setJavaAttribute( javaAttribute );
			generator.generate();
		}
	}
	
}
