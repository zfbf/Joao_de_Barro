package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class ToStringMethodGenerator extends AbstractJavaEntityGenerator {
	
	public ToStringMethodGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_TO_STRING_METHOD;
	}
	
}
