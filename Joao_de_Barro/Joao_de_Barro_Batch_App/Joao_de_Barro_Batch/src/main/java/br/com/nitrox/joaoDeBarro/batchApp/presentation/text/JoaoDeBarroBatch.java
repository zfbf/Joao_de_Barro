package br.com.nitrox.joaoDeBarro.batchApp.presentation.text;

import java.io.IOException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityGeneratorJavaEntityCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.VelocityGeneratorMavenModulesCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.createWorkspaceDirectories.CreateWorkspaceDirectoriesCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToVersionControlDir.DeliveryToVersionControlDirCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.deliveryToWorkspace.DeliveryToWorkspaceCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromVersionControlDir.UpdateFromVersionControlDirCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.antFile.updateFromWorkspace.UpdateFromWorkspaceCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.business.model.dto.DtoCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.fragments.FragmentsCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.AnsiSql99DaoCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.ansiSql99.ddl.CreateTableCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.sql.sqlServer.storedProcedures.SqlServerStoredProcedureInsertCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.serviceLocators.JavaEntityServiceLocator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractStaticJoaoDeBarroLogger;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;

public class JoaoDeBarroBatch extends AbstractStaticJoaoDeBarroLogger {
	private static final String CLASS_NAME = "JoaoDeBarroBatch";
	private static final long DELAY = 4000;
	
	public static void main( String[] args ) {
		String methodName = "main";
		
		try {
			long inicioExecucao = System.currentTimeMillis();
			
			Log4jConfiguratorServiceLocator serviceLocator = 
					Log4jConfiguratorServiceLocator.getInstance();
			Log4jConfigurator configurator = serviceLocator.getLog4jConfigurator();
			configurator.execute();
			infoInicioDeBloco( CLASS_NAME );
			String version = JoaoDeBarroBatch.class.getPackage().
					getSpecificationVersion();
			info( CLASS_NAME, methodName, "version", version );
			infoInicioDoMetodo( CLASS_NAME, methodName );
			infoAmbiente( CLASS_NAME, methodName );
			Ambiente ambiente = Ambiente.getInstance();
			
			if ( ambiente.isOk() ) {
				executeJavaEntityCoordinators();
				executeMavenModulesCoordinators();
			} else {
				warnAmbienteNaoConfigurado( CLASS_NAME, methodName );
			}
			
			long finalExecucao = System.currentTimeMillis();
			infoAmbiente( CLASS_NAME, methodName );
			infoFinalDeBlocoTempoDecorrido( CLASS_NAME, methodName, 
					inicioExecucao, finalExecucao );
			
			try {
				Thread.sleep( DELAY );
			} catch ( Exception e ) {
				error( CLASS_NAME, methodName, e );
			}
		} catch ( Exception e ) {
			error( CLASS_NAME, methodName, e );
		}
	}
	
	
	private static void executeJavaEntityCoordinators() throws IOException {
		String methodName = "executeJavaEntityCoordinators";
		debugInicioDoMetodo( CLASS_NAME, methodName );
		
		VelocityGeneratorJavaEntityCoordinator[] coordinators = getJavaEntityCoordinators();
		JavaEntity[] javaEntities = getJavaEntities();
		
		for ( VelocityGeneratorJavaEntityCoordinator coordinator : coordinators ) {
			for ( JavaEntity javaEntity : javaEntities ) {
				debug( CLASS_NAME, methodName, javaEntity.getName() );
				coordinator.setJavaEntity( javaEntity );
				coordinator.resetBuffer();
				coordinator.generate();
				coordinator.save();
			}	
		}
	}
	
	
	private static VelocityGeneratorJavaEntityCoordinator[] getJavaEntityCoordinators() {
		VelocityGeneratorJavaEntityCoordinator[] coordinators = new VelocityGeneratorJavaEntityCoordinator[] {
				new DtoCoordinator(),
				new AnsiSql99DaoCoordinator(),
				new SqlServerStoredProcedureInsertCoordinator(),
				new FragmentsCoordinator(),
				new CreateTableCoordinator()
		};
		
		return coordinators;
	}
	
	
	private static void executeMavenModulesCoordinators() throws IOException {
		String methodName = "executeMavenModulesCoordinators";
		debugInicioDoMetodo( CLASS_NAME, methodName );
		
		VelocityGeneratorMavenModulesCoordinator[] coordinators = getMavenModulesCoordinators();
		
		for ( VelocityGeneratorMavenModulesCoordinator coordinator : coordinators ) {
			coordinator.resetBuffer();
			coordinator.generate();
			coordinator.save();
		}
	}
	
	
	private static VelocityGeneratorMavenModulesCoordinator[] getMavenModulesCoordinators() {
		VelocityGeneratorMavenModulesCoordinator[] coordinators = 
				new VelocityGeneratorMavenModulesCoordinator[] {
						new CreateWorkspaceDirectoriesCoordinator(),
						new DeliveryToVersionControlDirCoordinator(),
						new DeliveryToWorkspaceCoordinator(),
						new UpdateFromVersionControlDirCoordinator(),
						new UpdateFromWorkspaceCoordinator()
		};
		
		return coordinators;
	}
	
	
	private static JavaEntity[] getJavaEntities() {
		JavaEntityServiceLocator javaEntityServiceLocator = JavaEntityServiceLocator.
				getInstance();
		JavaEntity[] javaEntities = javaEntityServiceLocator.getJavaEntities();
		return javaEntities;
	}
	
}
