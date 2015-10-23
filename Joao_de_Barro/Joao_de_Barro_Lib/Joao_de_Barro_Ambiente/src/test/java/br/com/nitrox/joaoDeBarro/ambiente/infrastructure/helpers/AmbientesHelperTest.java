package br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers;

import junit.framework.TestCase;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambientes;

public class AmbientesHelperTest extends TestCase
		implements Ambientes {
	private AmbientesHelper ambientesHelper;

	protected void setUp() throws Exception {
		ambientesHelper = new AmbientesHelper();
	}
	
	
	protected void tearDown() throws Exception {
		ambientesHelper = null;
	}
	
	
	public void testGetAmbienteName() {
		int ambienteCode = AMBIENTE_CODE_1;
		String ambienteName = ambientesHelper.getAmbienteName( ambienteCode );
		assertTrue( ambienteName.equals( AMBIENTE_NAME_1 ));
	}
	
	
	public void testGetAmbienteCode() {
		String ambienteName = AMBIENTE_NAME_1;
		int ambienteCode = ambientesHelper.getAmbienteCode( ambienteName );
		assertEquals( AMBIENTE_CODE_1, ambienteCode );
	}
	
}
