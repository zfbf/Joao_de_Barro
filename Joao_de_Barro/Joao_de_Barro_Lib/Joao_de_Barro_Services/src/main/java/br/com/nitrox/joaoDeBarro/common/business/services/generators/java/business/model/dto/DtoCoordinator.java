package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.business.model.dto;

import java.io.File;
import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.AttributeDeclarationGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.ClassOpeningGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.ToStringMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.getMethods.GetMethodGeneratorHandler;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.setMethod.SetMethodGeneratorHandler;



public class DtoCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public DtoCoordinator() {
		;
	}
	
	
	public DtoCoordinator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			JoaoDeBarroVelocityEngine jbVelocityEngine = 
					JoaoDeBarroVelocityEngine.getInstance();
			jbVelocityEngine.putInContext( "java_entity", getJavaEntity() );
			
			ClassOpeningGenerator classOpeningGenerator = 
					new ClassOpeningGenerator(
							getJavaEntity() );
			classOpeningGenerator.setSufix( "Dto" );
			classOpeningGenerator.setWriter( getWriter() );
			classOpeningGenerator.generate();
			
			AttributeDeclarationGenerator adGenerator = 
					new AttributeDeclarationGenerator( 
							getJavaEntity() );
			adGenerator.setWriter( getWriter() );
			adGenerator.generate();
			
			GetMethodGeneratorHandler getMethodGeneratorHandler =
					new GetMethodGeneratorHandler();
			getMethodGeneratorHandler.setWriter( getWriter() );
			
			SetMethodGeneratorHandler setMethodGeneratorHandler =
					new SetMethodGeneratorHandler();
			setMethodGeneratorHandler.setWriter( getWriter() );
			
			JavaAttribute[] javaAttributes = getJavaEntity().getJavaAttributes();
			
			for ( JavaAttribute javaAttribute : javaAttributes ) {
				getMethodGeneratorHandler.generate( javaAttribute );
				setMethodGeneratorHandler.generate( javaAttribute );
			}
			
			ToStringMethodGenerator toStringMethodGenerator = 
					new ToStringMethodGenerator( 
							getJavaEntity() );
			toStringMethodGenerator.setWriter( getWriter() );
			toStringMethodGenerator.generate();
			
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
		String artifactDir = workDir + "/out/java/business/model";
		File file = new File( artifactDir );
		return file;
	}
	
	
	public String getArtifactName() {
		String artifactName = getJavaEntity().getNameClassStyle() + "Dto.java";
		return artifactName;
	}
	
}
