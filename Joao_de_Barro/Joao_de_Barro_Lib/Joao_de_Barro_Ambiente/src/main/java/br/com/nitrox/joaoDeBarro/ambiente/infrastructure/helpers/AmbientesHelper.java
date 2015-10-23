package br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambientes;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.SgbdTypes;


public class AmbientesHelper implements Ambientes, SgbdTypes {
	
	public String getAmbienteName( int ambienteCode ) {
		String ambienteName = null;
		
		for ( int i = 0; i < AMBIENTE_CODES.length; i++ ) {
			if ( ambienteCode == AMBIENTE_CODES[i] ) {
				ambienteName = AMBIENTE_NAMES[i];
				break;
			}
		}
		
		return ambienteName;
	}
	
	
	public int getAmbienteCode( String ambienteName ) {
		int ambienteCode = -1;
		
		if ( ambienteName != null ) {
			for ( int i = 0; i < AMBIENTE_NAMES.length; i++ ) {
				if ( ambienteName.equalsIgnoreCase( AMBIENTE_NAMES[i] )) {
					ambienteCode = AMBIENTE_CODES[i];
					break;
				}
			}
		}
		
		return ambienteCode;
	}
	
}
