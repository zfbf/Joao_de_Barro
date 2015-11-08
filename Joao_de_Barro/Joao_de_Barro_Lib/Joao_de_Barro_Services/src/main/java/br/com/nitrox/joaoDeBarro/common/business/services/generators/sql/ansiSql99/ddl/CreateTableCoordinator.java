package br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.ansiSql99.ddl;

import java.io.File;
import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;

/*
 * 
 */


public class CreateTableCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public CreateTableCoordinator() {
		;
	}
	
	
	public CreateTableCoordinator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			JoaoDeBarroVelocityEngine jbVelocityEngine = 
					JoaoDeBarroVelocityEngine.getInstance();
			jbVelocityEngine.putInContext( "java_entity", getJavaEntity() );
			
			CreateTableGenerator generator = 
					new CreateTableGenerator( 
							getJavaEntity() );
			generator.generate();
			
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
		String artifactDir = workDir + "/out/sql/ansiSql99/ddl";
		File file = new File( artifactDir );
		return file;
	}
	
	
	public String getArtifactName() {
		String artifactName = getJavaEntity().getTableDbName() + "_create_table.sql";
		return artifactName;
	}
	
}
