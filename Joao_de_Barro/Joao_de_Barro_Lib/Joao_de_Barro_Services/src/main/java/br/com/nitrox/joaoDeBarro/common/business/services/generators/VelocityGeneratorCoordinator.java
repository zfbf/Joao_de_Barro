package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;


public interface VelocityGeneratorCoordinator extends VelocityGenerator {
	
	void print() throws IOException;
	void flush() throws IOException;
	void generate() throws ResourceNotFoundException;
	void save() throws IOException;
	void save( String content ) throws IOException;
	void resetBuffer();
	
}
