package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromWorkspace;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileGenerator;


public class UpdateFromWorkspaceGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public UpdateFromWorkspaceGenerator( MavenModule[] mavenModules ) {
		super( mavenModules );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_MAVEN_MODULE_UPDATE_FROM_WORKSPACE;
	}
	
}
