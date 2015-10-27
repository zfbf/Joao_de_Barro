package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class CommonSetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public CommonSetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public CommonSetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_COMMON_SET_METHOD;
	}
	
}
