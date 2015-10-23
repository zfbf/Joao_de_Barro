package br.com.nitrox.joaoDeBarro.common.business.generators;

import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;


public abstract class AbstractFragmentGenerator extends AbstractVelocityGenerator
		implements VelocityFragmentGenerator {
	
	public AbstractFragmentGenerator( VelocityContext velocityContext, Writer writer ) {
		super( velocityContext, writer );
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
			template = Velocity.getTemplate( "resources/vm/" + getTemplateName() );
		} catch ( ResourceNotFoundException e  ) {
			error( methodName, e );
			throw e;
		}
		
		return template; 
	}
	
	
	public void flush() throws IOException {
		if ( getWriter() != null ) {
			getWriter().flush();	
		}
	}
	
}
