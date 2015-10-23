package br.com.nitrox.joaoDeBarro.common.business.services;

import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

public class DeliveryToTarget extends TwoParametersTarget {
	
	public DeliveryToTarget( Writer writer ) {
		super( writer );
	}
	
	
	protected VelocityContext getVelocityContext() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	protected String getDirName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	protected String getRelativePathName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	protected Template getTemplate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private String createCopyTask( String dirName, String relativePath ) {
		StringBuffer sb = new StringBuffer();
		sb.append( "" );
		String copyTask = null;
		
		return copyTask;
	}
	
}
