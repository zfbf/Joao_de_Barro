package br.com.nitrox.joaoDeBarro.common.business.services.generators;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;

import br.com.nitrox.joaoDeBarro.ambiente.infrastructure.Ambiente;
import br.com.nitrox.joaoDeBarro.business.model.JavaEntity;
import br.com.nitrox.joaoDeBarro.logger.infrastructure.log4j.AbstractJoaoDeBarroLogger;

public class JoaoDeBarroVelocityEngine extends AbstractJoaoDeBarroLogger
		implements JoaoDeBarroVelocityConstants {
	private static JoaoDeBarroVelocityEngine instance;
	private VelocityContext velocityContext;
	private Writer writer;
	private HashMap<Integer, Template> templates;
	
	private JoaoDeBarroVelocityEngine() {
		templates = new HashMap<Integer, Template>();
		initVelocityContext();
		initWriter();
	}
	
	
	private void initVelocityContext() {
		Properties p = new Properties();
		p.setProperty( "directive.foreach.counter.name", "velocityCount" );
		p.setProperty( "directive.foreach.counter.initial.value", "0" );
		p.setProperty( "file.resource.loader.path", Ambiente.getInstance().getWorkDir() );
		
		Velocity.init( p );
		this.velocityContext = new VelocityContext();
	}
	
	
	private void initWriter() {
		/*
		this.writer = new BufferedWriter( 
				new OutputStreamWriter( System.out ));
		 */
		
		this.writer = new StringWriter();
	}
	
	
	public static JoaoDeBarroVelocityEngine getInstance() {
		if ( instance == null ) {
			instance = new JoaoDeBarroVelocityEngine();
		}
		
		return instance;
	}
	
	
	public Writer getWriter() {
		return writer;
	}
	
	
	public void setWriter( Writer writer ) {
		this.writer = writer;
	}
	
	
	public void resetWriter() {
		this.writer = new StringWriter();
	}
	
	
	public VelocityContext getVelocityContext() {
		return velocityContext;
	}
	
	
	public void flush() throws IOException {
		getWriter().flush();
	}
	
	
	public Template getTemplate( int templateCode ) throws ResourceNotFoundException {
		String methodName = "getTemplate";
		Template template = null;
		
		try {
			Integer key = Integer.valueOf( templateCode );
			
			if ( templates.containsKey( key )) {
				template = templates.get( key );
			} else {
				template = Velocity.getTemplate( "resources/vm/" + 
						getTemplateName( templateCode ));
				templates.put( key, template );
			}
		} catch ( ResourceNotFoundException e  ) {
			debug( methodName, "templateCode", templateCode );
			error( methodName, e );
			throw e;
		}
		
		return template; 
	}
	
	
	public void runTemplate( int templateCode ) throws ResourceNotFoundException {
		String methodName = "runTemplate";
		debugInicioDoMetodo( methodName );
		
		Template template = getTemplate( templateCode );
		template.merge( getVelocityContext(), getWriter() );
	}
	
	
	public void runTemplate( int templateCode, JavaEntity javaEntity ) 
			throws ResourceNotFoundException {
		String methodName = "runTemplate";
		debugInicioDoMetodo( methodName );
		
		Template template = getTemplate( templateCode );
		getVelocityContext().put( "java_entity", javaEntity );
		template.merge( getVelocityContext(), getWriter() );
	}
	
	
	public void putInContext( String key, Object value ) {
		String methodName = "putInContext";
		debugInicioDoMetodo( methodName );
		debug( methodName, "key", key );
		
		getVelocityContext().put( key, value );
	}
	
	
	private String getTemplateName( int templateCode ) {
		String templateName = null;
		
		switch ( templateCode ) {
		case TEMPLATE_TO_STRING_METHOD:
			templateName = "java/fragments/toString_method.vm";
			break;
			
		case TEMPLATE_CLASS_OPENING:
			templateName = "java/fragments/class_opening.vm";
			break;
			
		case TEMPLATE_ATTRIBUTE_DECLARATIONS:
			templateName = "java/fragments/attribute_declaration.vm";
			break;
			
		case TEMPLATE_COMMON_SET_METHOD:
			templateName = "java/set_methods/common_set_method.vm";
			break;
			
		case TEMPLATE_FLOAT_WRAPPER_SET_METHOD:
			templateName = "java/set_methods/float_wrapper_set_method.vm";
			break;
			
		case TEMPLATE_INTEGER_WRAPPER_SET_METHOD:
			templateName = "java/set_methods/integer_wrapper_set_method.vm";
			break;
			
		case TEMPLATE_COMMON_GET_METHOD:
			templateName = "java/get_methods/common_get_method.vm";
			break;
			
		case TEMPLATE_DATE_GET_METHOD:
			templateName = "java/get_methods/date_get_method.vm";
			break;
			
		case TEMPLATE_MAVEN_MODULE_CREATE_WORKSPACE_DIRECTORIES:
			templateName = "create_workspace_directories.vm";
			break;
			
		case TEMPLATE_MAVEN_MODULE_DELIVERY_TO_VERSION_CONTROL_DIR:
			templateName = "delivery_to_version_control_dir.vm";
			break;
			
		case TEMPLATE_MAVEN_MODULE_DELIVERY_TO_WORKSPACE:
			templateName = "delivery_to_workspace.vm";
			break;
			
		case TEMPLATE_MAVEN_MODULE_UPDATE_FROM_VERSION_CONTROL_DIR:
			templateName = "update_from_version_control_dir.vm";
			break;
			
		case TEMPLATE_MAVEN_MODULE_UPDATE_FROM_WORKSPACE:
			templateName = "update_from_workspace.vm";
			break;
			
		case TEMPLATE_SQL_SQLSERVER_INSERT_STOREDPROCEDURE:
			templateName = "sql/sqlServer/stored_procedures/insert.vm";
			break;
			
		case TEMPLATE_DAO_ANSISQL99_CREATE_METHOD:
			templateName = "java/persistence/dao/ansiSql99/create_method.vm";
			break;
			
		case TEMPLATE_DAO_ANSISQL99_UPDATE_METHOD:
			templateName = "java/persistence/dao/ansiSql99/update_method.vm";
			break;
			
		case TEMPLATE_DAO_ANSISQL99_RETRIEVE_METHOD:
			templateName = "java/persistence/dao/ansiSql99/retrieve_method.vm";
			break;
			
		case TEMPLATE_DAO_ANSISQL99_TRUNCATE_METHOD:
			templateName = "java/persistence/dao/ansiSql99/truncate_method.vm";
			break;
			
		case TEMPLATE_ATTRIBUTE_CLONE:
			templateName = "java/fragments/attribute_clone.vm";
			break;
			
		default:
			break;
		}
		
		return templateName;
	}
	
}
