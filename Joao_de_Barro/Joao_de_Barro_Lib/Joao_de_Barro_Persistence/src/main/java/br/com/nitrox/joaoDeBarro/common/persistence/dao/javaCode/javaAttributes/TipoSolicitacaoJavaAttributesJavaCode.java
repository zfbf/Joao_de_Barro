package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class TipoSolicitacaoJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build(
						"identificador",
						"ide_tip_solic_ti",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						false,
						true,
						null ),
						
				JavaAttributeFactory.build(
						"identificador_pai",
						"ide_tip_solic_ti_super",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"nome",
						"nom_tip_solic_ti",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						false,
						false,
						false,
						null ),	
						
				JavaAttributeFactory.build(
						"abreviatura",
						"nom_abrv_tip_solic_ti",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						false,
						false,
						false,
						null )
		};
		
		return javaAttributeArray;
	}
	
}
