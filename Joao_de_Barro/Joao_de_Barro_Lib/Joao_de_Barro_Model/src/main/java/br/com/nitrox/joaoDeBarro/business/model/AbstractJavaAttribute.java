package br.com.nitrox.joaoDeBarro.business.model;

import br.com.nitrox.joaoDeBarro.infrastructure.util.NameStyleFormatter;

public abstract class AbstractJavaAttribute implements JavaAttribute {
	private String name;
	private String columnName;
	private int javaAttributeType;
	private String databaseType;
	private boolean allowNull;
	private boolean isIdentity;
	private boolean isPk;
	private String testValue;
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName( String name ) {
		this.name = name;
	}
	
	
	public String getNameAttributeStyle() {
		return NameStyleFormatter.toAttributeStyle( name );
	}
	
	
	public String getNameClassStyle() {
		return NameStyleFormatter.toClassStyle( name );
	}
	
	
	public String getColumnName() {
		return columnName;
	}
	
	
	public void setColumnName( String columnName ) {
		this.columnName = columnName;
	}
	
	
	public String getColumnNameAttributeStyle() {
		return NameStyleFormatter.toAttributeStyle( columnName );
	}
	
	
	public String getColumnNameClassStyle() {
		return NameStyleFormatter.toClassStyle( columnName );
	}
	
	
	public int getType() {
		return javaAttributeType;
	}
	
	
	public void setType( int javaAttributeType ) {
		this.javaAttributeType = javaAttributeType;
	}
	
	
	public String getDatabaseType() {
		return databaseType;
	}
	
	
	public void setDatabaseType( String databaseType ) {
		this.databaseType = databaseType;
	}
	
	
	public boolean isAllowNull() {
		return allowNull;
	}
	
	
	public void setAllowNull( boolean allowNull ) {
		this.allowNull = allowNull;
	}
	
	
	public boolean isIdentity() {
		return isIdentity;
	}
	
	
	public void setIdentity( boolean isIdentity ) {
		this.isIdentity = isIdentity;
	}
	
	
	public boolean isPk() {
		return isPk;
	}
	
	
	public void setPk( boolean isPk ) {
		this.isPk = isPk;
	}
	
	
	public String getTestValue() {
		return testValue;
	}
	
	
	public void setTestValue( String testValue ) {
		this.testValue = testValue;
	}
	
}
