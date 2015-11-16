package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments;

import java.io.File;
import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;



public class FragmentsCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public FragmentsCoordinator() {
		;
	}
	
	
	public FragmentsCoordinator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			JoaoDeBarroVelocityEngine jbVelocityEngine = 
					JoaoDeBarroVelocityEngine.getInstance();
			jbVelocityEngine.putInContext( "java_entity", getJavaEntity() );
			
			AttributeCloneGenerator attributeCloneGenerator = 
					new AttributeCloneGenerator(
							getJavaEntity() );
			attributeCloneGenerator.setWriter( getWriter() );
			attributeCloneGenerator.generate();
			
			FactoryFromCsvGenerator factoryFromCsvGenerator = 
					new FactoryFromCsvGenerator(
							getJavaEntity() );
			factoryFromCsvGenerator.setWriter( getWriter() );
			factoryFromCsvGenerator.generate();
			
			flush();
		} catch ( IOException e ) {
			error( methodName, e );
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
			throw e;
		}
	}
	
	
	public File getArtifactParentDir() {
		String workDir = Ambiente.getInstance().getWorkDir();
		String artifactDir = workDir + "/out/java/fragments";
		File file = new File( artifactDir );
		return file;
	}
	
	
	public String getArtifactName() {
		String artifactName = getJavaEntity().getNameClassStyle() + "Fragments.java";
		return artifactName;
	}
	
}
