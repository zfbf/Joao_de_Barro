@echo OFF

IF DEFINED VERSION_CONTROL_DIR ( 
	echo VERSION_CONTROL_DIR = %VERSION_CONTROL_DIR% 
) ELSE ( 
	echo VERSION_CONTROL_DIR is missing 
)

IF DEFINED PROJETOS_MAVEN_DIR ( 
	echo PROJETOS_MAVEN_DIR = %PROJETOS_MAVEN_DIR% 
) ELSE ( 
	echo PROJETOS_MAVEN_DIR is missing 
)

IF DEFINED PROJETOS_MAVEN_DIR ( 
	IF DEFINED VERSION_CONTROL_DIR ( 
		ant -buildfile %PROJETOS_MAVEN_DIR%/Joao_de_Barro/src/main/resources/xml/ant_files/update_from_version_control_dir/build.xml
	)
)
