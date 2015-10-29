package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityGenerator;


public class AttributeCloneGenerator extends AbstractJavaEntityGenerator {
	private String firstVariableName;
	private String secondVariableName;
	
	public AttributeCloneGenerator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public String getFirstVariableName() {
		if ( firstVariableName == null ) {
			firstVariableName = getJavaEntity().getNameAttributeStyle();
		}
		
		return firstVariableName;
	}
	
	
	public void setFirstVariableName( String firstVariableName ) {
		this.firstVariableName = firstVariableName;
	}
	
	
	public String getSecondVariableName() {
		if ( secondVariableName == null ) {
			secondVariableName = getJavaEntity().getNameAttributeStyle() + "2";
		}
		
		return secondVariableName;
	}
	
	
	public void setSecondVariableName( String secondVariableName ) {
		this.secondVariableName = secondVariableName;
	}
	
	
	public int getTemplateCode() {
		return TEMPLATE_ATTRIBUTE_CLONE;
	}
	
	
	protected void putOtherVariablesInVelocityContext() {
		getVelocityContext().put( "first_var", getFirstVariableName() );
		getVelocityContext().put( "second_var", getSecondVariableName() );
	}
	
}
