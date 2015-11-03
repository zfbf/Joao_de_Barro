package br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.sqlServer.storedProcedures;

import java.io.File;
import java.io.IOException;

import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityConstants;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.JoaoDeBarroVelocityEngine;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.AbstractJavaEntityCoordinator;

/*
		CREATE PROCEDURE ##ctl_carga_gps_insert_sp (
				@num_cod_carga_p int,
				@ind_incremental_p char,
				@dat_inicio_extracao_p datetime,
				@dat_fim_extracao_p datetime,
				@dat_inicio_transformacao_p datetime,
				@dat_fim_transformacao_p datetime,
				@dat_inicio_sincronizacao_p datetime,
				@dat_fim_sincronizacao_p datetime,
				@des_comentario_p text,
				@ide_carga_gps_p int OUTPUT
			)
		AS
			SET NOCOUNT ON;
			BEGIN TRANSACTION;
			
			INSERT INTO ##CTL_CARGA_GPS( 
				num_cod_carga,
				ind_incremental,
				dat_inicio_extracao,
				dat_fim_extracao,
				dat_inicio_transformacao,
				dat_fim_transformacao,
				dat_inicio_sincronizacao,
				dat_fim_sincronizacao,
				des_comentario
			) VALUES ( 
				@num_cod_carga_p,
				@ind_incremental_p,
				@dat_inicio_extracao_p,
				@dat_fim_extracao_p,
				@dat_inicio_transformacao_p,
				@dat_fim_transformacao_p,
				@dat_inicio_sincronizacao_p,
				@dat_fim_sincronizacao_p,
				@des_comentario_p
			);
			
			SELECT @ide_carga_gps_p = @@IDENTITY;
			COMMIT TRANSACTION;
		GO; 
 */


public class SqlServerStoredProcedureInsertCoordinator extends AbstractJavaEntityCoordinator
		implements JoaoDeBarroVelocityConstants {
	
	public SqlServerStoredProcedureInsertCoordinator() {
		;
	}
	
	
	public SqlServerStoredProcedureInsertCoordinator( JavaEntity javaEntity ) {
		super( javaEntity );
	}
	
	
	public void generate() throws ResourceNotFoundException {
		String methodName = "generate";
		infoInicioDoMetodo( methodName );
		
		try {
			JoaoDeBarroVelocityEngine jbVelocityEngine = 
					JoaoDeBarroVelocityEngine.getInstance();
			jbVelocityEngine.putInContext( "java_entity", getJavaEntity() );
			
			SqlServerStoredProcedureInsertGenerator generator = 
					new SqlServerStoredProcedureInsertGenerator( 
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
		String artifactDir = workDir + "/out/sql/storedProcedures";
		File file = new File( artifactDir );
		return file;
	}
	
	
	public String getArtifactName() {
		String artifactName = getJavaEntity().getTableDbName() + "_INSERT_SP.sql";
		return artifactName;
	}
	
}
