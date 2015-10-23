package br.com.nitrox.joaoDeBarro.common.business.generators;

import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;

public interface JavaAttributeVelocityGenerator extends VelocityGenerator {
	
	JavaAttribute getJavaAttribute();
	void setJavaAttribute( JavaAttribute javaAttribute );
	
}
