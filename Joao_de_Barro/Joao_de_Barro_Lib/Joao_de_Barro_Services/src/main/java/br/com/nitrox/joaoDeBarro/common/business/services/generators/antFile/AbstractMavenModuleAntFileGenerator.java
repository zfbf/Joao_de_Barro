package br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.MavenModule;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.AbstractFragmentGenerator;


public abstract class AbstractMavenModuleAntFileGenerator extends AbstractFragmentGenerator {
	private MavenModule[] mavenModules;
	
	public AbstractMavenModuleAntFileGenerator( MavenModule[] mavenModules ) {
		this.mavenModules = mavenModules;
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "maven_modules", mavenModules );
			runTemplate();
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
			throw e;
		} catch ( ParseErrorException e ) {
			error( methodName, e );
		} catch ( MethodInvocationException e ) {
			error( methodName, e );
		} catch ( Exception e ) {
			error( methodName, e );
		}
	} 
	
}
