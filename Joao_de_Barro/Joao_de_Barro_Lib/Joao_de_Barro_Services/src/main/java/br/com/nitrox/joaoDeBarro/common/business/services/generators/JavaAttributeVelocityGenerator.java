package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;

public interface JavaAttributeVelocityGenerator extends VelocityGenerator {
	
	JavaAttribute getJavaAttribute();
	void setJavaAttribute( JavaAttribute javaAttribute );
	
}
