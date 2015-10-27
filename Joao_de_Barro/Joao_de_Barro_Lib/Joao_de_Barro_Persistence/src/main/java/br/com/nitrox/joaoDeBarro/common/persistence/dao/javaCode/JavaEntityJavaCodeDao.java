package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdHelpDeskJavaAttributeJavaCode;

public class JavaEntityJavaCodeDao implements JavaEntityDao, JavaAttributeTypes {
	
	public JavaEntity getJavaEntity( String entityName ) {
		JavaEntity javaEntity = null;
		
		if ( entityName != null ) {
			if ( entityName.equalsIgnoreCase( "data_staging_hpd_help_desk" )) {
				javaEntity = new JavaEntity();
				javaEntity.setJavaEntityName( entityName );
				javaEntity.setDatabaseTableName( "CAD_REMEDY_HPD_HELP_DESK" );
				
				DataStagingHpdHelpDeskJavaAttributeJavaCode javaAttributesHardCode = 
						new DataStagingHpdHelpDeskJavaAttributeJavaCode();
				javaEntity.setJavaAttributes( javaAttributesHardCode.
						getJavaAttributes() );
			}
		}
		
		return javaEntity;
	}
	
}
