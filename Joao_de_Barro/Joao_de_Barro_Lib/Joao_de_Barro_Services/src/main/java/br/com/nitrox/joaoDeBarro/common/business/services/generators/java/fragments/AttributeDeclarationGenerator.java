package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class AttributeDeclarationGenerator extends AbstractJavaEntityGenerator {
	
	public AttributeDeclarationGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_ATTRIBUTE_DECLARATIONS;
	}
	
}
