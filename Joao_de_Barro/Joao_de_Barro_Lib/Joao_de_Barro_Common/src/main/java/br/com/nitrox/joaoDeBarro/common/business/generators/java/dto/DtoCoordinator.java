package br.com.nitrox.joaoDeBarro.common.business.generators.java.dto;

import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.common.business.generators.java.AbstractJavaEntityCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.AttributeDeclarationGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.ClassOpeningGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.ToStringMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.getMethods.GetMethodGeneratorHandler;
import br.com.nitrox.joaoDeBarro.common.business.generators.java.fragments.setMethods.SetMethodGeneratorHandler;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;



public class DtoCoordinator extends AbstractJavaEntityCoordinator {
	
	public DtoCoordinator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public DtoGenerator getVelocityFragmentGenerator() {
		return new DtoGenerator( 
				getVelocityContext(), getWriter(), getJavaEntity() );
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			ClassOpeningGenerator classOpeningGenerator = 
					new ClassOpeningGenerator(
							getVelocityContext(),
							getWriter(),
							getJavaEntity() );
			classOpeningGenerator.setSufix( "Dto" );
			classOpeningGenerator.generate();
			
			AttributeDeclarationGenerator adGenerator = 
					new AttributeDeclarationGenerator( 
							getVelocityContext(),
							getWriter(),
							getJavaEntity() );
			adGenerator.generate();
			
			GetMethodGeneratorHandler getMethodGeneratorHandler =
					new GetMethodGeneratorHandler(
							getVelocityContext(),
							getWriter() );
			
			SetMethodGeneratorHandler setMethodGeneratorHandler =
					new SetMethodGeneratorHandler(
							getVelocityContext(),
							getWriter() );
			
			JavaAttribute[] javaAttributes = getJavaEntity().getJavaAttributes();
			
			for ( JavaAttribute javaAttribute : javaAttributes ) {
				getMethodGeneratorHandler.generate( javaAttribute );
				setMethodGeneratorHandler.generate( javaAttribute );
			}
			
			ToStringMethodGenerator toStringMethodGenerator = 
					new ToStringMethodGenerator( 
							getVelocityContext(),
							getWriter(),
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
