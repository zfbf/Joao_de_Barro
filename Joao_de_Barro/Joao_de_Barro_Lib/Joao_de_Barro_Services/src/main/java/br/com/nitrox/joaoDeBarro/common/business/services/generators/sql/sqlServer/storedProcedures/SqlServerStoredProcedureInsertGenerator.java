package br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.sqlServer.storedProcedures;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaAttributeGenerator;


public class SqlServerStoredProcedureInsertGenerator extends AbstractJavaAttributeGenerator {
	
	public SqlServerStoredProcedureInsertGenerator( JavaAttribute javaAttribute ) {
		super( javaAttribute );
	}
	
	
	public SqlServerStoredProcedureInsertGenerator() {
		;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_COMMON_SET_METHOD;
	}
	
}
