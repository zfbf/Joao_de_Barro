package br.com.nitrox.joaoDeBarro.common.business.services;

import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.model.MavenModulesConstants;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;

public abstract class TwoParametersTarget extends AbstractJoaoDeBarroLogger
		implements MavenModulesConstants {
	private Writer writer;
	
	public TwoParametersTarget( Writer writer ) {
		this.writer = writer;
	}
	
	
	protected Writer getWriter() {
		return writer;
	}
	
	
	protected abstract VelocityContext getVelocityContext();
	protected abstract String getDirName();
	protected abstract String getRelativePathName();
	protected abstract Template getTemplate();
	
	
	public void execute() {
		String methodName = "execute";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			String dirName = getDirName();
			String relativePathName = getRelativePathName();
			context.put( "dir_name", dirName );
			context.put( "relative_path_name", relativePathName );
			Template template = getTemplate();
			template.merge( context, getWriter() );
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
		} catch ( ParseErrorException e ) {
			error( methodName, e );
		} catch ( MethodInvocationException e ) {
			error( methodName, e );
		} catch ( Exception e ) {
			error( methodName, e );
		}
	}
	
	
	private String createCopyTask( String dirName, String relativePath ) {
		StringBuffer sb = new StringBuffer();
		sb.append( "" );
		String copyTask = null;
		
		return copyTask;
	}
	
}
