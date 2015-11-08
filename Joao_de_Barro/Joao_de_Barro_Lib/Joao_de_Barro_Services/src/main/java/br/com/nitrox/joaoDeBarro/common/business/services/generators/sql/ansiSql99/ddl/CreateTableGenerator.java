package br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.ansiSql99.ddl;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class CreateTableGenerator extends AbstractJavaEntityGenerator {
	
	public CreateTableGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_SQL_ANSISQL99_CREATE_TABLE;
	}
	
}
