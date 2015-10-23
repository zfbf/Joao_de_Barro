package br.com.nitrox.joaoDeBarro.common.business.generators.java;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.AbstractFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;


public abstract class AbstractJavaEntityGenerator extends AbstractFragmentGenerator {
	private JavaEntity javaEntity;
	
	public AbstractJavaEntityGenerator( VelocityContext velocityContext, 
			Writer writer, JavaEntity javaEntity ) {
		super( velocityContext, writer );
		this.javaEntity = javaEntity;
	}
	
	
	protected JavaEntity getJavaEntity() {
		return javaEntity;
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "java_entity", javaEntity );
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
