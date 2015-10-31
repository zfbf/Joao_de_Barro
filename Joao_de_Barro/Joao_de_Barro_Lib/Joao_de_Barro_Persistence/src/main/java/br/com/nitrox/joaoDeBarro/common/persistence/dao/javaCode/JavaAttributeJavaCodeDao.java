package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaAttributeDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdAuditLogSystemJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdHelpDeskJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.JavaAttributeJavaCodeUnit;

public class JavaAttributeJavaCodeDao implements JavaAttributeDao, JavaAttributeTypes {
	
	public JavaAttribute[] getJavaAttributes( String entityName ) {
		JavaAttribute[] javaAttributeArray = null;
		JavaAttributeJavaCodeUnit javaAttributeUnit = null;
		
		if ( entityName != null ) {
			if ( entityName.equalsIgnoreCase( "Data_Staging_Hpd_Help_Desk" )) {
				javaAttributeUnit = 
						new DataStagingHpdHelpDeskJavaAttributesJavaCode();
			} else if ( entityName.equalsIgnoreCase( "data_staging_hpd_audit_log_system" )) {
				javaAttributeUnit = 
						new DataStagingHpdAuditLogSystemJavaAttributesJavaCode();
			}
			
			javaAttributeArray = javaAttributeUnit.getJavaAttributes();
		}
		
		return javaAttributeArray;
	}
	
}
