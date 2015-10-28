package br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.sqlServer.storedProcedures;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class SqlServerStoredProcedureInsertGenerator extends AbstractJavaEntityGenerator {
	
	public SqlServerStoredProcedureInsertGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_SQL_SQLSERVER_INSERT_STOREDPROCEDURE;
	}
	
}
