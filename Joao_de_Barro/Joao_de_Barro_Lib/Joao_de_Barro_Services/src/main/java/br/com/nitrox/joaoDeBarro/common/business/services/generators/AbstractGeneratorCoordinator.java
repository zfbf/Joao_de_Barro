package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.File;
import java.io.FileWriter;
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
	
	
	public abstract File getArtifactParentDir();
	public abstract String getArtifactName();
	
	
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
	
	
	public void save() throws IOException {
		String content = getWriter().toString();
		save( content );
	}
	
	
	public void save( String content ) throws IOException {
		String methodName = "save";
		debugInicioDoMetodo( methodName );
		
		File file = new File( getArtifactParentDir(), getArtifactName() );
		
		if ( !file.exists() ) {
			file.getParentFile().mkdirs();
		}
		
		FileWriter fw = new FileWriter( file );
		fw.write( content );
		fw.flush();
		fw.close();
		
		String message = "Artefato " + getArtifactName() + " gerado com " +
				"sucesso em " + getArtifactParentDir().getName();
		info( methodName, message );
	}
	
	
	public void resetBuffer() {
		jbVelocityEngine.resetWriter();
	}
	
	
	public void flush() throws IOException {
		getWriter().flush();
	}
	
}
