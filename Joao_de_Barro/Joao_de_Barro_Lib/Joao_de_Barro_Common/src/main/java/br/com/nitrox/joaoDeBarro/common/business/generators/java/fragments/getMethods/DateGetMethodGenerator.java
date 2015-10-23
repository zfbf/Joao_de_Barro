package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.getMethods;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaAttributeGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;


public class DateGetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public DateGetMethodGenerator( VelocityContext velocityContext, 
			Writer writer, JavaAttribute javaAttribute ) {
		super( velocityContext, writer, javaAttribute );
	}
	
	
	public DateGetMethodGenerator( VelocityContext velocityContext, 
			Writer writer ) {
		super( velocityContext, writer );
	}
	
	
	public String getTemplateName() {
		return "java/get_methods/date_get_method.vm";
	}
	
}
