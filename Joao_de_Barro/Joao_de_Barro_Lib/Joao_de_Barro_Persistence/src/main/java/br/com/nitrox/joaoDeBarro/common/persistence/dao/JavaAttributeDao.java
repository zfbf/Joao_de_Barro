package br.com.nitrox.joaoDeBarro.common.persistence.dao;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;


public interface JavaAttributeDao {
	
	JavaAttribute[] getJavaAttributes( String entityName );
	
}
