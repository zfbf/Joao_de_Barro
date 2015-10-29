package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99;

import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.ClassOpeningGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoCreateMethodGenerator;



public class AnsiSql99DaoCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public AnsiSql99DaoCoordinator( JavaEntity javaEntity ) {
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
			classOpeningGenerator.setSufix( "SqlServerDao" );
			classOpeningGenerator.generate();
			
			AnsiSql99DaoCreateMethodGenerator createMethodGenerator = 
					new AnsiSql99DaoCreateMethodGenerator( 
							getJavaEntity() );
			createMethodGenerator.generate();
			
			flush();
		} catch ( IOException e ) {
			error( methodName, e );
		} catch ( ResourceNotFoundException e ) {
			error( methodName, e );
			throw e;
		}
	}
	
}