package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;


public interface VelocityFragmentGenerator extends VelocityGenerator {
	
	void flush() throws IOException;
	
} 
