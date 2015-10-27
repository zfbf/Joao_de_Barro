package br.com.nitrox.joaoDeBarro.common.business.services.generators.java;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.AbstractFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JavaAttributeVelocityGenerator;


public abstract class AbstractJavaAttributeGenerator extends AbstractFragmentGenerator
		implements JavaAttributeVelocityGenerator {
	private JavaAttribute javaAttribute;
	
	public AbstractJavaAttributeGenerator( JavaAttribute javaAttribute ) {
		this.javaAttribute = javaAttribute;
	}
	
	
	public AbstractJavaAttributeGenerator() {
		;
	}
	
	
	public JavaAttribute getJavaAttribute() {
		return javaAttribute;
	}
	
	
	public void setJavaAttribute( JavaAttribute javaAttribute ) {
		this.javaAttribute = javaAttribute;
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "java_attribute", javaAttribute );
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
