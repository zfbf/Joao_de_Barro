package br.com.nitrox.joaoDeBarro.business.model;

public interface JavaAttribute {
	
	String getName();
	void setName( String name );
	String getClassStyleName();
	String getAttributeStyleName();
	
	String getColumnName();
	void setColumnName( String columnName );
	String getColumnClassStyleName();
	String getColumnAttributeStyleName();
	
	int getJavaAttributeType();
	void setJavaAttributeType( int javaAttributeType );
	String getJavaAttributeTypeName();
	
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
