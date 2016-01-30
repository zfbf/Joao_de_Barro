package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.getMethods;

import java.io.Writer;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JavaAttributeVelocityGenerator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public class GetMethodGeneratorHandler extends AbstractJoaoDeBarroLogger
		implements JavaAttributeTypes {
	private JavaAttributeVelocityGenerator commonGetMethodGenerator;
	private JavaAttributeVelocityGenerator dateGetMethodGenerator;
	private JavaAttributeVelocityGenerator booleanGetMethodGenerator;
	
	public GetMethodGeneratorHandler() {
		commonGetMethodGenerator = new CommonGetMethodGenerator();
		dateGetMethodGenerator = new DateGetMethodGenerator();
		booleanGetMethodGenerator = new BooleanGetMethodGenerator();
	}
	
	
	public void setWriter( Writer writer ) {
		commonGetMethodGenerator.setWriter( writer );
		dateGetMethodGenerator.setWriter( writer );
	}
	
	
	public void generate( JavaAttribute javaAttribute ) 
			throws ResourceNotFoundException {
		JavaAttributeVelocityGenerator generator = null;
		
		if ( javaAttribute != null ) {
			switch ( javaAttribute.getType() ) {
			case JAVA_ATTRIBUTE_TYPE_DATE:
				generator = dateGetMethodGenerator; 
				break;
				
			case JAVA_ATTRIBUTE_TYPE_BOOLEAN:
			case JAVA_ATTRIBUTE_TYPE_BOOLEAN_WRAPPER:
				generator = booleanGetMethodGenerator; 
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
