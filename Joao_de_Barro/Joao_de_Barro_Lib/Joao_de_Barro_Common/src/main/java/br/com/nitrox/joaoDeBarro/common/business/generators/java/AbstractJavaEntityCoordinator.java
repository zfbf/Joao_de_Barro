package br.com.nitrox.joaoDeBarro.common.business.generators.java;

import br.com.nitrox.joaoDeBarro.common.business.generators.AbstractGeneratorCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityGeneratorCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModulesConstants;



public abstract class AbstractJavaEntityCoordinator extends AbstractGeneratorCoordinator
		implements VelocityGeneratorCoordinator, MavenModulesConstants {
	private JavaEntity javaEntity;
	
	public AbstractJavaEntityCoordinator( JavaEntity javaEntity ) {
		this.javaEntity = javaEntity;
	}
	
	
	public JavaEntity getJavaEntity() {
		return javaEntity;
	}
	
}
