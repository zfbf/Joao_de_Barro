package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToVersionControlDir;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public class DeliveryToVersionControlDirGenerator extends AbstractMavenModuleAntFileGenerator {
	
	public DeliveryToVersionControlDirGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer, mavenModules );
	}
	
	
	public String getTemplateName() {
		return "delivery_to_version_control_dir.vm";
	}
	
}
