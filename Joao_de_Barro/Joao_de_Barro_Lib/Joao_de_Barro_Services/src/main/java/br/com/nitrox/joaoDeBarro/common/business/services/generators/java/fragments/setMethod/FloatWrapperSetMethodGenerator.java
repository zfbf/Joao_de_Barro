package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class FloatWrapperSetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public FloatWrapperSetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public FloatWrapperSetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_FLOAT_WRAPPER_SET_METHOD;
	}
	
}
