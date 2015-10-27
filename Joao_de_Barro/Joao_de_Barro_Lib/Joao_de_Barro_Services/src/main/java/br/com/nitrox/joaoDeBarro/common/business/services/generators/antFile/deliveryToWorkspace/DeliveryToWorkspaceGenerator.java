package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToWorkspace;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileGenerator;


public class DeliveryToWorkspaceGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public DeliveryToWorkspaceGenerator( MavenModule[] mavenModules ) {
		super( mavenModules );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_MAVEN_MODULE_DELIVERY_TO_WORKSPACE;
	}
	
}
