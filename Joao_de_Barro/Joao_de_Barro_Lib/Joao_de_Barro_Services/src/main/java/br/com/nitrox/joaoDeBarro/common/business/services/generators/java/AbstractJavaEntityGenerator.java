package br.com.nitrox.joaoDeBarro.common.business.services.generators.java;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.AbstractFragmentGenerator;


public abstract class AbstractJavaEntityGenerator extends AbstractFragmentGenerator {
	private JavaEntity javaEntity;
	
	public AbstractJavaEntityGenerator( JavaEntity javaEntity ) {
		this.javaEntity = javaEntity;
	}
	
	
	protected JavaEntity getJavaEntity() {
		return javaEntity;
	}
	
	
	protected void putOtherVariablesInVelocityContext() {
		;
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "java_entity", getJavaEntity() );
			putOtherVariablesInVelocityContext();
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
