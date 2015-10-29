package br.com.nitrox.joaoDeBarro.business.model;

public interface JavaAttribute {
	
	String getName();
	void setName( String name );
	String getNameClassStyle();
	String getNameAttributeStyle();
	
	String getColumnName();
	void setColumnName( String columnName );
	String getColumnNameClassStyle();
	String getColumnNameAttributeStyle();
	
	int getType();
	void setType( int javaAttributeType );
	String getTypeName();
	
	String getDatabaseType();
	void setDatabaseType( String databaseType );
	
	boolean isAllowNull();
	void setAllowNull( boolean allowNull );
	
	boolean isIdentity();
	void setIdentity( boolean identity );
	
	boolean isPk();
	void setPk( boolean pk );
	
	String getTestValue();
	void setTestValue( String testValue );
	
}
