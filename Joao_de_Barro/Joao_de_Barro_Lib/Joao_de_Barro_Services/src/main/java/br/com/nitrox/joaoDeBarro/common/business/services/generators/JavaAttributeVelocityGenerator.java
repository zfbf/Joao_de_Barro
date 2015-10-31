package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.Writer;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;

public interface JavaAttributeVelocityGenerator extends VelocityGenerator {
	
	JavaAttribute getJavaAttribute();
	void setJavaAttribute( JavaAttribute javaAttribute );
	void setWriter( Writer writer );
	
}
