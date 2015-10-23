package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromVersionControlDir;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public class UpdateFromVersionControlDirGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public UpdateFromVersionControlDirGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer, mavenModules );
	}
	
	
	public String getTemplateName() {
		return "update_from_version_control_dir.vm";
	}
	
}
