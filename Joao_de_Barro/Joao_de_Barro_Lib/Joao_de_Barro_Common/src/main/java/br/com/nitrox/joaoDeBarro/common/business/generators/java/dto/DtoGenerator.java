package br.com.nitrox.joaoDeBarro.common.business.generators.java.dto;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaEntityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;


public class DtoGenerator extends AbstractJavaEntityGenerator {
	
	public DtoGenerator( VelocityContext velocityContext, 
			Writer writer, JavaEntity javaEntity ) {
		super( velocityContext, writer, javaEntity );
	}
	
	
	public String getTemplateName() {
		return "dto.vm";
	}
	
}
