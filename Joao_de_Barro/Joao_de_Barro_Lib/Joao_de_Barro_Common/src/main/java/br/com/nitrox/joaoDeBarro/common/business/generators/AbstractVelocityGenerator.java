package br.com.nitrox.joaoDeBarro.common.business.generators;

import java.io.Writer;

import org.apache.velocity.VelocityContext;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public abstract class AbstractVelocityGenerator extends AbstractJoaoDeBarroLogger
		implements VelocityGenerator {
	private VelocityContext velocityContext;
	private Writer writer;
	
	public AbstractVelocityGenerator( VelocityContext velocityContext, Writer writer ) {
		this.velocityContext = velocityContext;
		this.writer = writer;
	}
	
	
	public Writer getWriter() {
		return writer;
	}
	
	
	public VelocityContext getVelocityContext() {
		return velocityContext;
	}
	
}
