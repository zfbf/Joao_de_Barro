package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdHelpDeskJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.SolicitacaoJavaAttributesJavaCode;

public class JavaEntityJavaCodeDao implements JavaEntityDao, JavaAttributeTypes {
	
	public JavaEntity getJavaEntity( String entityName ) {
		JavaEntity javaEntity = null;
		
		if ( entityName != null ) {
			if ( entityName.equalsIgnoreCase( "data_staging_hpd_help_desk" )) {
				javaEntity = new JavaEntity();
				javaEntity.setName( entityName );
				javaEntity.setDatabaseTableName( "CAD_REMEDY_HPD_HELP_DESK" );
				
				DataStagingHpdHelpDeskJavaAttributesJavaCode javaAttributesHardCode = 
						new DataStagingHpdHelpDeskJavaAttributesJavaCode();
				javaEntity.setJavaAttributes( javaAttributesHardCode.
						getJavaAttributes() );
			} else if ( entityName.equalsIgnoreCase( "solicitacao" )) {
				javaEntity = new JavaEntity();
				javaEntity.setName( entityName );
				javaEntity.setDatabaseTableName( "CAD_SOLIC_TI" );
				
				SolicitacaoJavaAttributesJavaCode javaAttributesHardCode = 
						new SolicitacaoJavaAttributesJavaCode();
				javaEntity.setJavaAttributes( javaAttributesHardCode.
						getJavaAttributes() );
			}
		}
		
		return javaEntity;
	}
	
	
	public JavaEntity[] getJavaEntities() {
		JavaEntity[] javaEntities = new JavaEntity[] {
				getJavaEntity( "data_staging_hpd_help_desk" ),
				getJavaEntity( "solicitacao" )
		};
		
		return javaEntities;
	}
	
}
