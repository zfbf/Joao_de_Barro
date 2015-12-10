package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class ProdutoJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build(
						"identificador",
						"ide_prdt_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						true,
						true,
						null ),
						
				JavaAttributeFactory.build(
						"nome",
						"nom_prdt_ti_gps",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(128)",
						false,
						false,
						false,	
						null ),
						
				JavaAttributeFactory.build(
						"abreviatura",
						"nom_abrv_prdt_ti_gps",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						false,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"nome_fonte_externa",
						"nom_prdt_ti_fnt_extrn",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(128)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"identificador_sistema",
						"ide_sis_ti",
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
