package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromVersionControlDir;

import java.io.File;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class UpdateFromVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new UpdateFromVersionControlDirGenerator( 
				getMavenModules() );
	}
	
	
	public File getArtifactParentDir() {
		String workDir = Ambiente.getInstance().getWorkDir();
		String artifactDir = workDir + "/out/maven/update_from_version_control_dir";
		File file = new File( artifactDir );
		return file;
	}
	
}
