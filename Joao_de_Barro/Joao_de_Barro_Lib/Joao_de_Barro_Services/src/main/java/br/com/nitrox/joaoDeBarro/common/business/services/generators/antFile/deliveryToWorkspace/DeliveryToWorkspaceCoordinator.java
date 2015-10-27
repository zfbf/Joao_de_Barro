package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class DeliveryToWorkspaceCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new DeliveryToWorkspaceGenerator( 
				getMavenModules() );
	}
	
}
