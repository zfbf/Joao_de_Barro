package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class ColaboradorJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build( "identificador" ,"ide", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, false, true, null ),
				JavaAttributeFactory.build( "nome" ,"nome", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(65)", true, false, false, null ),
				JavaAttributeFactory.build( "e_mail" ,"email", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(120)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_userid" ,"cod_userid", JAVA_ATTRIBUTE_TYPE_STRING, "char(32)", true, false, false, null ),
				JavaAttributeFactory.build( "matricula" ,"num_matricula", JAVA_ATTRIBUTE_TYPE_STRING, "char(6)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_orgao_bndes" ,"ide_orgao_bndes", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "ramal" ,"num_ramal", JAVA_ATTRIBUTE_TYPE_STRING, "char(4)", true, false, false, null ),
				JavaAttributeFactory.build( "sala" ,"num_sala", JAVA_ATTRIBUTE_TYPE_STRING, "char(4)", true, false, false, null ),
				JavaAttributeFactory.build( "andar" ,"num_andar", JAVA_ATTRIBUTE_TYPE_STRING, "char(3)", true, false, false, null ),
				JavaAttributeFactory.build( "nome_guerra" ,"nome_guerra", JAVA_ATTRIBUTE_TYPE_STRING, "char(40)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_funcao" ,"ide_funcao", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "ind_genero" ,"ind_genero", JAVA_ATTRIBUTE_TYPE_STRING, "char(1)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_cargo" ,"ide_cargo", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null )
		};
		
		return javaAttributeArray;
	}
	
}
