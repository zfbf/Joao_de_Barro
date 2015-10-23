package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.configurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambientes;


public abstract class Log4jPropertiesFileConfigurator extends AbstractLog4jDefaultConfigurator
		implements Log4jConfigurator, Ambientes {
	private Properties properties;
	private String propertiesFileName;
	private String workDir;
	
	
	public Log4jPropertiesFileConfigurator( String propertiesFileName ) {
		this.propertiesFileName = propertiesFileName;
		this.workDir = Ambiente.getInstance().getWorkDir();
		init();
	}
	
	
	protected void init() {
		InputStream is = null;
		
		try {
			is = getPropertiesInputStream();
			
			if ( is != null ) {
				properties = new Properties();
				properties.load( is );
				is.close();
				String logDirPropertyName = "log4j.appender.DailyRollingLogFile.File";
				String logDirPropertyValue = workDir + "/log/Joao_de_Barro.log";
				properties.put( logDirPropertyName, logDirPropertyValue );	
			}
		} catch ( Exception e ) {
			e.printStackTrace();
			properties = null;
		}
	}
	
	
	private InputStream getPropertiesInputStream() throws FileNotFoundException {
		InputStream is = null;
		String resourceFileName = null;
		
		if ( workDir != null ) {
			File file = new File( this.workDir, propertiesFileName );
			
			if ( file.canRead() ) {
				is = new FileInputStream( file );
			} else {
				resourceFileName = "/" + propertiesFileName;
				ClassLoader cl = this.getClass().getClassLoader();
				System.out.println( "cl: " + cl );
				is = cl.getResourceAsStream( resourceFileName );
			}
		}
		
		System.out.println( "resourceFileName: " + resourceFileName );
		System.out.println( "is: " + is );
		return is;
	}
	
	
	protected void configureLogger() throws IOException {
		if ( properties != null ) {
			PropertyConfigurator.configure( properties );
		} else {
			Log4jDefaultConfigurator.getInstance().execute();
		}
	}
	
	
	protected void checkLogDirectory() {
		Ambiente ambiente = Ambiente.getInstance();
		String workDir = ambiente.getWorkDir();
		File dir = new File( workDir, "log" );
		
		try {
			if ( ! dir.exists() ) {
				dir.mkdir();
			}
		} catch ( Exception e ) {
			;
		}
	}
	
	
	public String getPropertyValue( String key ) {
		return properties.getProperty( key );
	}
	
}
