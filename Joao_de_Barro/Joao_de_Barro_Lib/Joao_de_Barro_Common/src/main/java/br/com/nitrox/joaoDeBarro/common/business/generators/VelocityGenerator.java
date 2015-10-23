package br.com.nitrox.joaoDeBarro.common.business.generators;

import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.ResourceNotFoundException;

public interface VelocityGenerator {
	
	void generate() throws ResourceNotFoundException;
	Writer getWriter();
	VelocityContext getVelocityContext();
	
}
