package br.com.nitrox.joaoDeBarro.common.business.generators;

import java.io.IOException;


public interface VelocityFragmentGenerator extends VelocityGenerator {
	
	void flush() throws IOException;
	
} 
