package br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99;

import java.io.File;
import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.ClassOpeningGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoCreateMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoDeleteMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoRetrieveMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoTruncateMethodGenerator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.fragments.AnsiSql99DaoUpdateMethodGenerator;



public class AnsiSql99DaoCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public AnsiSql99DaoCoordinator() {
		;
	}
	
	
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
			classOpeningGenerator.setSufix( "AnsiSql99Dao" );
			classOpeningGenerator.generate();
			
			AnsiSql99DaoTruncateMethodGenerator truncateMethodGenerator = 
					new AnsiSql99DaoTruncateMethodGenerator( 
							getJavaEntity() );
			truncateMethodGenerator.generate();
			
			AnsiSql99DaoCreateMethodGenerator createMethodGenerator = 
					new AnsiSql99DaoCreateMethodGenerator( 
							getJavaEntity() );
			createMethodGenerator.generate();
			
			AnsiSql99DaoUpdateMethodGenerator updateMethodGenerator = 
					new AnsiSql99DaoUpdateMethodGenerator( 
							getJavaEntity() );
			updateMethodGenerator.generate();
			
			AnsiSql99DaoDeleteMethodGenerator deleteMethodGenerator = 
					new AnsiSql99DaoDeleteMethodGenerator( 
							getJavaEntity() );
			deleteMethodGenerator.generate();
			
			AnsiSql99DaoRetrieveMethodGenerator retrieveMethodGenerator = 
					new AnsiSql99DaoRetrieveMethodGenerator( 
							getJavaEntity() );
			retrieveMethodGenerator.generate();
			
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
		String artifactDir = workDir + "/out/java/persistence/dao/ansiSql99";
		File file = new File( artifactDir );
		return file;
	}
	
	
	public String getArtifactName() {
		String artifactName = getJavaEntity().getNameClassStyle() + "AnsiSql99Dao.java";
		return artifactName;
	}
	
}
