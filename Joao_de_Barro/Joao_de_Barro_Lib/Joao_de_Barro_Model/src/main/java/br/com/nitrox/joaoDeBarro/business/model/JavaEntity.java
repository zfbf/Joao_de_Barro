package br.com.nitrox.joaoDeBarro.business.model;

import br.com.nitrox.joaoDeBarro.infrastructure.util.NameStyleFormatter;

public class JavaEntity {
	private String name;
	private String tableDbName;
	private JavaAttribute[] javaAttributes;
	
	
	public String getName() {
		return name;
	}
	
	
	public String getNameClassStyle() {
		return NameStyleFormatter.toClassStyle( name );
	}
	
	
	public String getNameAttributeStyle() {
		return NameStyleFormatter.toAttributeStyle( name );
	}
	
	
	public void setName( String name ) {
		this.name = name;
	}
	
	
	public String getTableDbName() {
		return tableDbName;
	}
	
	
	public String getTableDbNameClassStyle() {
		return NameStyleFormatter.toClassStyle( tableDbName );
	}
	
	
	public String getTableDbNameAttributeStyle() {
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
