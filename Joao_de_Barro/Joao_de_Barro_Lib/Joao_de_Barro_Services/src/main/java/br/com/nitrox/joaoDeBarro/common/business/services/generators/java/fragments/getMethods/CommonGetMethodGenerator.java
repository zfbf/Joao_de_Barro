package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.getMethods;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class CommonGetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public CommonGetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public CommonGetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_COMMON_GET_METHOD;
	}
	
}
