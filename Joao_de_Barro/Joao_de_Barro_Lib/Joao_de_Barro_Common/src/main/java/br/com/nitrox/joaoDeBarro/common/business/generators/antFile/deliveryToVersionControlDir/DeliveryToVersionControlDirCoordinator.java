package br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToVersionControlDir;

import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.AbstractMavenModuleAntFileCoordinator;



public class DeliveryToVersionControlDirCoordinator extends AbstractMavenModuleAntFileCoordinator {
	
	
	public VelocityFragmentGenerator getVelocityFragmentGenerator() {
		return new DeliveryToVersionControlDirGenerator( 
				getVelocityContext(), getWriter(), getMavenModules() );
	}
	
}
