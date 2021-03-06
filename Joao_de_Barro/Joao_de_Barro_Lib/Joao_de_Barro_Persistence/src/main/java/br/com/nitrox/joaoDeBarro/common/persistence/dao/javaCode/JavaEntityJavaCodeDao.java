package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.ColaboradorJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.CsvNotesPedidoJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingContagemProjetoMelhoriaJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdAuditLogSystemJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingHpdHelpDeskJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.DataStagingNotesPedidoJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.JavaAttributeJavaCodeUnit;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.ProdutoJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.SistemaTiJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.SolicitacaoJavaAttributesJavaCode;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes.TipoSolicitacaoJavaAttributesJavaCode;

public class JavaEntityJavaCodeDao implements JavaEntityDao, JavaAttributeTypes, JavaEntityConstants {
	
	public JavaEntity getJavaEntity( int entityCode ) {
		JavaEntity javaEntity = new JavaEntity();
		JavaAttributeJavaCodeUnit javaAttributeJavaCodeUnit = null;
		
		switch ( entityCode ) {
		case JAVA_ENTITY_DATA_STAGING_HPD_HELP_DESK:
			javaEntity.setName( JAVA_ENTITY_NAME_DATA_STAGING_HPD_HELP_DESK );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_DATA_STAGING_HPD_HELP_DESK );
			javaAttributeJavaCodeUnit = new DataStagingHpdHelpDeskJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_DATA_STAGING_HPD_AUDIT_LOG_SYSTEM:
			javaEntity.setName( JAVA_ENTITY_NAME_DATA_STAGING_HPD_AUDIT_LOG_SYSTEM );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_DATA_STAGING_HPD_AUDIT_LOG_SYSTEM );
			javaAttributeJavaCodeUnit = new DataStagingHpdAuditLogSystemJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_SOLICITACAO:
			javaEntity.setName( JAVA_ENTITY_NAME_SOLICITACAO );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_SOLICITACAO );
			javaAttributeJavaCodeUnit = new SolicitacaoJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_TIPO_SOLICITACAO:
			javaEntity.setName( JAVA_ENTITY_NAME_TIPO_SOLICITACAO );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_TIPO_SOLICITACAO );
			javaAttributeJavaCodeUnit = new TipoSolicitacaoJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_PRODUTO_TI:
			javaEntity.setName( JAVA_ENTITY_NAME_PRODUTO_TI );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_PRODUTO );
			javaAttributeJavaCodeUnit = new ProdutoJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_DATA_STAGING_NOTES_PEDIDO:
			javaEntity.setName( JAVA_ENTITY_NAME_DATA_STAGING_NOTES_PEDIDO );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_DATA_STAGING_NOTES_PEDIDO );
			javaAttributeJavaCodeUnit = new DataStagingNotesPedidoJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_CSV_NOTES_PEDIDO:
			javaEntity.setName( JAVA_ENTITY_NAME_CSV_NOTES_PEDIDO );
			javaAttributeJavaCodeUnit = new CsvNotesPedidoJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_COLABORADOR:
			javaEntity.setName( JAVA_ENTITY_NAME_COLABORADOR );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_COLABORADOR );
			javaAttributeJavaCodeUnit = new ColaboradorJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_SISTEMA_TI:
			javaEntity.setName( JAVA_ENTITY_NAME_SISTEMA_TI );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_SISTEMA_TI );
			javaAttributeJavaCodeUnit = new SistemaTiJavaAttributesJavaCode();
			break;
			
		case JAVA_ENTITY_DATA_STAGING_CONTAGEM_PROJETO_MELHORIA:
			javaEntity.setName( JAVA_ENTITY_NAME_DATA_STAGING_CONTAGEM_PROJETO_MELHORIA );
			javaEntity.setDatabaseTableName( JAVA_TABLE_NAME_DATA_STAGING_CONTAGEM_PROJETO_MELHORIA );
			javaAttributeJavaCodeUnit = new DataStagingContagemProjetoMelhoriaJavaAttributesJavaCode();
			break;
			
		default:
			break;
		}
		
		javaEntity.setJavaAttributes( javaAttributeJavaCodeUnit.getJavaAttributes() );
		return javaEntity;
	}
	
	
	public JavaEntity[] getJavaEntities() {
		int[] javaEntityCodeArray = JAVA_ENTITY_CODE_ARRAY;
		int tam = javaEntityCodeArray.length;
		JavaEntity[] javaEntities = new JavaEntity[ tam ];
		
		for ( int i = 0; i < tam; i++ ) {
			javaEntities[i] = getJavaEntity( javaEntityCodeArray[i] );
		}
		
		return javaEntities;
	}
	
}
