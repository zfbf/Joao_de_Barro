package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile;

import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.business.model.MavenModulesConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.AbstractGeneratorCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityGeneratorCoordinator;



public abstract class AbstractMavenModuleAntFileCoordinator extends AbstractGeneratorCoordinator
		implements VelocityGeneratorCoordinator, MavenModulesConstants {
	private MavenModule[] mavenModules;
	
	public AbstractMavenModuleAntFileCoordinator() {
		init();
	}
	
	
	private void init() {
		int tam = MAVEN_MODULES.length;
		this.mavenModules = new MavenModule[ tam ];
		String name = null;
		String relativePath = null;
		
		for ( int i = 0; i < MAVEN_MODULES.length; i++ ) {
			name = MAVEN_MODULES[i][0];
			relativePath = MAVEN_MODULES[i][1];
			mavenModules[i] = new MavenModule( name, relativePath );
		}
	}
	
	
	public MavenModule[] getMavenModules() {
		return mavenModules;
	}
	
	
	public abstract VelocityFragmentGenerator getVelocityFragmentGenerator();
	
	
	public String getArtifactName() {
		return "build.xml";
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		VelocityFragmentGenerator fragmentGenerator = null;
		
		try {
			fragmentGenerator = getVelocityFragmentGenerator();
			fragmentGenerator.generate();
			flush();
		} catch ( IOException e ) {
			error( methodName, e );
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
			throw e;
		}
	}
	
}
