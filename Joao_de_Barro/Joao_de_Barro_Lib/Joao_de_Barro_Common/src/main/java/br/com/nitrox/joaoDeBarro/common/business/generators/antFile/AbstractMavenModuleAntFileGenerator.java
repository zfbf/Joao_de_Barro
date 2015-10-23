package br.com.nitrox.joaoDeBarro.common.business.generators.antFile;

import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.AbstractFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.MavenModule;


public abstract class AbstractMavenModuleAntFileGenerator extends AbstractFragmentGenerator {
	private MavenModule[] mavenModules;
	
	public AbstractMavenModuleAntFileGenerator( VelocityContext velocityContext, 
			Writer writer, MavenModule[] mavenModules ) {
		super( velocityContext, writer );
		this.mavenModules = mavenModules;
	}
	
	
	public abstract String getTemplateName();
	
	
	/*
	 * A propriedade "file.resource.loader.path" do Velocity foi
	 * inicializada para apontar para [JOAO_DE_BARRO_WORKDIR]
	 * em AbstractGeneratorCoordinator.
	 */
	public Template getTemplate() throws ResourceNotFoundException {
		String methodName = "getTemplate";
		Template template = null;
		
		try {
			template = Velocity.getTemplate( "./resources/vm/" + getTemplateName() );
		} catch ( ResourceNotFoundException e  ) {
			System.err.println( "teste" );
			error( methodName, e );
			throw e;
		}
		
		return template; 
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "maven_modules", mavenModules );
			getTemplate().merge( context, getWriter() );
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
