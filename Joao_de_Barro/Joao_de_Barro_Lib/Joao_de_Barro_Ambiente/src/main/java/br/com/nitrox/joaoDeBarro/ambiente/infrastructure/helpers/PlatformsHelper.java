package br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Platforms;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.SgbdTypes;


public class PlatformsHelper implements Platforms, SgbdTypes {
	
	public String getPlatformName( int platformCode ) {
		String platformName = null;
		
		for ( int i = 0; i < PLATFORM_CODES.length; i++ ) {
			if ( platformCode == PLATFORM_CODES[i] ) {
				platformName = PLATFORM_NAMES[i];
				break;
			}
		}
		
		return platformName;
	}
	
	
	public int getPlatformCode( String platformName ) {
		int platformCode = -1;
		
		if ( platformName != null ) {
			for ( int i = 0; i < PLATFORM_NAMES.length; i++ ) {
				if ( platformName.equalsIgnoreCase( PLATFORM_NAMES[i] )) {
					platformCode = PLATFORM_CODES[i];
					break;
				}
			}
		}
		
		return platformCode;
	}
	
}
