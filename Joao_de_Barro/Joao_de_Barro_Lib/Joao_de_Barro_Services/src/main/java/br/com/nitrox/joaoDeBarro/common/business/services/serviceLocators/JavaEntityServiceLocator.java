package br.com.nitrox.joaoDeBarro.common.business.services.serviceLocators;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.factories.JavaEntityDaoFactory;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;

public class JavaEntityServiceLocator extends AbstractJoaoDeBarroLogger {
	private static JavaEntityServiceLocator instance;
	private JavaEntityDao javaEntityDao;
	
	private JavaEntityServiceLocator() {
		this.javaEntityDao = JavaEntityDaoFactory.build();
	}
	
	
	public static JavaEntityServiceLocator getInstance() {
		if ( instance == null ) {
			instance = new JavaEntityServiceLocator();
		}
		
		return instance;
	}
	
	
	public JavaEntity[] getJavaEntities() {
		JavaEntity[] javaEntities = javaEntityDao.getJavaEntities();
		return javaEntities;
	}
	
}
