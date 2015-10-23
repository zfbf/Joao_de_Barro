package br.com.nitrox.joaoDeBarro.testLogger.infrastructure.log4j;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambientes;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.JoaoDeBarroLogger;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.JoaoDeBarroLoggerImp;



public abstract class AbstractJoaoDeBarroTestLogger extends TestCase 
		implements JoaoDeBarroLogger, Ambientes {
	private static Logger logger = Logger.getLogger( AbstractJoaoDeBarroTestLogger.class );
    private JoaoDeBarroLogger joaoDeBarroLogger;
    
    protected AbstractJoaoDeBarroTestLogger() {
        String className = this.getClass().getName();
        joaoDeBarroLogger = new JoaoDeBarroLoggerImp( className, logger );
    }
    
    
    protected JoaoDeBarroLogger getGdeLogger() {
    	return joaoDeBarroLogger;
    }
    
    
    public void infoInicioDoMetodo( String methodName ) {
    	joaoDeBarroLogger.infoInicioDoMetodo( methodName );
    }
    
    
    public void debugInicioDoMetodo( String methodName ) {
    	joaoDeBarroLogger.debugInicioDoMetodo( methodName );
    }
    
    
    public void debug( String methodName, String message, Object value ) {
    	joaoDeBarroLogger.debug( methodName, message, value );
    }
    
    
    public void debug( String methodName, String message, int value ) {
    	joaoDeBarroLogger.debug( methodName, message, value );
    }
    
    
    public void info( String methodName, String message ) {
    	joaoDeBarroLogger.info( methodName, message );
    }
    
    
    public void info( String methodName, String message, Object value ) {
    	joaoDeBarroLogger.info( methodName, message, value );
    }
    
    
    public void info( String methodName, String message, int intValue ) {
    	joaoDeBarroLogger.info( methodName, message, intValue );
    }
    
    
    public void debug( String methodName, String message ) {
    	joaoDeBarroLogger.debug( methodName, message );
    }
    
    
    public void debug( String methodName, Object object) {
    	joaoDeBarroLogger.debug( methodName, object );
    }
    
    
    public void error( String methodName, Exception e ) {
    	joaoDeBarroLogger.error( methodName, e );
    }
    
    
    public void errorNoConstrutor( Exception e ) {
    	joaoDeBarroLogger.errorNoConstrutor( e );
    }
    
    
    public void warn( String methodName, String message ) {
    	joaoDeBarroLogger.warn( methodName, message );
    }
    
    
    public void warn( String methodName, String message, Object value ) {
    	joaoDeBarroLogger.warn( methodName, message, value );
    }
    
    
    public static void staticWarn( String message ) {
    	logger.warn( message );
    }
    
    
    public void warnNotEllectedToRun( String methodName ) {
    	joaoDeBarroLogger.warnNotEllectedToRun( methodName );
    }
    
    
    public void warnAmbienteNaoConfigurado( String methodName ) {
    	joaoDeBarroLogger.warnAmbienteNaoConfigurado( methodName );
    }
    
    
    protected boolean toRun() {
    	return Ambiente.getInstance().getAmbienteCode() == AMBIENTE_CODE_1;
    }
    
}
