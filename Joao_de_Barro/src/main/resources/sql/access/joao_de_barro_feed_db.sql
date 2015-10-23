INSERT INTO JAVA_PROJECT (nom_java_project) VALUES (
	'GPS'
);



INSERT INTO JAVA_MODULE (nom_java_module, ide_java_project) 
	SELECT 
		'GPS_Extracao_Common', 
		ide_java_project 
	FROM 
		JAVA_PROJECT 
	WHERE 
		nom_java_project = 'GPS';

INSERT INTO JAVA_MODULE (nom_java_module, ide_java_project) 
	SELECT 
		'GPS_Extracao_Solicitacoes_Remedy', 
		ide_java_project 
	FROM 
		JAVA_PROJECT 
	WHERE 
		nom_java_project = 'GPS';



INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'int'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'long'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'float'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'String'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'Integer_Wrapper'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'Float_Wrapper'
);

INSERT INTO JAVA_ATTRIBUTE_TYPE (nom_java_attribute_type) VALUES (
	'Date'
);



INSERT INTO JAVA_ENTITY (nom_java_entity, nom_db_table, ide_java_module) 
	SELECT 
		'data_staging_hpd_help_desk',
		'CAD_REMEDY_HPD_HELP_DESK',
		ide_java_module
	FROM 
		JAVA_MODULE
	WHERE 
		nom_java_module = 'GPS_Extracao_Solicitacoes_Remedy';



#############################################################################
####  data_staging_hpd_help_desk  ###########################################
#############################################################################

INSERT INTO JAVA_ATTRIBUTE (
		nom_java_attribute,
		ide_java_entity,
		ide_java_attribute_type,
		nom_db_column )
	SELECT 
		'entry_id',
		ide_java_entity,
		ide_java_attribute_type,
		'entry_id'
	FROM 
		JAVA_ATTRIBUTE_TYPE j_attribute_type,
		
		JAVA_ENTITY j_entity
		
		INNER JOIN JAVA_MODULE j_module
			ON j_module.ide_java_module = j_entity.ide_java_module
	WHERE 
		j_entity.nom_java_entity = 'data_staging_hpd_help_desk'
		AND j_module.nom_java_module = 'GPS_Extracao_Solicitacoes_Remedy'
		AND j_attribute_type.nom_java_attribute_type = 'String';



INSERT INTO JAVA_ATTRIBUTE (
		nom_java_attribute,
		ide_java_entity,
		ide_java_attribute_type,
		nom_db_column )
	SELECT 
		'entry_id',
		ide_java_entity,
		ide_java_attribute_type,
		'entry_id'
	FROM 
		JAVA_ATTRIBUTE_TYPE j_attribute_type,
		
		JAVA_ENTITY j_entity
		
		INNER JOIN JAVA_MODULE j_module
			ON j_module.ide_java_module = j_entity.ide_java_module
	WHERE 
		j_entity.nom_java_entity = 'data_staging_hpd_help_desk'
		AND j_module.nom_java_module = 'GPS_Extracao_Solicitacoes_Remedy'
		AND j_attribute_type.nom_java_attribute_type = 'String';