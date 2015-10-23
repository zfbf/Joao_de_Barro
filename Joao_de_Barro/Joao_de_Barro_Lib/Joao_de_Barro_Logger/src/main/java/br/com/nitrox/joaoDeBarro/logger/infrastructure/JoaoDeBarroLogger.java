package br.com.nitrox.joaoDeBarro.logger.infrastructure;


public interface JoaoDeBarroLogger {
	
	void infoInicioDoMetodo( String methodName ); 
	void debugInicioDoMetodo( String methodName ); 
	void debug( String methodName, String message, int value );
    void debug( String methodName, String message, Object value );
    void info( String methodName, String message );
    void info( String methodName, String message, Object value );
    void info( String methodName, String message, int intValue );
    void debug( String methodName, String message );
    void debug( String methodName, Object object );
    void error( String methodName, Exception e );
    void errorNoConstrutor( Exception e );
    void warn( String methodName, String message );
    void warn( String methodName, String message, Object value );
    void warnNotEllectedToRun( String methodName );	
    void warnAmbienteNaoConfigurado( String methodName );
    
}
