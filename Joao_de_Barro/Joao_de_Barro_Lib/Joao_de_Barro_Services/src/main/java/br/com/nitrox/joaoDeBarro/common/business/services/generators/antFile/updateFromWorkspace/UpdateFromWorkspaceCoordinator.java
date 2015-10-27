package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class UpdateFromWorkspaceCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new UpdateFromWorkspaceGenerator( 
				getMavenModules() );
	}
	
}
