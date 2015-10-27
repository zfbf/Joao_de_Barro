package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class DataStagingHpdAuditLogSystemJavaAttributeJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build(
						"ide_audit_log_system",
						"ide_remedy_hpd_audit_log_system",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						true,
						true,
						null ),
						
				JavaAttributeFactory.build(
						"entry_id",
						"entry_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						false,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"original_request_id",
						"original_request_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"submiter",
						"des_submiter",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"audit_user",
						"des_audit_user",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),						
						
				JavaAttributeFactory.build(
						"create_date",
						"create_date",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"log",
						"des_log",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(512)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"fields_changed",
						"des_fields_changed",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(128)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ide_carga_gps",
						"ide_cga_gps",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"ide_status_carga",
						"ide_status_carga",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null )
		};
		
		return javaAttributeArray;
	}
	
}
