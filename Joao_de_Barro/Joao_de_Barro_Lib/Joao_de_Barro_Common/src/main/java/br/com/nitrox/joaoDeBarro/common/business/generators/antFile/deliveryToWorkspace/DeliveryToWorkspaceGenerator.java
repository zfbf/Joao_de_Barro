package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToWorkspace;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public class DeliveryToWorkspaceGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public DeliveryToWorkspaceGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer, mavenModules );
	}
	
	
	public String getTemplateName() {
		return "delivery_to_workspace.vm";
	}
	
}
