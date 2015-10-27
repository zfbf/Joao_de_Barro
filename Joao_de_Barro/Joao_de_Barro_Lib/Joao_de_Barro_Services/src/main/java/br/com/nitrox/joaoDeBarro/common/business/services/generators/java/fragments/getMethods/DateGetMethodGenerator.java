package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.getMethods;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class DateGetMethodGenerator extends AbstractJavaAttributeGenerator {
	
	public DateGetMethodGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public DateGetMethodGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_DATE_GET_METHOD;
	}
	
}
