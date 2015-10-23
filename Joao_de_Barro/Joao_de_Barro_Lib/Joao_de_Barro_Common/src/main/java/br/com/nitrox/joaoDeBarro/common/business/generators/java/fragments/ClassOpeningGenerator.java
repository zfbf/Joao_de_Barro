package br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaEntityGenerator;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;


public class ClassOpeningGenerator extends AbstractJavaEntityGenerator {
	private String prefix;
	private String sufix;
	
	public ClassOpeningGenerator( VelocityContext velocityContext, 
			Writer writer, JavaEntity javaEntity ) {
		super( velocityContext, writer, javaEntity );
		this.prefix = "";
		this.sufix = "";
	}
	
	
	public String getPrefix() {
		return prefix;
	}
	
	
	public void setPrefix( String prefix ) {
		this.prefix = prefix;
	}
	
	
	public String getSufix() {
		return sufix;
	}
	
	
	public void setSufix( String sufix ) {
		this.sufix = sufix;
	}
	
	
	public String getTemplateName() {
		return "java/fragments/class_opening.vm";
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "java_entity", getJavaEntity() );
			context.put( "prefix", prefix );
			context.put( "sufix", sufix );
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
