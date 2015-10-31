package br.com.nitrox.joaoDeBarro.common.persistence.dao.javaCode.javaAttributes;

import br.com.nitrox.joaoDeBarro.business.model.JavaAttribute;
import br.com.nitrox.joaoDeBarro.business.model.JavaAttributeTypes;
import br.com.nitrox.joaoDeBarro.business.model.factories.JavaAttributeFactory;

public class DataStagingHpdHelpDeskJavaAttributesJavaCode 
		implements JavaAttributeTypes, JavaAttributeJavaCodeUnit {
	
	public JavaAttribute[] getJavaAttributes() {
		JavaAttribute[] javaAttributeArray = new JavaAttribute[] {
				JavaAttributeFactory.build(
						"ide_hpd_help_desk",
						"ide_remedy_hpd_help_desk",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						false,
						true,
						true,
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
						"entry_id",
						"entry_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						false,
						false,
						false,
						null ),				
						
				JavaAttributeFactory.build(
						"incident_number",
						"incident_number",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						false,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"assignee_login_id",
						"assignee_login_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"assignee",
						"assignee",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),						
						
				JavaAttributeFactory.build(
						"assigned_group",
						"assigned_group",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),

				JavaAttributeFactory.build(
						"submit_date",
						"submit_date",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"last_resolved_date",
						"last_resolved_date",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"closed_date",
						"closed_date",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"status",
						"status",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"department",
						"department",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"description",
						"description",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(256)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"detailed_description",
						"detailed_description",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"text",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"product_categorization_tier_1",
						"product_categorization_tier_1",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"product_categorization_tier_2",
						"product_categorization_tier_2",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"product_categorization_tier_3",
						"product_categorization_tier_3",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"categorization_tier_1",
						"categorization_tier_1",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"categorization_tier_2",
						"categorization_tier_2",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"categorization_tier_3",
						"categorization_tier_3",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"urgency",
						"urgency",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"submitter",
						"submitter",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"ci",
						"ci",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"impact",
						"impact",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"product_name",
						"product_name",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"last_modified_by",
						"last_modified_by",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"last_modified_date",
						"last_modified_date",
						JAVA_ATTRIBUTE_TYPE_DATE,
						"datetime",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"site",
						"site",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"login_id",
						"login_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"company",
						"company",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"assigned_support_organization",
						"assigned_support_organization",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"assigned_support_company",
						"assigned_support_company",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(32)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"first_name",
						"first_name",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"middle_initial",
						"middle_initial",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"last_name",
						"last_name",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"full_name",
						"full_name",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(128)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"corporate_id",
						"corporate_id",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(16)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"service_type",
						"service_type",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"resolution",
						"resolution",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"text",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"priority",
						"priority",
						JAVA_ATTRIBUTE_TYPE_INTEGER_WRAPPER,
						"int",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"closure_product_category_tier_1",
						"closure_product_category_tier_1",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"closure_product_category_tier_2",
						"closure_product_category_tier_2",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"closure_product_category_tier_3",
						"closure_product_category_tier_3",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
						false,
						false,
						null ),
						
				JavaAttributeFactory.build(
						"closure_product_name",
						"closure_product_name",
						JAVA_ATTRIBUTE_TYPE_STRING,
						"VARCHAR(64)",
						true,
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
