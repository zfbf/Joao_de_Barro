package br.com.nitrox.joaoDeBarro.batchApp.presentation.text;

import java.io.IOException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.business.model.dto.DtoCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.services.generators.java.persistence.dao.ansiSql99.AnsiSql99DaoCoordinator;
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
				generateDtoArtifacts();
				generateAnsiSql99DaoArtifacts();
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
	
	
	private static void generateDtoArtifacts() throws IOException {
		String methodName = "generateDtoArtifacts";
		debugInicioDoMetodo( CLASS_NAME, methodName );
		
		DtoCoordinator dtoCoordinator = new DtoCoordinator();
		JavaEntity[] javaEntities = getJavaEntities();
		
		for ( JavaEntity javaEntity : javaEntities ) {
			dtoCoordinator.setJavaEntity( javaEntity );
			dtoCoordinator.resetBuffer();
			dtoCoordinator.generate();
			dtoCoordinator.save();
		}
	}
	
	
	private static void generateAnsiSql99DaoArtifacts() throws IOException {
		String methodName = "generateAnsiSql99DaoArtifacts";
		debugInicioDoMetodo( CLASS_NAME, methodName );
		
		AnsiSql99DaoCoordinator daoCoordinator = new AnsiSql99DaoCoordinator();
		JavaEntity[] javaEntities = getJavaEntities();
		
		for ( JavaEntity javaEntity : javaEntities ) {
			daoCoordinator.setJavaEntity( javaEntity );
			daoCoordinator.resetBuffer();
			daoCoordinator.generate();
			daoCoordinator.save();
		}
	}
	
	
	private static JavaEntity[] getJavaEntities() {
		JavaEntityServiceLocator javaEntityServiceLocator = JavaEntityServiceLocator.
				getInstance();
		JavaEntity[] javaEntities = javaEntityServiceLocator.getJavaEntities();
		return javaEntities;
	}
	
}
