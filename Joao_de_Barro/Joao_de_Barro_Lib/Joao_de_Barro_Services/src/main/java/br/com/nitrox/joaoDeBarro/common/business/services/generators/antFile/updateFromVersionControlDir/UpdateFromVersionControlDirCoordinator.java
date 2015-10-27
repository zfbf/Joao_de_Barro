package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class UpdateFromVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new UpdateFromVersionControlDirGenerator( 
				getMavenModules() );
	}
	
}
