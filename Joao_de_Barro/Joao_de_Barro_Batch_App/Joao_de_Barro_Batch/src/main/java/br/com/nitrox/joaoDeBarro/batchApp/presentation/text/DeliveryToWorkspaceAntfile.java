package br.com.nitrox.joaoDeBarro.batchApp.presentation.text;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.common.business.generators.VelocityGeneratorCoordinator;
import br.com.nitrox.joaoDeBarro.common.business.generators.antFile.deliveryToWorkspace.DeliveryToWorkspaceCoordinator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractStaticJoaoDeBarroLogger;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator.Log4jConfigurator;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.serviceLocator.Log4jConfiguratorServiceLocator;

public class DeliveryToWorkspaceAntfile extends AbstractStaticJoaoDeBarroLogger {
	private static final String CLASS_NAME = "DeliveryToWorkspaceAntfile";
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
			String version = DeliveryToWorkspaceAntfile.class.getPackage().
					getSpecificationVersion();
			info( CLASS_NAME, methodName, "version", version );
			infoInicioDoMetodo( CLASS_NAME, methodName );
			infoAmbiente( CLASS_NAME, methodName );
			Ambiente ambiente = Ambiente.getInstance();
			
			if ( ambiente.isOk() ) {
				VelocityGeneratorCoordinator deliveryTogenerator = 
						new DeliveryToWorkspaceCoordinator();
				deliveryTogenerator.generate();	
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
	
}
