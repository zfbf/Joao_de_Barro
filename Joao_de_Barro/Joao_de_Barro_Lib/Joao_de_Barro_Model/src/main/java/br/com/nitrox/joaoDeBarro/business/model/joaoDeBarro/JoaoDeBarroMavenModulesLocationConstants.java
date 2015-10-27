package br.com.nitrox.joaoDeBarro.business.model.joaoDeBarro;

/*
- Joao_de_Barro
	- Joao_de_Barro_Lib
		- Joao_de_Barro_Ambiente
		- Joao_de_Barro_Logger
		- Joao_de_Barro_Test_Logger
		- Joao_de_Barro_Common
	- Joao_de_Barro_Batch_App
		- Joao_de_Barro_Batch
	- Joao_de_Barro_Web_App
		- Joao_de_Barro_Web
 */
public interface JoaoDeBarroMavenModulesLocationConstants {
	
	String[][] JOAO_DE_BARRO_MAVEN_MODULES = new String[][] {
		{ "Joao_de_Barro", "." },
		
		{ "Joao_de_Barro_Lib", "Joao_de_Barro" },
		
		{ "Joao_de_Barro_Infrastructure", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Ambiente", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Logger", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Test_Logger", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Model", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Persistence", "Joao_de_Barro/Joao_de_Barro_Lib" },
		{ "Joao_de_Barro_Services", "Joao_de_Barro/Joao_de_Barro_Lib" },
		
		{ "Joao_de_Barro_Batch_App", "Joao_de_Barro" },
		
		{ "Joao_de_Barro_Batch", "Joao_de_Barro/Joao_de_Barro_Batch_App" },
		
		{ "Joao_de_Barro_Web_App", "Joao_de_Barro" },
		
		{ "Joao_de_Barro_Web", "Joao_de_Barro/Joao_de_Barro_Web_App" }
	};
	
}
