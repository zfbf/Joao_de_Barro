package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j;

import org.apache.log4j.Logger;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.JoaoDeBarroLogger;




public abstract class AbstractJoaoDeBarroLogger implements JoaoDeBarroLogger {
	private static Logger logger = Logger.getLogger( AbstractJoaoDeBarroLogger.class );
    private JoaoDeBarroLogger gpsLogger;
    
    protected AbstractJoaoDeBarroLogger() {
        String className = this.getClass().getName();
        gpsLogger = new JoaoDeBarroLoggerImp( className, logger );
    }
    
    
    protected JoaoDeBarroLogger getGdeLogger() {
    	return gpsLogger;
    }
    
    
    public void infoInicioDoMetodo( String methodName ) {
    	gpsLogger.infoInicioDoMetodo( methodName );
    }
    
    
    public void debugInicioDoMetodo( String methodName ) {
    	gpsLogger.debugInicioDoMetodo( methodName );
    }
    
    
    public void debug( String methodName, String message, Object value ) {
    	gpsLogger.debug( methodName, message, value );
    }
    
    
    public void debug( String methodName, String message, int value ) {
    	gpsLogger.debug( methodName, message, value );
    }
    
    
    public void info( String methodName, String message ) {
    	gpsLogger.info( methodName, message );
    }
    
    
    public void info( String methodName, String message, Object value ) {
    	gpsLogger.info( methodName, message, value );
    }
    
    
    public void info( String methodName, String message, int intValue ) {
    	gpsLogger.info( methodName, message, intValue );
    }
    
    
    public void debug( String methodName, String message ) {
    	gpsLogger.debug( methodName, message );
    }
    
    
    public void debug( String methodName, Object object) {
    	gpsLogger.debug( methodName, object );
    }
    
    
    public void error( String methodName, Exception e ) {
    	gpsLogger.error( methodName, e );
    }
    
    
    public void errorNoConstrutor( Exception e ) {
    	gpsLogger.errorNoConstrutor( e );
    }
    
    
    public void warn( String methodName, String message ) {
    	gpsLogger.warn( methodName, message );
    }
    
    
    public void warn( String methodName, String message, Object value ) {
    	gpsLogger.warn( methodName, message, value );
    }
    
    
    public static void staticWarn( String message ) {
    	logger.warn( message );
    }
    
    
    public void warnNotEllectedToRun( String methodName ) {
    	gpsLogger.warnNotEllectedToRun( methodName );
    }
    
    
    public void warnAmbienteNaoConfigurado( String methodName ) {
    	gpsLogger.warnAmbienteNaoConfigurado( methodName );
    }

}
