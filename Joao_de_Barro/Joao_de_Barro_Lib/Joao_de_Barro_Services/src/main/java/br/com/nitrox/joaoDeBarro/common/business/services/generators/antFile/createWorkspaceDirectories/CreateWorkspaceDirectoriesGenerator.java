 package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.createWorkspaceDirectories;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileGenerator;


public class CreateWorkspaceDirectoriesGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public CreateWorkspaceDirectoriesGenerator( MavenModule[] mavenModules ) {
		super( mavenModules );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_MAVEN_MODULE_CREATE_WORKSPACE_DIRECTORIES;
	}
	
}
