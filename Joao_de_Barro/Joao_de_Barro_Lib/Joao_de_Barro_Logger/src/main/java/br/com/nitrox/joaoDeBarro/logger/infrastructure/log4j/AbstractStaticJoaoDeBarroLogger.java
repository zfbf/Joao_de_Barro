package br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j;

import org.apache.log4j.Logger;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.CaracteresEspeciaisCodes;



public abstract class AbstractStaticJoaoDeBarroLogger implements CaracteresEspeciaisCodes {
	private static Logger logger = Logger.getLogger( AbstractStaticJoaoDeBarroLogger.class );
	private static final char dot = '.';
    private static String parentheses = "()";
    private static String colonSeparator = ": ";
    private static String messageSeparator = "\n\t";
    private static String metodoEstatico = "m" + E_AGUDO_MINUSCULO + 
    		"todo est" + A_AGUDO_MINUSCULO + "tico";
    private static int tamBloco = 80;
    private static String delimitadorBloco = "##############################" +
    		"##################################################";
    private static final String HMS_STRING_FORMAT = "%02d:%02d:%02d"; 
    
    
    public static void infoInicioDeBloco( String className ) {
    	StringBuffer sb = new StringBuffer();
    	sb.append( "\n\n" ).append( delimitadorBloco );
    	sb.append( "\n#### " ).append( className ).append( ' ' );
    	int tam = tamBloco - 6 - className.length();
    	
    	for ( int i = 0; i < tam; i++ ) {
			sb.append( '#' );
		}
    	
    	sb.append( '\n' ).append( delimitadorBloco ).append( "\n\n" );
    	logger.info( sb.toString() );
    }
    
    
    public static void infoFinalDeBlocoTempoDecorrido( String className, String methodName, 
    		long inicioExecucao, long finalExecucao ) {
    	int tempoDecorridoEmSegundos = ( int )
    			(( finalExecucao - inicioExecucao ) / 1000 );
    	StringBuffer sb = new StringBuffer();
    	int segundos = tempoDecorridoEmSegundos % 60;
    	int minutos = ( tempoDecorridoEmSegundos / 60 ) % 60;
    	int horas = ( tempoDecorridoEmSegundos / 3600 ) % 60;
    	sb.append( className ).append( '.' ).append( methodName );
    	sb.append( "(), Tempo decorrido: " );
    	sb.append( String.format( HMS_STRING_FORMAT, horas, minutos, segundos ));
    	sb.append( ' ' );
    	String message = sb.toString();
    	
    	sb.append( "\n\n" ).append( delimitadorBloco );
    	sb.append( "\n#### " ).append( message );
    	int tam = tamBloco - 6 - message.length() + 1;
    	
    	for ( int i = 0; i < tam; i++ ) {
			sb.append( '#' );
		}
    	
    	sb.append( '\n' ).append( delimitadorBloco ).append( "\n\n" );
    	logger.info( sb.toString() );
    }
    
    
    public static void infoAmbiente( String className, String methodName ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator +
    			"ambiente: " + Ambiente.getInstance() );
    }
    
    
    public static void infoInicioDoMetodo( String className, String methodName ) {
    	logger.info( "Dentro do " + metodoEstatico + " " + className + dot + 
    			methodName + parentheses );
    }
    
    
    public static void debugInicioDoMetodo( String className, String methodName ) {
    	logger.debug( "Dentro do " + metodoEstatico + " " + className + dot +
    			methodName + parentheses );
    }
    
    
    public static void debug( String className, String methodName, String message, int value ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public static void debug( String className, String methodName, String message, Object value ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public static void info( String className, String methodName, String message ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public static void info( String className, String methodName, String message, Object value ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public static void info( String className, String methodName, String message, int intValue ) {
    	logger.info( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + intValue );
    }
    
    
    public static void debug( String className, String methodName, String message ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public static void debug( String className, String methodName, Object object ) {
    	logger.debug( className + dot + methodName + parentheses + messageSeparator + object.toString() );
    }
    
    
    public static void error( String className, String methodName, Exception e ) {
    	logger.error( className + dot + methodName + parentheses, e );
    }
    
    
    public static void warn( String className, String methodName, String message ) {
    	logger.warn( className + dot + methodName + parentheses + messageSeparator + message );
    }
    
    
    public static void warn( String className, String methodName, String message, Object value ) {
    	logger.warn( className + dot + methodName + parentheses + messageSeparator +
    			message + colonSeparator + value );
    }
    
    
    public static void warnNotEllectedToRun( String className, String methodName ) {
    	String message = "not ellected to run";
    	warn( className, methodName, message );
    }
    
    
    public static void warnAmbienteNaoConfigurado( String className, String methodName ) {
    	String message = "Ambiente n" + A_TIL_MINUSCULO + "o configurado";
    	warn( className, methodName, message );
    }
    
}
