package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class SolicitacaoJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build(
						"identificador",
						"ide_solic_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						true,
						true,
						null ),
						
				JavaAttributeFactory.build(
						"ide_origem",
						"ide_orgm",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"codigo_interno",
						"nom_cod_itrno_solic",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),				
						
				JavaAttributeFactory.build(
						"numero",
						"num_solic",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ide_tipo",
						"ide_tip_solic_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ide_orgao_patrocinador",
						"ide_orgao_patrcdr",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
					
				JavaAttributeFactory.build(
						"ide_ultima_transicao_estado",
						"ide_ult_trans_estdo_solic_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
				
				JavaAttributeFactory.build(
						"ide_categoria_operacional",
						"ide_categ_opecl_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
					
				JavaAttributeFactory.build(
						"ide_categoria_produto_ti",
						"ide_categ_prdt_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),						
										
						
				JavaAttributeFactory.build(
						"login_solicitante",
						"nom_login_solic",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"login_gerente",
						"nom_login_ger_resp_exec",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ide_gerencia",
						"ide_gerenc_resp_exec",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"data_solicitacao",
						"dat_solic",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"data_entrega",
						"dat_entrg",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"data_fechamento",
						"dat_fechmnt",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"assunto",
						"des_assnt",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(256)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"descricao",
						"des_solic",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"TEXT",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ide_produto",
						"ide_prdt_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null )
		};
		
		return javaAttributeArray;
	}
	
}
