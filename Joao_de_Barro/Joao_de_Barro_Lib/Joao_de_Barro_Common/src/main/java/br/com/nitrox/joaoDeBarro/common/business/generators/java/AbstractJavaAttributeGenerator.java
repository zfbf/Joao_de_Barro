package br.com.nitrox.joaoDeBarro.common.business.generators.java;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.AbstractFragmentGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.JavaAttributeVelocityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;


public abstract class AbstractJavaAttributeGenerator extends AbstractFragmentGenerator
		implements JavaAttributeVelocityGenerator {
	private JavaAttribute javaAttribute;
	
	public AbstractJavaAttributeGenerator( VelocityContext velocityContext, 
			Writer writer, JavaAttribute javaAttribute ) {
		super( velocityContext, writer );
		this.javaAttribute = javaAttribute;
	}
	
	
	public AbstractJavaAttributeGenerator( VelocityContext velocityContext, 
			Writer writer ) {
		super( velocityContext, writer );
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
