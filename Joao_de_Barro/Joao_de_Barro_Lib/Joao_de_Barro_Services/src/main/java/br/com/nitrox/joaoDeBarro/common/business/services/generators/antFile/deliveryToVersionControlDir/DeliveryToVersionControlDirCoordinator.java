package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToVersionControlDir;

import java.io.File;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class DeliveryToVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new DeliveryToVersionControlDirGenerator( 
				getMavenModules() );
	}
	
	
	public File getArtifactParentDir() {
		String workDir = Ambiente.getInstance().getWorkDir();
		String artifactDir = workDir + "/out/maven/delivery_to_version_control_dir";
		File file = new File( artifactDir );
		return file;
	}
	
}
