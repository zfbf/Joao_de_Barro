package br.com.nitrox.joaoDeBarro.common.business.model;

import br.com.nitrox.joaoDeBarro.common.business.util.NameStyleFormatter;

public class JavaEntity {
	private String javaEntityName;
	private String tableDbName;
	private JavaAttribute[] javaAttributes;
	
	
	public String getJavaEntityName() {
		return javaEntityName;
	}
	
	
	public String getJavaEntityClassStyleName() {
		return NameStyleFormatter.toClassStyle( javaEntityName );
	}
	
	
	public String getJavaEntityAttributeStyleName() {
		return NameStyleFormatter.toAttributeStyle( javaEntityName );
	}
	
	
	public void setJavaEntityName( String javaEntityName ) {
		this.javaEntityName = javaEntityName;
	}
	
	
	public String getTableDbName() {
		return tableDbName;
	}
	
	
	public String getTableDbClassStyleName() {
		return NameStyleFormatter.toClassStyle( tableDbName );
	}
	
	
	public String getTableDbAttributeStyleName() {
		return NameStyleFormatter.toAttributeStyle( tableDbName );
	}
	
	
	public void setDatabaseTableName( String tableDbName ) {
		this.tableDbName = tableDbName;
	}
	
	
	public JavaAttribute[] getJavaAttributes() {
		return javaAttributes;
	}
	
	
	public void setJavaAttributes( JavaAttribute[] javaAttributes ) {
		this.javaAttributes = javaAttributes;
	}
	
}
