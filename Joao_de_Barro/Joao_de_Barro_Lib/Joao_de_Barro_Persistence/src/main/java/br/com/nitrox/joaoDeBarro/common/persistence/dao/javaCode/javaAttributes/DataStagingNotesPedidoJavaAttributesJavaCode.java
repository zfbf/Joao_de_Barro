package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class DataStagingNotesPedidoJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build( "identificador" ,"ide_notes_pedido", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "INTEGER", false, true, true, null ),
				JavaAttributeFactory.build( "codigo_interno" ,"nome_codigo_interno_notes", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", false, false, false, null ),
				JavaAttributeFactory.build( "num_pedido" ,"num_pedido", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", true, false, false, null ),
				JavaAttributeFactory.build( "cod_area_pedido" ,"cod_area_pedido", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_area_atribuida" ,"cod_area_atribuida", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_depto_pedido" ,"cod_depto_pedido", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_depto_atribuido" ,"cod_depto_atribuido", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "assunto" ,"des_assunto", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(256)", true, false, false, null ),
				JavaAttributeFactory.build( "sistema" ,"des_sistema", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(64)", true, false, false, null ),
				JavaAttributeFactory.build( "outro_sistema" ,"des_outro_sistema", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(64)", true, false, false, null ),
				JavaAttributeFactory.build( "projeto" ,"des_projeto", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_estado_completo" ,"cod_estado_completo", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "tipo_pedido_form" ,"des_tipo_pedido_form", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "cod_lotacao_solicitante" ,"cod_lotacao_solicitante", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "solicitante" ,"nom_solicitante", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "responsavel" ,"nom_responsavel", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "gerente" ,"nom_gerente", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "executor" ,"nom_executor", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(256)", true, false, false, null ),
				JavaAttributeFactory.build( "atribuidor" ,"nom_atribuidor", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "concluidor" ,"nom_concluidor", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "executor_cancelamento" ,"nom_cancelamento", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "finalizador" ,"nom_finalizador", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(128)", true, false, false, null ),
				JavaAttributeFactory.build( "data_solicitacao" ,"dat_solicitacao", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_recebimento" ,"dat_recebimento", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_limite" ,"dat_limite", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_priorizacao" ,"dat_priorizacao", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_inicio_pre_analise" ,"dat_inicio_pre_analise", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_inicio_estimativa" ,"dat_inicio_estimativa", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_fim_estimativa" ,"dat_fim_estimativa", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_atribuicao" ,"dat_atribuicao", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_imp_terminada" ,"dat_imp_terminada", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_conclusao" ,"dat_conclusao", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_cancelamento" ,"dat_cancelamento", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_finalizacao" ,"dat_finalizacao", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_projeto" ,"dat_projeto", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "data_encaminhamento_gerente" ,"dat_encaminhamento_gerente", JAVA_ATTRIBUTE_TYPE_DATE, "datetime", true, false, false, null ),
				JavaAttributeFactory.build( "complexidade" ,"des_complexidade", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "qtd_horas_conclusao" ,"hor_conclusao", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "FLOAT", true, false, false, null ),
				JavaAttributeFactory.build( "qtd_horas_fechamento" ,"hor_fechamento", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "FLOAT", true, false, false, null ),
				JavaAttributeFactory.build( "num_prioridade" ,"num_prioridade", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "INTEGER", true, false, false, null ),
				JavaAttributeFactory.build( "qtd_homologacoes" ,"num_homologacoes", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "INTEGER", true, false, false, null ),
				JavaAttributeFactory.build( "qtd_validacoes" ,"num_validacoes", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "INTEGER", true, false, false, null ),
				JavaAttributeFactory.build( "fila" ,"nom_fila", JAVA_ATTRIBUTE_TYPE_STRING, "VARCHAR(32)", true, false, false, null ),
				JavaAttributeFactory.build( "ide_cga_gps" ,"ide_cga_gps", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "int", false, false, false, null ),
				JavaAttributeFactory.build( "ide_status_carga" ,"ide_status_carga", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "INTEGER", true, false, false, null )
		};
		
		return javaAttributeArray;
	}
	
}
