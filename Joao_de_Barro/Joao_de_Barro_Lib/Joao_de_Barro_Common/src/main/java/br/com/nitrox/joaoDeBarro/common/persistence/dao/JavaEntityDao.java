package br.com.nitrox.joaoDeBarro.common.persistence.dao;

import br.com.nitrox.joaoDeBarro.common.business.model.JavaEntity;

public interface JavaEntityDao {
	
	JavaEntity getJavaEntity( String entityName );
	
}
