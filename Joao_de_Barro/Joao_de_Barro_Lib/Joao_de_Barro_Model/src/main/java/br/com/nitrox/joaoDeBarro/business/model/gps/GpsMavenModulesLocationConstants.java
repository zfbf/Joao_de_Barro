package br.com.nitrox.joaoDeBarro.business.model.gps;

/*
- GPS
	- GPS_Lib
		- GPS_ETL
			- GPS_Extracao
				- GPS_Extracao_Common
				- GPS_Extracao_Registro_de_Horas
				- GPS_Extracao_Planilhas_Contagem_PF
				- GPS_Extracao_Solicitacoes_Notes
				- GPS_Extracao_Solicitacoes_Remedy
			- GPS_Transformacao
				- GPS_Transformacao_Common
				- GPS_Transformacao_Registro_de_Horas
				- GPS_Transformacao_Planilhas_Contagem_PF
				- GPS_Transformacao_Solicitacoes_Notes
				- GPS_Transformacao_Solicitacoes_Remedy
			- GPS_Carga
				- GPS_Carga_Common
				- GPS_Carga_Registro_de_Horas
				- GPS_Carga_Planilhas_Contagem
				- GPS_Carga_Solicitacoes
			- GPS_ETL_Common
		- GPS_Infrastructure
		- GPS_Logger
		- GPS_Test_Logger
		- GPS_Ambiente
		- GPS_Common
		- GPS_Login
		- GPS_Remedy											// Contém as classes referentes ao Remedy
	- GPS_Batch_App
		- GPS_Extracao_Registro_de_Horas_Batch_App
		- GPS_Extracao_Planilhas_Contagem_PF_Batch_App
		- GPS_Extracao_Solicitacoes_Notes_Batch_App
		- GPS_Extracao_Solicitacoes_Remedy_Batch_App
		- GPS_Transformacao_Registro_de_Horas_Batch_App
		- GPS_Transformacao_Planilhas_Contagem_PF_Batch_App
		- GPS_Transformacao_Solicitacoes_Notes_Batch_App
		- GPS_Transformacao_Solicitacoes_Remedy_Batch_App
		- GPS_Carga_Registro_de_Horas_Batch_App
		- GPS_Carga_Planilhas_Contagem_PF_Batch_App
		- GPS_Carga_Solicitacoes_Batch_App
	- GPS_Web_App
		- GPS_Web
 */

public interface GpsMavenModulesLocationConstants {
	
	String[][] GPS_MAVEN_MODULES = new String[][] {
		{ "GPS", "." },
		
		{ "GPS_Lib", "GPS" },
		
		{ "GPS_Infrastructure", "GPS/GPS_Lib" },
		{ "GPS_Logger", "GPS/GPS_Lib" },
		{ "GPS_Test_Logger", "GPS/GPS_Lib" },
		{ "GPS_Ambiente", "GPS/GPS_Lib" },
		{ "GPS_Model", "GPS/GPS_Lib" },
		{ "GPS_Persistence", "GPS/GPS_Lib" },
		{ "GPS_Services", "GPS/GPS_Lib" },
		{ "GPS_Login", "GPS/GPS_Lib" },
		{ "GPS_Remedy", "GPS/GPS_Lib" },
		{ "GPS_ETL", "GPS/GPS_Lib" },
		
		{ "GPS_ETL_Common", "GPS/GPS_Lib/GPS_ETL" },
		{ "GPS_Extracao", "GPS/GPS_Lib/GPS_ETL" },
		{ "GPS_Transformacao", "GPS/GPS_Lib/GPS_ETL" },
		{ "GPS_Carga", "GPS/GPS_Lib/GPS_ETL" },
		
		{ "GPS_Extracao_Common", "GPS/GPS_Lib/GPS_ETL/GPS_Extracao" },
		{ "GPS_Extracao_Registro_de_Horas", "GPS/GPS_Lib/GPS_ETL/GPS_Extracao" },
		{ "GPS_Extracao_Planilhas_Contagem_PF", "GPS/GPS_Lib/GPS_ETL/GPS_Extracao" },
		{ "GPS_Extracao_Solicitacoes_Notes", "GPS/GPS_Lib/GPS_ETL/GPS_Extracao" },
		{ "GPS_Extracao_Solicitacoes_Remedy", "GPS/GPS_Lib/GPS_ETL/GPS_Extracao" },
		
		{ "GPS_Transformacao_Common", "GPS/GPS_Lib/GPS_ETL/GPS_Transformacao" },
		{ "GPS_Transformacao_Registro_de_Horas", "GPS/GPS_Lib/GPS_ETL/GPS_Transformacao" },
		{ "GPS_Transformacao_Planilhas_Contagem_PF", "GPS/GPS_Lib/GPS_ETL/GPS_Transformacao" },
		{ "GPS_Transformacao_Solicitacoes_Notes", "GPS/GPS_Lib/GPS_ETL/GPS_Transformacao" },
		{ "GPS_Transformacao_Solicitacoes_Remedy", "GPS/GPS_Lib/GPS_ETL/GPS_Transformacao" },
		
		{ "GPS_Carga_Common", "GPS/GPS_Lib/GPS_ETL/GPS_Carga" },
		{ "GPS_Carga_Registro_de_Horas", "GPS/GPS_Lib/GPS_ETL/GPS_Carga" },
		{ "GPS_Carga_Planilhas_Contagem_PF", "GPS/GPS_Lib/GPS_ETL/GPS_Carga" },
		{ "GPS_Carga_Solicitacoes", "GPS/GPS_Lib/GPS_ETL/GPS_Carga" },
		
		{ "GPS_Batch_App", "GPS" },
		
		{ "GPS_Extracao_Registro_de_Horas_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Extracao_Planilhas_Contagem_PF_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Extracao_Solicitacoes_Notes_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Extracao_Solicitacoes_Remedy_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Transformacao_Registro_de_Horas_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Transformacao_Planilhas_Contagem_PF_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Transformacao_Solicitacoes_Notes_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Transformacao_Solicitacoes_Remedy_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Carga_Registro_de_Horas_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Carga_Planilhas_Contagem_PF_Batch_App", "GPS/GPS_Batch_App" },
		{ "GPS_Carga_Solicitacoes_Batch_App", "GPS/GPS_Batch_App" },
		
		{ "GPS_Web_App", "GPS" },
		
		{ "GPS_Web", "GPS/GPS_Web_App" }
	};
	
}
