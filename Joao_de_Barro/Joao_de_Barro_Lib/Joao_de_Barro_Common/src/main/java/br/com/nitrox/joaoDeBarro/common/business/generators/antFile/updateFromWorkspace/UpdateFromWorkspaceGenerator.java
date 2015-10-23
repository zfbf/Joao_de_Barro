package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromWorkspace;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public class UpdateFromWorkspaceGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public UpdateFromWorkspaceGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer, mavenModules );
	}
	
	
	public String getTemplateName() {
		return "update_from_workspace.vm";
	}
	
}
