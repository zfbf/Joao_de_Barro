package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class SistemaTiJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build( "identificador" ,"ide_sis_TI", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, true, true, null ),
				JavaAttributeFactory.build( "nome" ,"nom_sis_TI", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(80)", true, false, false, null ),
				JavaAttributeFactory.build( "codigo_mainframe" ,"num_sis_mframe", JAVA_ATTRIBUTE_TYPE_STRING, "char(3)", true, false, false, null ),
				JavaAttributeFactory.build( "sigla" ,"sig_sis", JAVA_ATTRIBUTE_TYPE_STRING, "char(3)", false, false, false, null ),
				JavaAttributeFactory.build( "abreviatura" ,"nom_abrvd_sis", JAVA_ATTRIBUTE_TYPE_STRING, "char(12)", true, false, false, null ),
				JavaAttributeFactory.build( "descricao" ,"des_sis_TI", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(1000)", true, false, false, null ),
				JavaAttributeFactory.build( "observacao" ,"txt_obs", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(8000)", true, false, false, null ),
				JavaAttributeFactory.build( "indicador_contigencia" ,"ind_sis_ctingd", JAVA_ATTRIBUTE_TYPE_STRING, "char(1)", false, false, false, null ),
				JavaAttributeFactory.build( "quantidade_programas" ,"qtd_prog", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_usuarios" ,"qtd_usu", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "data_implantacao" ,"dat_implant_prod", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_desativacao" ,"dat_desatvc", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "indicador_analise_administracao_dados" ,"ind_sis_anl_AD", JAVA_ATTRIBUTE_TYPE_STRING, "char(1)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_user_criacao" ,"ide_user_cria", JAVA_ATTRIBUTE_TYPE_STRING, "char(32)", true, false, false, null ),
				JavaAttributeFactory.build( "data_criacao" ,"dat_cria", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "ide_situacao" ,"ide_sit_sis_ti", JAVA_ATTRIBUTE_TYPE_STRING, "char(1)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_pai" ,"ide_sis_TI_super", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "ide_tipo_item_software" ,"ide_tip_itm_softw", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "ide_fabricante" ,"ide_fabr_sis_TI", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, false, false, null )
		};
		
		return javaAttributeArray;
	}
	
}
