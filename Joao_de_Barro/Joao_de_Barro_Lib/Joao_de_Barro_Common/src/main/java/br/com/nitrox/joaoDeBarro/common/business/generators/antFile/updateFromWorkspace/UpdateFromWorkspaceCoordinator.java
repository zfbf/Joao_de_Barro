package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class UpdateFromWorkspaceCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new UpdateFromWorkspaceGenerator( 
				getVelocityContext(), getWriter(), getMavenModules() );
	}
	
}
