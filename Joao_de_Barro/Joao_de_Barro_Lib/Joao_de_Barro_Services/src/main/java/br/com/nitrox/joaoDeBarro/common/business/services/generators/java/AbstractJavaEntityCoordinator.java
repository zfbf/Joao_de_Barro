package br.com.nitrox.joaoDeBarro.common.business.services.generators.java;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.business.model.MavenModulesConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.AbstractGeneratorCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityGeneratorCoordinator;



public abstract class AbstractJavaEntityCoordinator extends AbstractGeneratorCoordinator
		implements VelocityGeneratorCoordinator, MavenModulesConstants {
	private JavaEntity javaEntity;
	
	public AbstractJavaEntityCoordinator() {
		;
	}
	
	
	public AbstractJavaEntityCoordinator( JavaEntity javaEntity ) {
		this.javaEntity = javaEntity;
	}
	
	
	public JavaEntity getJavaEntity() {
		return javaEntity;
	}
	
	
	public void setJavaEntity( JavaEntity javaEntity ) {
		this.javaEntity = javaEntity;
	}
	
}
