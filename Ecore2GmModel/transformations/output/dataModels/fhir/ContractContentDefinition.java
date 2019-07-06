/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractContentDefinition of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link type}, 
{@link subType}, 
{@link publisher}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getSubType},
{@link getPublisher},
{@link setType},
{@link setSubType},
{@link setPublisher},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractContentDefinition extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractContentDefinition> T = EntityTypes.T(ContractContentDefinition.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String subType = "subType";
	java.lang.String publisher = "publisher";

	@Description("Precusory content structure and use, i.e., a boilerplate, template, application for a contract such as an insurance policy or benefits under a program, e.g., workers compensation.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Detailed Precusory content type.")
	@Mandatory
	fhir.CodeableConcept getSubType();
	void setSubType(fhir.CodeableConcept subType);
	@Description("The  individual or organization that published the Contract precursor content.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPublisher();
	void setPublisher(com.braintribe.model.generic.GenericEntity publisher);
}
