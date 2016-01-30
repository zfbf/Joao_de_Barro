package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.getMethods;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class BooleanGetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public BooleanGetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public BooleanGetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_BOOLEAN_GET_METHOD;
	}
	
}
