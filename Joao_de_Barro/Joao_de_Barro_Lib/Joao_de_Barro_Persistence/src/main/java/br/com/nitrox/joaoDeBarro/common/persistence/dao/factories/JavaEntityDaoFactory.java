package br.com.nitrox.joaoDeBarro.common.persistence.dao.factories;

import br.com.nitrox.joaoDeBarro.common.persistence.dao.JavaEntityDao;
import br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.JavaEntityJavaCodeDao;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;

public class JavaEntityDaoFactory extends AbstractJoaoDeBarroLogger {
	
	public static JavaEntityDao build() {
		JavaEntityDao javaEntityDao = new JavaEntityJavaCodeDao();
		return javaEntityDao;
	}
	
}
