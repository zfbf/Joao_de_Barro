package br.com.nitrox.joaoDeBarro.common.business.util;

public class NameStyleFormatter {
	
	public static String toAttributeStyle( String dbStyleName ) {
		String attributeStyleName = dbStyleName.toLowerCase();
		int tam = attributeStyleName.length();
		char c = 0;
		StringBuffer sb = new StringBuffer();
		
		for ( int i = 0; i < tam; i++ ) {
			c = attributeStyleName.charAt( i );
			
			if ( c == '_' ) {
				c = attributeStyleName.charAt( ++i );
				sb.append( Character.toUpperCase( c ));
			} else {
				sb.append( c );
			}
		}
		
		attributeStyleName = sb.toString();
		return attributeStyleName;
	}
	
	
	public static String toClassStyle( String dbStyleName ) {
		String classStyleName = null;
		
		if ( dbStyleName != null ) {
			classStyleName = dbStyleName.toLowerCase();
			int tam = classStyleName.length();
			char c = Character.toUpperCase( classStyleName.charAt( 0 ));
			StringBuffer sb = new StringBuffer();
			sb.append( c );
			
			for ( int i = 1; i < tam; i++ ) {
				c = classStyleName.charAt( i );
				
				if ( c == '_' ) {
					c = classStyleName.charAt( ++i );
					sb.append( Character.toUpperCase( c ));
				} else {
					sb.append( c );
				}
			}
			
			classStyleName = sb.toString();
		}
		
		return classStyleName;
	}
	
}
