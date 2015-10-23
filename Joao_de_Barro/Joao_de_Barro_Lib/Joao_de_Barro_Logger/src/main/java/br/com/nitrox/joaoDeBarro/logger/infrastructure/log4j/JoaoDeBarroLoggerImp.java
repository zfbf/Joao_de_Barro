package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j;

import org.apache.log4j.Logger;

import br.com.nitrox.joaoDeBarro.logger.infrastructure.CaracteresEspeciaisCodes;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.JoaoDeBarroLogger;


public class JoaoDeBarroLoggerImp implements JoaoDeBarroLogger, CaracteresEspeciaisCodes {
	private String className;
    private Logger logger;
    private static final char dot = '.';
    private static String parentheses = "()";
    private static String colonSeparator = ": ";
    private static String messageSeparator = "\n\t";
    private static String MESSAGE_AMBIENTE_NAO_CONFIGURADO = 
			"Ambiente n" + A_TIL_MINUSCULO + "o configurado";
    
    public JoaoDeBarroLoggerImp( String className, Logger logger ) {
    	this.className = className;
    	this.logger = logger;
    }
    
    
    public void infoInicioDoMetodo( String methodName ) {
    	logger.info( "Dentro de " + className + dot + methodName + parentheses );
    }
    
    
    public void debugInicioDoMetodo( String methodName ) {
    	logger.debug( "Dentro de " + className + dot + methodName + parentheses );
    }
    
    
    public void debug( String methodName, String message, int value ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public void debug( String methodName, String message, Object value ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public void info( String methodName, String message ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public void info( String methodName, String message, Object value ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public void info( String methodName, String message, int intValue ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + intValue );
    }
    
    
    public void debug( String methodName, String message ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public void debug( String methodName, Object object ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator + object.toString() );
    }
    
    
    public void error( String methodName, Exception e ) {
    	logger.error( className + dot + methodName + parentheses, e );
    }
    
    
    public void errorNoConstrutor( Exception e ) {
    	logger.error( className, e );
    }
    
    
    public void warn( String methodName, String message ) {
    	logger.warn( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public void warn( String methodName, String message, Object value ) {
    	logger.warn( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public void warnNotEllectedToRun( String methodName ) {
    	String message = "not ellected to run";
    	warn( methodName, message );
    }
    
    
    public void warnAmbienteNaoConfigurado( String methodName ) {
    	warn( methodName, MESSAGE_AMBIENTE_NAO_CONFIGURADO );
    }
}
