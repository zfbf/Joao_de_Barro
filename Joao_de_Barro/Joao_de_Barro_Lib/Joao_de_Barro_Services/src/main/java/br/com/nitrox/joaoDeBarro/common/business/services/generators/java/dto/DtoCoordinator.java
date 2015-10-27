package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.dto;

import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

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
			classOpeningGenerator.generate();
			
			AttributeDeclarationGenerator adGenerator = 
					new AttributeDeclarationGenerator( 
							getJavaEntity() );
			adGenerator.generate();
			
			GetMethodGeneratorHandler getMethodGeneratorHandler =
					new GetMethodGeneratorHandler();
			
			SetMethodGeneratorHandler setMethodGeneratorHandler =
					new SetMethodGeneratorHandler();
			
			JavaAttribute[] javaAttributes = getJavaEntity().getJavaAttributes();
			
			for ( JavaAttribute javaAttribute : javaAttributes ) {
				getMethodGeneratorHandler.generate( javaAttribute );
				setMethodGeneratorHandler.generate( javaAttribute );
			}
			
			ToStringMethodGenerator toStringMethodGenerator = 
					new ToStringMethodGenerator( 
							getJavaEntity() );
			toStringMethodGenerator.generate();
			
			flush();
		} catch ( IOException e ) {
			error( methodName, e );
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
			throw e;
		}
	}
	
}
