package br.com.nitrox.joaoDeBarro.common.persistence.dao;

import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;

public interface JavaEntityDao {
	
	JavaEntity getJavaEntity( int entityCode );
	JavaEntity[] getJavaEntities();
	
}
