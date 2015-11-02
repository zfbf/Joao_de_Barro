package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class AnsiSql99DaoTruncateMethodGenerator extends AbstractJavaEntityGenerator {
	
	public AnsiSql99DaoTruncateMethodGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_DAO_ANSISQL99_TRUNCATE_METHOD;
	}
	
}
