package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public abstract class AbstractGeneratorCoordinator extends AbstractJoaoDeBarroLogger
		implements VelocityGeneratorCoordinator {
	private JoaoDeBarroVelocityEngine jbVelocityEngine;
	
	public AbstractGeneratorCoordinator() {
		jbVelocityEngine = JoaoDeBarroVelocityEngine.getInstance();
	}
	
	
	public Writer getWriter() {
		return jbVelocityEngine.getWriter();
	}
	
	
	public VelocityContext getVelocityContext() {
		return jbVelocityEngine.getVelocityContext();
	}
	
	
	public void print() throws IOException {
		String methodName = "print";
		debugInicioDoMetodo( methodName );
		
		String artifact = getWriter().toString();
		
		if ( artifact != null ) {
			info( methodName, "artifact", artifact );
		} else {
			warn( methodName, "artifact is null" );
		}
	}
	
	
	public void flush() throws IOException {
		getWriter().flush();
	}
	
}
