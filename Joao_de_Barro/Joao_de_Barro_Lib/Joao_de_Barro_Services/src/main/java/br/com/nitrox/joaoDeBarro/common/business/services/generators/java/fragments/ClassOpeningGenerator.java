package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class ClassOpeningGenerator extends AbstractJavaEntityGenerator {
	private String prefix;
	private String sufix;
	
	public ClassOpeningGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
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
	
	
	public int getTemplateCode() {
		return TEMPLATE_CLASS_OPENING;
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			VelocityContext context = getVelocityContext();
			context.put( "java_entity", getJavaEntity() );
			context.put( "prefix", prefix );
			context.put( "sufix", sufix );
			runTemplate( getTemplateCode() );
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
