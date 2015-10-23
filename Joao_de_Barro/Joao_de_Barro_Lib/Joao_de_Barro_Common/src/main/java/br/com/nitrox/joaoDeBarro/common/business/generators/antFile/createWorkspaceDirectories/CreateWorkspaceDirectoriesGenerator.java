 package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.createWorkspaceDirectories;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public class CreateWorkspaceDirectoriesGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public CreateWorkspaceDirectoriesGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer, mavenModules );
	}
	
	
	public String getTemplateName() {
		return "create_workspace_directories.vm";
	}
	
}
