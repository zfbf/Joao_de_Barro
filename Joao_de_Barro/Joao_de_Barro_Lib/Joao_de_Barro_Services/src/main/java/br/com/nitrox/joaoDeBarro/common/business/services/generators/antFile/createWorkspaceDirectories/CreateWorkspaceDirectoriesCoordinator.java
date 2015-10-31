package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.createWorkspaceDirectories;

import java.io.File;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class CreateWorkspaceDirectoriesCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new CreateWorkspaceDirectoriesGenerator( getMavenModules() );
	}
	
	
	public File getArtifactParentDir() {
		String workDir = Ambiente.getInstance().getWorkDir();
		String artifactDir = workDir + "/out/maven/create_workspace_directories";
		File file = new File( artifactDir );
		return file;
	}
	
}
