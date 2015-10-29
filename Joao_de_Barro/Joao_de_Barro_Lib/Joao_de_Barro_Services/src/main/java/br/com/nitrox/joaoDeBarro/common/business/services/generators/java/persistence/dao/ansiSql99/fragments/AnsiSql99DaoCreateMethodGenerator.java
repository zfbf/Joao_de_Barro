package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class AnsiSql99DaoCreateMethodGenerator extends AbstractJavaEntityGenerator {
	
	public AnsiSql99DaoCreateMethodGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_DAO_ANSISQL99_CREATE_METHOD;
	}
	
}
