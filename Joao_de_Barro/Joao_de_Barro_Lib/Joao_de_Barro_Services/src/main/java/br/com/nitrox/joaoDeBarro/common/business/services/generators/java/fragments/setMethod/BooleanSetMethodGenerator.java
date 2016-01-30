package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class BooleanSetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public BooleanSetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public BooleanSetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_BOOLEAN_SET_METHOD;
	}
	
}
