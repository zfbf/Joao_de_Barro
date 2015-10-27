package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class IntegerWrapperSetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public IntegerWrapperSetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public IntegerWrapperSetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_INTEGER_WRAPPER_SET_METHOD;
	}
	
}
