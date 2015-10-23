package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.updateFromVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class UpdateFromVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new UpdateFromVersionControlDirGenerator( 
				getVelocityContext(), getWriter(), getMavenModules() );
	}
	
}
