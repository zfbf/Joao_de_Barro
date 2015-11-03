package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;


public interface VelocityGeneratorCoordinator extends VelocityGenerator {
	
	void print() throws IOException;
	void flush() throws IOException;
	void save() throws IOException;
	void save( String content ) throws IOException;
	void resetBuffer();
	
}
