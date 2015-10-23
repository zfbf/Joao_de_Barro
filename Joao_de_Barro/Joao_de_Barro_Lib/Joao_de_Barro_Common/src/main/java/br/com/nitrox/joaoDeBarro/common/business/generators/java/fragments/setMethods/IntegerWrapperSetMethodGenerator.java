package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.setMethods;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaAttributeGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;


public class IntegerWrapperSetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public IntegerWrapperSetMethodGenerator( VelocityContext velocityContext, 
			Writer writer, JavaAttribute javaAttribute ) {
		super( velocityContext, writer, javaAttribute );
	}
	
	
	public IntegerWrapperSetMethodGenerator( VelocityContext velocityContext, 
			Writer writer ) {
		super( velocityContext, writer );
	}
	
	
	public String getTemplateName() {
		return "java/set_methods/integer_wrapper_set_method.vm";
	}
	
}
