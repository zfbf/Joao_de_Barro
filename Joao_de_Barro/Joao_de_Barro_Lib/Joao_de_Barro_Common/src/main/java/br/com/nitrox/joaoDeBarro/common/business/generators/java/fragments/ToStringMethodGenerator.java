package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaEntityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;


public class ToStringMethodGenerator extends AbstractJavaEntityGenerator {
	
	public ToStringMethodGenerator( VelocityContext velocityContext, 
			Writer writer, JavaEntity javaEntity ) {
		super( velocityContext, writer, javaEntity );
	}
	
	
	public String getTemplateName() {
		return "java/fragments/toString_method.vm";
	}
	
}
