package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public abstract class AbstractVelocityGenerator extends AbstractJoaoDeBarroLogger
		implements VelocityGenerator, JoaoDeBarroVelocityConstants {
	private JoaoDeBarroVelocityEngine jbVelocityEngine;
	
	public AbstractVelocityGenerator() {
		jbVelocityEngine = JoaoDeBarroVelocityEngine.getInstance();
	}
	
	
	public Writer getWriter() {
		return jbVelocityEngine.getWriter();
	}
	
	
	public VelocityContext getVelocityContext() {
		return jbVelocityEngine.getVelocityContext();
	}
	
	
	public abstract int getTemplateCode();
	
	
	public Template getTemplate() throws ResourceNotFoundException {
		return getTemplate( getTemplateCode() );
	} 
	
	
	public Template getTemplate( int templateCode ) throws ResourceNotFoundException {
		String methodName = "getTemplate";
		Template template = null;
		
		try {
			template = jbVelocityEngine.getTemplate( templateCode );
		} catch ( ResourceNotFoundException e  ) {
			error( methodName, e );
			throw e;
		}
		
		return template; 
	}
	
	
	public void runTemplate() {
		runTemplate( getTemplateCode() );
	}
	
	
	public void runTemplate( int templateCode ) {
		jbVelocityEngine.runTemplate( templateCode );
	}
	
	
	public void flush() throws IOException {
		jbVelocityEngine.flush();
	}
	
}
