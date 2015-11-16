package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class CsvNotesPedidoJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build( "unique_id" ,"UniqueID", JAVA_ATTRIBUTE_TYPE_STRING, "", false, false, true, null ),
				JavaAttributeFactory.build( "num" ,"Num", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "", false, false, false, null ),
				JavaAttributeFactory.build( "area_deduzida" ,"Área deduzida", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "area_form" ,"Área form", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "departamento_deduzido" ,"Depto deduzido", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "departamento_form" ,"Depto form", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "assunto" ,"Assunto", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "sistema_ger" ,"Sistema Ger", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "outros_sistemas" ,"Outros Sist.", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "projeto" ,"Projeto", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "status" ,"Status*", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "descricao_tipo_ger" ,"Des Tipo Ger", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "sigla_lotacao" ,"SigLotacao", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "solicitante" ,"Solicitante", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "responsavel" ,"Responsável", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "gerente" ,"Gerente", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "executor" ,"Executor", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "atribuidor" ,"Atribuidor", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "concluidor" ,"Concluidor", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "nome_cancelamento" ,"NomeCancelamento", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "nome_finalizador" ,"Nome finalizador", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_solicitacao" ,"Data da solicitação", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_recebimento" ,"Data do recebimento", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "limite" ,"Limite", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_da_priorizacao" ,"Data da Priorizacao", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_inicio_pre_analise" ,"Data Início Pré-Analise", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_inicio_estimativa" ,"Data Início Estimativa", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_fim_estimativa" ,"Data Fim Estimativa", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_atribuicao" ,"Data da atribuição", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_implementacao_terminada" ,"Data Imp.Termin.", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_conclusao" ,"Data da conclusão", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_cancelamento" ,"Data Cancelamento", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_finalizacao" ,"Data da finalização", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_conversao" ,"Data Conversao", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "data_encaminhamento_gerente" ,"Data Enc.Gerente", JAVA_ATTRIBUTE_TYPE_DATE, "", true, false, false, null ),
				JavaAttributeFactory.build( "complexidade" ,"Complexidade", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null ),
				JavaAttributeFactory.build( "horas_conclusao" ,"Horas Conclusao", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "", true, false, false, null ),
				JavaAttributeFactory.build( "horas_fechamento" ,"Horas Fechamento", JAVA_ATTRIBUTE_TYPE_FLOAT_WRAPPER, "", true, false, false, null ),
				JavaAttributeFactory.build( "prioridade" ,"Prioridade", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "", true, false, false, null ),
				JavaAttributeFactory.build( "contador_homologacao" ,"Cont.Homolog.", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "", true, false, false, null ),
				JavaAttributeFactory.build( "contador_validacao_pos" ,"Cont ValidPos", JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER, "", true, false, false, null ),
				JavaAttributeFactory.build( "fila" ,"Fila", JAVA_ATTRIBUTE_TYPE_STRING, "", true, false, false, null )
		};
		
		return javaAttributeArray;
	}
	
}
