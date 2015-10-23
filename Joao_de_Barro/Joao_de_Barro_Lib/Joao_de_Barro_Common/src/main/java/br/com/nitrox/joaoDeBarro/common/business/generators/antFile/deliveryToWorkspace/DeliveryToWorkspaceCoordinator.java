package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToWorkspace;

import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class DeliveryToWorkspaceCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new DeliveryToWorkspaceGenerator( 
				getVelocityContext(), getWriter(), getMavenModules() );
	}
	
}
