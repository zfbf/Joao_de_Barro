package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.createWorkspaceDirectories;

import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class CreateWorkspaceDirectoriesCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new CreateWorkspaceDirectoriesGenerator( 
				getVelocityContext(), getWriter(), getMavenModules() );
	}
	
}
