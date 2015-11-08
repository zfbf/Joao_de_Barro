package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;

public interface VelocityGeneratorMavenModulesCoordinator extends
		VelocityGeneratorCoordinator {
	
	MavenModule[] getMavenModules();
	void setMavenModules( MavenModule[] mavenModules );
	
}
