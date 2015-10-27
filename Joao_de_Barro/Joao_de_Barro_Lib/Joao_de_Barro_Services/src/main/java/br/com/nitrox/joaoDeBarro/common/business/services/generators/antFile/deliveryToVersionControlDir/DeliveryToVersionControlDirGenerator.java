package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToVersionControlDir;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileGenerator;


public class DeliveryToVersionControlDirGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public DeliveryToVersionControlDirGenerator( MavenModule[] mavenModules ) {
		super( mavenModules );
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_MAVEN_MODULE_DELIVERY_TO_VERSION_CONTROL_DIR;
	}
	
}
