package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.createWorkspaceDirectories;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class CreateWorkspaceDirectoriesCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new CreateWorkspaceDirectoriesGenerator( getMavenModules() );
	}
	
}
