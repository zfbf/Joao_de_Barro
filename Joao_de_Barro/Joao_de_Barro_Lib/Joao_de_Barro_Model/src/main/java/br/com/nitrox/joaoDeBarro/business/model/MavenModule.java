package br.com.nitrox.joaoDeBarro.business.model;

public class MavenModule {
	private String name;
	private String relativePath;
	
	public MavenModule( String name, String relativePath ) {
		this.name = name;
		this.relativePath = relativePath;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName( String name ) {
		this.name = name;
	}
	
	
	public String getRelativePath() {
		return relativePath;
	}
	
	
	public void setRelativePath( String relativePath ) {
		this.relativePath = relativePath;
	}
}
