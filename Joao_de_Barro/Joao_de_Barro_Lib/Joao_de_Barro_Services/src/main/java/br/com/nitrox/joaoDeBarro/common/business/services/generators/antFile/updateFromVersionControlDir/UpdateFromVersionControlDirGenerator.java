package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromVersionControlDir;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileGenerator;


public class UpdateFromVersionControlDirGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public UpdateFromVersionControlDirGenerator( MavenModule[] mavenModules ) {
		super( mavenModules );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_MAVEN_MODULE_UPDATE_FROM_VERSION_CONTROL_DIR;
	}
	
}
