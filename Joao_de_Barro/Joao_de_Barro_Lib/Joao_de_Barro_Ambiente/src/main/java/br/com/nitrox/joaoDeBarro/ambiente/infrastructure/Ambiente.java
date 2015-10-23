package br.com.nitrox.joaoDeBarro.ambiente.infrastructure;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers.AmbientesHelper;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.helpers.SgbdTypesHelper;




public final class Ambiente implements Ambientes, Databases, DatabaseLocations, 
		Schemas, FileUploadDirLocations, SgbdTypes, Platforms {
	private static Ambiente instance;
	private int ambienteCode;
	private int sgbdTypeCode;
	private String workDir;
	
	private Ambiente() {
		init();
	}
	
	
	public static Ambiente getInstance() {
		if ( instance == null ) {
			instance = new Ambiente();
		}
		
		return instance;
	}
	
	
	private void init() {
		initAmbienteCode();
		initSgbdTypeCode();
		initWorkDir();
	}
	
	
	private void initAmbienteCode() {
		AmbientesHelper ambientesHelper = new AmbientesHelper();
		String ambienteName = System.getProperty( "JOAO_DE_BARRO_ENV" );
		
		if ( ambienteName == null ) {
			ambienteName = System.getenv( "JOAO_DE_BARRO_ENV" );
		}
		
		this.ambienteCode = ambientesHelper.getAmbienteCode( ambienteName );
	}
	
	
	private void initSgbdTypeCode() {
		SgbdTypesHelper sgbdTypesHelper = new SgbdTypesHelper();
		String sgbdTypeName = System.getenv( "JOAO_DE_BARRO_SGBD_TYPE" );
		
		if ( sgbdTypeName == null ) {
			sgbdTypeName = SGBD_TYPE_NAME_MSSQLSERVER;
		}
		
		this.sgbdTypeCode = sgbdTypesHelper.getSgbdTypeCode( sgbdTypeName );
	}
	
	
	private void initWorkDir() {
		String workDirName = System.getProperty( "JOAO_DE_BARRO_WORK_DIR" );
		
		if ( workDirName == null ) {
			workDirName = System.getenv( "JOAO_DE_BARRO_WORK_DIR" );
		}
		
		this.workDir = workDirName;
	}
	
	
	public int getSgbdTypeCode() {
		return sgbdTypeCode;
	}
	
	
	public int getAmbienteCode() {
		return ambienteCode;
	}
	
	
	public String getAmbienteName() {
		AmbientesHelper ambientesHelper = new AmbientesHelper();
		String ambienteName = ambientesHelper.getAmbienteName( ambienteCode );
		return ambienteName;
	}
	
	
	public void setAmbiente( String ambienteName ) {
		AmbientesHelper ambientesHelper = new AmbientesHelper();
		this.ambienteCode = ambientesHelper.getAmbienteCode( ambienteName );
	}
	
	
	public void setAmbiente( int ambienteCode ) {
		this.ambienteCode = ambienteCode;
	}
	
	
	public String getSgbdTypeName() {
		SgbdTypesHelper sgbdTypesHelper = new SgbdTypesHelper();
		String sgbdTypeName = sgbdTypesHelper.getSgbdTypeName( sgbdTypeCode );
		return sgbdTypeName;
	}
	
	
	public void setSgbdType( String sgbdTypeName ) {
		SgbdTypesHelper sgbdTypesHelper = new SgbdTypesHelper();
		this.sgbdTypeCode = sgbdTypesHelper.getSgbdTypeCode( sgbdTypeName );
	}
	
	
	public void setSgbdType( int sgbdTypeCode ) {
		this.sgbdTypeCode = sgbdTypeCode;
	}
	
	
	public String getWorkDir() {
		return workDir;
	}
	
	
	public boolean isAmbiente4() {
		return ambienteCode == AMBIENTE_CODE_4;
	}
	
	
	public boolean isAmbiente1() {
		return ambienteCode == AMBIENTE_CODE_1;
	}
	
	
	public boolean isAmbiente2() {
		return ambienteCode == AMBIENTE_CODE_2;
	}
	
	
	public boolean isAmbiente3() {
		return ambienteCode == AMBIENTE_CODE_3;
	}
	
	
	public String getJavaVersion() {
		String javaVersion = System.getProperty( "java.version" );
		return javaVersion;
	}
	
	
	public boolean isOk() {
		return workDir != null;
	}
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append( "name: " ).append( getAmbienteName() );
		sb.append( ", javaVersion: " ).append( getJavaVersion() );
		sb.append( ", gdeSgbdTypeName: " ).append( getSgbdTypeName() );
		sb.append( "\nworkDir: " ).append( getWorkDir() );
		return sb.toString();
	}
	
}
