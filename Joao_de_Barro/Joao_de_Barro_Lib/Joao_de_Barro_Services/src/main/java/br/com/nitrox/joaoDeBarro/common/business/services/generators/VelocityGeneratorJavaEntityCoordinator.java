package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;

public interface VelocityGeneratorJavaEntityCoordinator extends
		VelocityGeneratorCoordinator {
	
	void setJavaEntity( JavaEntity javaEntity );
	
}
