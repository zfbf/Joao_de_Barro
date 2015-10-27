package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class DeliveryToVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new DeliveryToVersionControlDirGenerator( 
				getMavenModules() );
	}
	
}
