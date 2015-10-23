package br.com.nitrox.joaoDeBarro.common.business.generators;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;


public abstract class AbstractGeneratorCoordinator extends AbstractJoaoDeBarroLogger
		implements VelocityGeneratorCoordinator {
	private VelocityContext velocityContext;
	private Writer writer;
	
	public AbstractGeneratorCoordinator() {
		this( new BufferedWriter( 
				new OutputStreamWriter( System.out )));
	}
	
	
	public AbstractGeneratorCoordinator( Writer writer ) {
		this.writer = writer;
		init();
	}
	
	
	private void init() {
		Properties p = new Properties();
		p.setProperty( "directive.foreach.counter.name", "velocityCount" );
		p.setProperty( "directive.foreach.counter.initial.value", "0" );
		p.setProperty( "file.resource.loader.path", Ambiente.getInstance().getWorkDir() );
		
		Velocity.init( p );
		this.velocityContext = new VelocityContext();
	}
	
	
	public Writer getWriter() {
		return writer;
	}
	
	
	public VelocityContext getVelocityContext() {
		return velocityContext;
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
