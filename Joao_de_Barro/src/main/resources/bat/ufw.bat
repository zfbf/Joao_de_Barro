@echo OFF

IF DEFINED WORKSPACE_DIR ( 
	echo WORKSPACE_DIR = %WORKSPACE_DIR% 
) ELSE ( 
	echo WORKSPACE_DIR is missing 
) 

IF DEFINED PROJETOS_MAVEN_DIR ( 
	echo PROJETOS_MAVEN_DIR = %PROJETOS_MAVEN_DIR% 
) ELSE ( 
	echo PROJETOS_MAVEN_DIR is missing 
)

IF DEFINED PROJETOS_MAVEN_DIR ( 
	IF DEFINED WORKSPACE_DIR ( 
		ant -buildfile %PROJETOS_MAVEN_DIR%/Joao_de_Barro/src/main/resources/xml/ant_files/update_from_workspace/build.xml
	)
)
