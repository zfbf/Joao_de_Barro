package br.com.nitrox.joaoDeBarro.business.model.factories;

import br.com.nitrox.joaoDeBarro.business.model.DateJavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.IntegerWrapperJavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.PrimitiveIntJavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.PrimitiveLongJavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.StringJavaAttribute;

public class JavaAttributeFactory implements JavaAttributeTypes {
	
	public static JavaAttribute build( 
			String name,
			String columnName,
			int javaAttributeType,
			String databaseType,
			boolean allowNull,
			boolean isIdentity,
			boolean isPk,
			String testValue ) {
		JavaAttribute javaAttribute = null;
		
		switch ( javaAttributeType ) {
		case JAVA_ATTRIBUTE_TYPE_INT:
			javaAttribute = new PrimitiveIntJavaAttribute();
			break;
			
		case JAVA_ATTRIBUTE_TYPE_LONG:
			javaAttribute = new PrimitiveLongJavaAttribute();
			break;
			
		case JAVA_ATTRIBUTE_TYPE_DATE:
			javaAttribute = new DateJavaAttribute();
			break;
			
		case JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER:
			javaAttribute = new IntegerWrapperJavaAttribute();
			break;
			
		case JAVA_ATTRIBUTE_TYPE_STRING:
			javaAttribute = new StringJavaAttribute();
			break;
			
		default:
			break;
		}
		
		javaAttribute.setName( name );
		javaAttribute.setColumnName( columnName );
		javaAttribute.setType( javaAttributeType );
		javaAttribute.setDatabaseType( databaseType );
		javaAttribute.setAllowNull( allowNull );
		javaAttribute.setIdentity( isIdentity );
		javaAttribute.setPk( isPk );
		javaAttribute.setTestValue( testValue );
		return javaAttribute;
	}
	
}
