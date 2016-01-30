package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class DataStagingContagemProjetoMelhoriaJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build( "identificador" ,"ide_contgm_proj_mlhria", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, true, true, null ),
				JavaAttributeFactory.build( "ide_tipo_contagem" ,"ide_tip_contgm_pnt_fnc", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "login_responsavel_contagem" ,"nom_login_resp_contgm_pnt_fnc", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(16)", true, false, false, null ),
				JavaAttributeFactory.build( "data_contagem" ,"dat_contgm_pnt_fnc", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_inicio_vigencia" ,"dat_ini_vignc", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_fim_vigencia" ,"dat_fim_vignc", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "comentario" ,"des_comen_contgm_pnt_fnc", JAVA_ATTRIBUTE_TYPE_STRING, "TEXT", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_total" ,"qtd_pnt_fnc", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "decimal(7,2)", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_inclusao" ,"qtd_pnt_fnc_inc", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "decimal(7,2)", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_alteracao" ,"qtd_pnt_fnc_alt", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "decimal(7,2)", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_exclusao" ,"qtd_pnt_fnc_exc", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "decimal(7,2)", true, false, false, null ),
				JavaAttributeFactory.build( "quantidade_nao_funcional" ,"qtd_pnt_fnc_nao_fncl", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "decimal(7,2)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_origem_solicitacao" ,"ide_orgm_solic_ti", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "nome_origem_solicitacao" ,"nom_orgm_solic_ti", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_solicitacao" ,"ide_solic_ti", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "numero_solicitacao" ,"num_solic_ti", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, false, false, null ),
				JavaAttributeFactory.build( "ide_carga_gps" ,"ide_cga_gps", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "ide_status_carga" ,"ide_stat_cga", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null )
		};
		
		return javaAttributeArray;
	}
	
}
