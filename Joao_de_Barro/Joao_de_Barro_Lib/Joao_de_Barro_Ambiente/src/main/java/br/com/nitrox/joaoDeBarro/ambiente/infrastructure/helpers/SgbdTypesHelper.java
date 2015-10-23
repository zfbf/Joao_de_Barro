package br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.SgbdTypes;


public class SgbdTypesHelper implements SgbdTypes {
	
	public String getSgbdTypeName( int sgbdTypeCode ) {
		String sgbdTypeName = null;
		
		for ( int i = 0; i < SGBD_TYPE_CODES.length; i++ ) {
			if ( sgbdTypeCode == SGBD_TYPE_CODES[i] ) {
				sgbdTypeName = SGBD_TYPE_NAMES[i];
				break;
			}
		}
		
		return sgbdTypeName;
	}
	
	
	public int getSgbdTypeCode( String sgbdTypeName ) {
		int sgbdTypeCode = -1;
		
		if ( sgbdTypeName != null ) {
			for ( int i = 0; i < SGBD_TYPE_NAMES.length; i++ ) {
				if ( sgbdTypeName.equalsIgnoreCase( SGBD_TYPE_NAMES[i] )) {
					sgbdTypeCode = SGBD_TYPE_CODES[i];
					break;
				}
			}
		}
		
		return sgbdTypeCode;
	}

}
