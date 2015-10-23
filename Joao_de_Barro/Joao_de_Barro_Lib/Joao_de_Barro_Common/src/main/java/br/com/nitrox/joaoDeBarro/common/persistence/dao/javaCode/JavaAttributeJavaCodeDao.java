package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode;

import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaAttributeDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdHelpDeskJavaAttributeJavaCode;

public class JavaAttributeJavaCodeDao implements JavaAttributeDao, JavaAttributeTypes {
	
	public JavaAttribute[] getJavaAttributes( String entityName ) {
		JavaAttribute[] javaAttributeArray = null;
		
		if ( entityName != null ) {
			if ( entityName.equalsIgnoreCase( "Data_Staging_Hpd_Help_Desk" )) {
				DataStagingHpdHelpDeskJavaAttributeJavaCode javaAttributesHardCode = 
						new DataStagingHpdHelpDeskJavaAttributeJavaCode();
				javaAttributeArray = javaAttributesHardCode.getJavaAttributes();
			}
		}
		
		return javaAttributeArray;
	}
	
}
